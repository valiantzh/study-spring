package com.hzdongcheng.persistent.dao.common;

import javax.sql.RowSet;

import com.hzdongcheng.toolkits.EduException;
import com.hzdongcheng.toolkits.db.PreparedWhereExpression;
import com.hzdongcheng.persistent.entity.MBDepartment;
import com.hzdongcheng.persistent.entity.OPOperOnline;
import com.hzdongcheng.persistent.entity.OPOperatorLog;

public interface CommonDAO {
    /**
     * 判断操作员是否在线
     * 
     * @param OperID
     *            String
     * @return OPOperOnline
     * @throws EduException
     */
    public OPOperOnline isOnline(String OperID) throws EduException;

    /**
     * 记录操作员日志
     * 
     * @param log
     *            OPOperatorLog
     * @return long
     * @throws EduException
     */
    public long addOperatorLog(OPOperatorLog log) throws EduException;

    /**
     * 修改操作员在线信息
     * 
     * @param operOnline
     *            OPOperOnline
     * @return boolean
     * @throws EduException
     */
    public boolean modifyOperOnline(OPOperOnline operOnline) throws EduException;

    /**
     * 生成管理员编号
     * 
     * @return String
     * @throws EduException
     */
    public String getInnerUserID() throws EduException;

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
    public RowSet operMenuQry(String OperID, String ModuleID) throws EduException;

    /**
     * 
     * @Title: setDepartLevel
     * @Description: TODO(营业网点级别设置)
     * @param obj
     * @param objParent
     */
    void setDepartLevel(MBDepartment obj, MBDepartment objParent);

    /**
     * 指定表中取某列的值（过滤重复值）
     * 
     * @param tableName
     * @param fName
     * @param whereSQL
     * @return
     * @throws EduException
     */
    public java.util.Set<String> selectFieldByGroup(String tableName, String fName, PreparedWhereExpression whereSQL)
            throws EduException;
    
    
}