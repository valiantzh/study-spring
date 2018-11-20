package com.hzdongcheng.persistent.dao.common.impl;

import java.util.Set;

import javax.sql.RowSet;

import org.apache.commons.logging.Log;

import com.hzdongcheng.toolkits.EduException;
import com.hzdongcheng.toolkits.db.DBSession;
import com.hzdongcheng.toolkits.db.JDBCFieldArray;
import com.hzdongcheng.toolkits.db.LocalSessionHolder;
import com.hzdongcheng.toolkits.db.PreparedWhereExpression;
import com.hzdongcheng.toolkits.db.RowSetUtils;
import com.hzdongcheng.toolkits.db.dao.UtilDAO;
import com.hzdongcheng.toolkits.utils.DateUtils;
import com.hzdongcheng.toolkits.utils.NumberUtils;
import com.hzdongcheng.toolkits.utils.StringUtils;
import com.hzdongcheng.persistent.constant.ControlParam;
import com.hzdongcheng.persistent.dao.OPOperOnlineDAO;
import com.hzdongcheng.persistent.dao.OPOperatorDAO;
import com.hzdongcheng.persistent.dao.OPOperatorLogDAO;
import com.hzdongcheng.persistent.dao.common.CommonDAO;
import com.hzdongcheng.persistent.dao.factory.DAOFactory;
import com.hzdongcheng.persistent.entity.MBDepartment;
import com.hzdongcheng.persistent.entity.OPOperOnline;
import com.hzdongcheng.persistent.entity.OPOperatorLog;
import com.hzdongcheng.persistent.sequence.SequenceGenerator;

public class CommonDAOImpl implements CommonDAO {
    @SuppressWarnings("unused")
    private static Log log = org.apache.commons.logging.LogFactory.getLog(CommonDAOImpl.class);

    protected DBSession dbSession = LocalSessionHolder.getCurrentDBSession();
    protected DAOFactory daoFactory = DAOFactory.getDAOFactory(dbSession.getDatabaseType());
    protected UtilDAO utilDAO = daoFactory.getUtilDAO();

    // 常用对象
    protected UtilDAO getUtilDAO() {
        return daoFactory.getUtilDAO();
    }

    protected CommonDAO getCommonDAO() {
        return daoFactory.getCommonDAO();
    }

    protected DBSession getCurrentDBSession() {
        return LocalSessionHolder.getCurrentDBSession();
    }

    /**
     * 判断操作员是否在线
     * 
     * @param OperID
     *            String
     * @return OPOperOnline
     * @throws EduException
     */
    public OPOperOnline isOnline(String OperID) throws EduException {
        OPOperOnline result = new OPOperOnline();
        /*OPOperOnlineDAO operOnlineDAO = daoFactory.getOPOperOnlineDAO();

        result.OperID = OperID;
        try {
            result = operOnlineDAO.find(result);

            //检查online状态 和invalidSession冲突
            if (!result.OnlineStatus.equals("1"))
                throw new EduException(ErrorCode.ERR_OPERNOLOGIN);
        } catch (EduException e) {
            if (ErrorCode.ERR_OPOPERONLINENODATA.equalsIgnoreCase(e.getMessage()))
                throw new EduException(ErrorCode.ERR_OPERNOLOGIN);
            else
                throw e;
        }*/

        return result;
    }

    /**
     * 记录操作员日志
     * 
     * @param log
     *            OPOperatorLog
     * @return long
     * @throws EduException
     */
    public long addOperatorLog(OPOperatorLog log) throws EduException {
        OPOperatorLogDAO logDAO = daoFactory.getOPOperatorLogDAO();

        SequenceGenerator seqGen = SequenceGenerator.getInstance();
        log.OperLogID = seqGen.getNextKey(SequenceGenerator.SEQ_OPERLOGID);
        if (log.OccurTime == null) {
            java.sql.Timestamp sysDateTime = utilDAO.getCurrentDateTime();
            log.OccurTime = sysDateTime;
        }

        log.OccurDate = DateUtils.toSQLDate(log.OccurTime);

        logDAO.insert(log);

        return log.OperLogID;
    }

    /**
     * 修改操作员在线信息
     * 
     * @param operOnline
     *            OPOperOnline
     * @return boolean
     * @throws EduException
     */
    public boolean modifyOperOnline(OPOperOnline operOnline) throws EduException {
        boolean isSameLogin = true;

        OPOperOnlineDAO onlineDAO = daoFactory.getOPOperOnlineDAO();

        // ????
        // operOnline.DefaultOperID = operOnline.OperID;
        // operOnline.OnlineStatus = "1";

        if (onlineDAO.isExist(operOnline) == false) {
            operOnline.LastLoginTime = operOnline.LoginInTime;
            operOnline.LastLoginIP = operOnline.LoginIPAddr;
            operOnline.PreVersion = ControlParam.getInstance().currentVersion;
            operOnline.CurrentVersion = ControlParam.getInstance().currentVersion;

            onlineDAO.insert(operOnline);
        } else {
            OPOperOnline lastOperOnline = new OPOperOnline();
            lastOperOnline.OperID = operOnline.OperID;
            lastOperOnline = onlineDAO.find(lastOperOnline);

            JDBCFieldArray setCols = new JDBCFieldArray();

            setCols.add("OperType", operOnline.OperType);

            setCols.add("OnlineStatus", operOnline.OnlineStatus);

            if (operOnline.LoginInTime != null)
                setCols.add("LoginInTime", operOnline.LoginInTime);
            if (operOnline.LoginOutTime != null)
                setCols.add("LoginOutTime", operOnline.LoginOutTime);
            if (StringUtils.isNotEmpty(operOnline.NetCardAddr))
                setCols.add("NetCardAddr", operOnline.NetCardAddr);
            if (StringUtils.isNotEmpty(operOnline.LoginIPAddr))
                setCols.add("LoginIPAddr", operOnline.LoginIPAddr);
            if (operOnline.LastQueryTime != null)
                setCols.add("LastQueryTime", operOnline.LastQueryTime);

            setCols.add("LastLoginTime", lastOperOnline.LoginInTime);
            setCols.add("LastLoginIP", lastOperOnline.LoginIPAddr);
            setCols.add("LoginTerminal", lastOperOnline.LoginTerminal);

            if ("12".equals(operOnline.LoginTerminal)) {
                operOnline.CurrentClientVersion = ControlParam.getInstance().currentVersion;

                setCols.add("PreClientVession", operOnline.PreClientVession);
                setCols.add("CurrentClientVersion", operOnline.CurrentClientVersion);
            } else {
                setCols.add("PreVersion", lastOperOnline.CurrentVersion);
                setCols.add("CurrentVersion", ControlParam.getInstance().currentVersion);
            }

            JDBCFieldArray whereCols = new JDBCFieldArray();
            whereCols.add("OperID", operOnline.OperID);

            onlineDAO.update(setCols, whereCols);

            if (!lastOperOnline.LoginIPAddr.equalsIgnoreCase(operOnline.LoginIPAddr))
                isSameLogin = false;
        }

        // 设置查询最新时间

        return isSameLogin;
    }

    /**
     * 生成管理员编号
     * 
     * @return String
     * @throws EduException
     */
    public String getInnerUserID() throws EduException {
        String operid = "";

        OPOperatorDAO operDAO = daoFactory.getOPOperatorDAO();
        operid = operDAO.selectFunctions("MAX(OperID)", null);

        if (StringUtils.isEmpty(operid) || operid.length() < 10) {
            operid = "1934554321";
        } else {
            operid = String.valueOf(NumberUtils.parseLong(operid) + 1);
        }

        return operid;
    }

    /**
     * 操作员菜单信息查询
     * 
     * @param OperID
     *            String
     * @param ModuleID
     *            String
     * @return RowSet
     * @throws EduException
     */
    public RowSet operMenuQry(String OperID, String ModuleID) throws EduException {
        RowSet rset = null;

        String whereSQL = "";
        if (StringUtils.isNotEmpty(ModuleID))
            whereSQL = " AND a.MenuID like " + StringUtils.leftQuote(ModuleID) + "%'";

        String sql = "SELECT " + " a.OperID," + " b.MenuID," + " b.MenuName," + " b.MenuLevel," + " b.MenuEngName,"
                + " b.Description," + " b.Action," + " b.HotKey," + " b.Icon," + " b.HelpContext," + " b.MenuType,"
                + " b.LeafFlag," + " b.Remark" + " FROM OPOperToMenu a,OPMenu b" + " WHERE a.OperID = "
                + StringUtils.addQuote(OperID) + whereSQL + " AND b.MenuID = a.MenuID";

        sql = sql + " ORDER BY b.MenuID,b.MenuLevel";

        rset = dbSession.executeQuery(sql);

        return rset;
    }

    

    /**
     * 
     * @Title: setDepartLevel
     * @Description: TODO(营业网点级别设置)
     * @param obj
     * @param objParent
     */
    public void setDepartLevel(MBDepartment obj, MBDepartment objParent) {
        obj.Level1 = StringUtils.isNotEmpty(objParent.Level1) ? objParent.Level1 : "";
        obj.Level2 = StringUtils.isNotEmpty(objParent.Level2) ? objParent.Level2 : "";
        obj.Level3 = StringUtils.isNotEmpty(objParent.Level3) ? objParent.Level3 : "";
        ;
        obj.Level4 = StringUtils.isNotEmpty(objParent.Level4) ? objParent.Level4 : "";
        obj.Level5 = StringUtils.isNotEmpty(objParent.Level5) ? objParent.Level5 : "";
        obj.Level6 = StringUtils.isNotEmpty(objParent.Level6) ? objParent.Level6 : "";

        if (obj.DepartLevel == 1)
            obj.Level1 = obj.DepartmentID;
        else if (obj.DepartLevel == 2)
            obj.Level2 = obj.DepartmentID;
        else if (obj.DepartLevel == 3)
            obj.Level3 = obj.DepartmentID;
        else if (obj.DepartLevel == 4)
            obj.Level4 = obj.DepartmentID;
        else if (obj.DepartLevel == 5)
            obj.Level5 = obj.DepartmentID;
        else if (obj.DepartLevel == 6)
            obj.Level6 = obj.DepartmentID;
    }

    /*
     * 指定表中取某列的值（过滤重复值）
     * @param tableName
     * @param fName
     * @param whereSQL
     * @return
     * @throws EduException
     */
    @Override
    public Set<String> selectFieldByGroup(String tableName, String fName, PreparedWhereExpression whereSQL)
            throws EduException {
        java.util.Set<String> resSet = new java.util.HashSet<>();
        if(whereSQL == null){
            whereSQL = new PreparedWhereExpression();
        }
        
        String sql = "SELECT a." + fName + " FROM  "+ tableName+" a WHERE 1=1";
        
        String groupby = " GROUP BY " +fName;
        sql = sql + whereSQL.getPreparedWhereSQL() + groupby;

        RowSet rset = dbSession.executeQuery(sql, whereSQL);
        while(RowSetUtils.rowsetNext(rset)){
            resSet.add(RowSetUtils.getStringValue(rset, 1));//""+fName
        }
        return resSet;
    }
}
