package com.hzdongcheng.persistent.dao.impl;

import java.sql.*;
import javax.sql.RowSet;
import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.hzdongcheng.toolkits.EduException;
import com.hzdongcheng.toolkits.db.*;
import com.hzdongcheng.toolkits.db.dao.*;
import com.hzdongcheng.toolkits.utils.*;

import com.hzdongcheng.persistent.dao.*;
import com.hzdongcheng.persistent.dao.factory.*;
import com.hzdongcheng.persistent.entity.*;
import com.hzdongcheng.persistent.constant.*;

@SuppressWarnings("unused")
public class OPOperatorLogDAOImpl implements OPOperatorLogDAO {

    private static final Log log = LogFactory.getLog(OPOperatorLogDAOImpl.class.getName());

    private DBSession dbSession = LocalSessionHolder.getCurrentDBSession();

    private Connection conn = dbSession.getConnection();

    private static final int RSET_FETCH_SIZE = 50;


    public int insert(OPOperatorLog obj) throws EduException
    {
        PreparedStatement pstmt = null;
        int result = 0;

        String sql = "INSERT INTO OPOperatorLog(OperLogID,FunctionID,OperID,OperType,TerminalNo,OccurDate,OccurTime,StationAddr,Remark)VALUES(?,?,?,?,?,?,?,?,?)";

        SQLLog.logInsert(log, obj);

        try
        {
            pstmt = conn.prepareStatement(sql);
            PreparedStmtUtils.setLong(pstmt,1,obj.OperLogID);
            PreparedStmtUtils.setString(pstmt,2,obj.FunctionID);
            PreparedStmtUtils.setString(pstmt,3,obj.OperID);
            PreparedStmtUtils.setInt(pstmt,4,obj.OperType);
            PreparedStmtUtils.setString(pstmt,5,obj.TerminalNo);
            PreparedStmtUtils.setDate(pstmt,6,obj.OccurDate);
            PreparedStmtUtils.setTimestamp(pstmt,7,obj.OccurTime);
            PreparedStmtUtils.setString(pstmt,8,obj.StationAddr);
            PreparedStmtUtils.setString(pstmt,9,obj.Remark);
            result = pstmt.executeUpdate();

        }
        catch(SQLException e)
        {
            String errorCode = ErrorCode.ERR_ADDOPOPERATORLOGFAIL;
            log.error("[DBERROR-("+ errorCode + ")]==>[sqlcode]:"+e.getErrorCode() + " [errmsg]:"+e.getMessage() + " [sql]:"+sql);
            throw new EduException(errorCode);
        }
        finally
        {
            dbSession.closeStatement(pstmt);
        }

        return result;
    }


    public int update(JDBCFieldArray setCols,JDBCFieldArray whereCols) throws EduException
    {
        PreparedStatement pstmt = null;
        int result = 0;

        String sql = "UPDATE OPOperatorLog SET ";

        StringBuffer sbSet = new StringBuffer(256);
        sbSet.append(setCols.toSetSQL());
        StringBuffer sbWhere = new StringBuffer(256);
        if(whereCols != null){
            sbWhere.append(whereCols.toWhereSQL());
        }

        sql = sql + sbSet.toString() + " WHERE 1=1 " + sbWhere.toString();

        SQLLog.logUpdate(log,"OPOperatorLog",setCols,whereCols);

        try
        {
            pstmt = conn.prepareStatement(sql);
            
            int parameterIndex = 0;
            for(int i = 0 ; i < setCols.size() ; i++){
                if(setCols.get(i).name != null){
                    parameterIndex++;
                    PreparedStmtUtils.setObject(pstmt,parameterIndex,setCols.get(i));
                }
            }
            
            if(whereCols != null){
                for(int j = 0 ; j < whereCols.size() ; j++){
                    if(whereCols.get(j).name != null){
                        parameterIndex++;
                        PreparedStmtUtils.setObject(pstmt,parameterIndex,whereCols.get(j));
                    }
                }
            }
            
            result = pstmt.executeUpdate();

        }
        catch(SQLException e)
        {
            String errorCode = ErrorCode.ERR_MODOPOPERATORLOGFAIL;
            log.error("[DBERROR-("+ errorCode + ")]==>[sqlcode]:"+e.getErrorCode() + " [errmsg]:"+e.getMessage() + " [sql]:"+sql);
            throw new EduException(errorCode);
        }
        finally
        {
            dbSession.closeStatement(pstmt);
        }

        return result;
    }


    public int delete(OPOperatorLog obj) throws EduException
    {
        PreparedStatement pstmt = null;
        int result = 0;

        String sql = "DELETE FROM OPOperatorLog WHERE OperLogID = ? ";

        log.debug("[delete sql]:" + "DELETE FROM OPOperatorLog WHERE OperLogID = " + obj.OperLogID );

        try
        {
            pstmt = conn.prepareStatement(sql);
            PreparedStmtUtils.setLong(pstmt,1,obj.OperLogID);
            result = pstmt.executeUpdate();

        }
        catch(SQLException e)
        {
            String errorCode = ErrorCode.ERR_DELOPOPERATORLOGFAIL;
            log.error("[DBERROR-("+ errorCode + ")]==>[sqlcode]:"+e.getErrorCode() + " [errmsg]:"+e.getMessage() + " [sql]:"+sql);
            throw new EduException(errorCode);
        }
        finally
        {
            dbSession.closeStatement(pstmt);
        }

        return result;
    }


    public int delete(JDBCFieldArray whereCols) throws EduException
    {
        PreparedStatement pstmt = null;
        int result = 0;

        String sql = "DELETE FROM OPOperatorLog WHERE 1=1 " ;

        StringBuffer sbWhere = new StringBuffer(256);
        if(whereCols != null)
        {
            sbWhere.append(whereCols.toWhereSQL());
        }

        sql = sql + sbWhere.toString();

        SQLLog.logDelete(log,"OPOperatorLog",whereCols);

        try
        {
            pstmt = conn.prepareStatement(sql);
            
            int parameterIndex = 0;
            if(whereCols != null){
                for(int j = 0 ; j < whereCols.size() ; j++){
                    if(whereCols.get(j).name != null){
                        parameterIndex++;
                        PreparedStmtUtils.setObject(pstmt,parameterIndex,whereCols.get(j));
                    }
                }
            }
            
            result = pstmt.executeUpdate();

        }
        catch(SQLException e)
        {
            String errorCode = ErrorCode.ERR_DELOPOPERATORLOGFAIL;
            log.error("[DBERROR-("+ errorCode + ")]==>[sqlcode]:"+e.getErrorCode() + " [errmsg]:"+e.getMessage() + " [sql]:"+sql);
            throw new EduException(errorCode);
        }
        finally
        {
            dbSession.closeStatement(pstmt);
        }

        return result;
    }


    public boolean isExist(OPOperatorLog obj) throws EduException
    {
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        int count = 0;

        String sql = "SELECT COUNT(*) FROM OPOperatorLog WHERE OperLogID = ? ";

        log.debug("[isExist sql]:" + "SELECT COUNT(*) FROM OPOperatorLog WHERE OperLogID = " + obj.OperLogID );

        try
        {
            pstmt = conn.prepareStatement(sql);
            PreparedStmtUtils.setLong(pstmt,1,obj.OperLogID);
            rset = pstmt.executeQuery();

            rset.next();
            count = rset.getInt(1);
        }
        catch(SQLException e)
        {
            String errorCode = ErrorCode.ERR_QRYOPOPERATORLOGFAIL;
            log.error("[DBERROR-("+ errorCode + ")]==>[sqlcode]:"+e.getErrorCode() + " [errmsg]:"+e.getMessage() + " [sql]:"+sql);
            throw new EduException(errorCode);
        }
        finally
        {
            dbSession.closeResultSet(rset);
            dbSession.closeStatement(pstmt);
        }

        return (count > 0) ? true : false;
    }


    public int isExist(JDBCFieldArray whereCols) throws EduException
    {
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        int count = 0;

        String sql = "SELECT COUNT(*) FROM OPOperatorLog WHERE 1=1 " ;

        StringBuffer sbWhere = new StringBuffer(256);
        if(whereCols != null)
        {
            sbWhere.append(whereCols.toWhereSQL());
        }

        sql = sql + sbWhere.toString();

        SQLLog.logIsExist(log,"OPOperatorLog",whereCols);

        try
        {
            pstmt = conn.prepareStatement(sql);
            
            int parameterIndex = 0;
            if(whereCols != null){
                for(int j = 0 ; j < whereCols.size() ; j++){
                    if(whereCols.get(j).name != null){
                        parameterIndex++;
                        PreparedStmtUtils.setObject(pstmt,parameterIndex,whereCols.get(j));
                    }
                }
            }
            
            rset = pstmt.executeQuery();

            rset.next();
            count = rset.getInt(1);
        }
        catch(SQLException e)
        {
            String errorCode = ErrorCode.ERR_QRYOPOPERATORLOGFAIL;
            log.error("[DBERROR-("+ errorCode + ")]==>[sqlcode]:"+e.getErrorCode() + " [errmsg]:"+e.getMessage() + " [sql]:"+sql);
            throw new EduException(errorCode);
        }
        finally
        {
            dbSession.closeResultSet(rset);
            dbSession.closeStatement(pstmt);
        }

        return count;
    }


    public OPOperatorLog find(OPOperatorLog obj) throws EduException
    {
        OPOperatorLog result = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String sql = "SELECT OperLogID,FunctionID,OperID,OperType,TerminalNo,OccurDate,OccurTime,StationAddr,Remark  FROM OPOperatorLog WHERE OperLogID = ? ";

        log.debug("[find sql]:" + "SELECT OperLogID,FunctionID,OperID,OperType,TerminalNo,OccurDate,OccurTime,StationAddr,Remark  FROM OPOperatorLog WHERE OperLogID = " + obj.OperLogID );

        try
        {
            pstmt = conn.prepareStatement(sql);
            PreparedStmtUtils.setLong(pstmt,1,obj.OperLogID);
            rset = pstmt.executeQuery();

            if(rset.next() == true)
            {
                result = new OPOperatorLog();
                result.OperLogID = rset.getLong(1);
                result.FunctionID = rset.getString(2);
                result.OperID = rset.getString(3);
                result.OperType = rset.getInt(4);
                result.TerminalNo = rset.getString(5);
                result.OccurDate = rset.getDate(6);
                result.OccurTime = rset.getTimestamp(7);
                result.StationAddr = rset.getString(8);
                result.Remark = rset.getString(9);

            }
            else
            {
                throw new EduException(ErrorCode.ERR_OPOPERATORLOGNODATA);
            }
        }
        catch(SQLException e)
        {
            String errorCode = ErrorCode.ERR_QRYOPOPERATORLOGFAIL;
            log.error("[DBERROR-("+ errorCode + ")]==>[sqlcode]:"+e.getErrorCode() + " [errmsg]:"+e.getMessage() + " [sql]:"+sql);
            throw new EduException(errorCode);
        }
        finally
        {
            dbSession.closeResultSet(rset);
            dbSession.closeStatement(pstmt);
        }

        return result;
    }


    public RowSet select(JDBCFieldArray whereCols) throws EduException
    {
        RowSet cacheSet = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String sql = "SELECT * FROM OPOperatorLog WHERE 1=1 ";
        SQLLog.logSelectRowSet(log,sql,whereCols);

        StringBuffer sbWhere = new StringBuffer(256);
        if(whereCols != null)
        {
            sbWhere.append(whereCols.toWhereSQL());
        }

        sql = sql + sbWhere.toString();

        try
        {
            pstmt = conn.prepareStatement(sql);
            
            int parameterIndex = 0;
            if(whereCols != null){
                for(int j = 0 ; j < whereCols.size() ; j++){
                    if(whereCols.get(j).name != null){
                        parameterIndex++;
                        PreparedStmtUtils.setObject(pstmt,parameterIndex,whereCols.get(j));
                    }
                }
            }
            
            rset = pstmt.executeQuery();

            rset.setFetchSize(RSET_FETCH_SIZE);

            cacheSet = dbSession.populate(rset);
        }
        catch(SQLException e)
        {
            String errorCode = ErrorCode.ERR_QRYOPOPERATORLOGFAIL;
            log.error("[DBERROR-("+ errorCode + ")]==>[sqlcode]:"+e.getErrorCode() + " [errmsg]:"+e.getMessage() + " [sql]:"+sql);
            throw new EduException(errorCode);
        }
        finally
        {
            dbSession.closeResultSet(rset);
            dbSession.closeStatement(pstmt);
        }

        return cacheSet;
    }


    public RowSet select(JDBCFieldArray whereCols,List<String> orderCols) throws EduException
    {
        RowSet cacheSet = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String sql = "SELECT * FROM OPOperatorLog WHERE 1=1 ";
        StringBuffer sbWhere = new StringBuffer(256);
        if(whereCols != null)
        {
            sbWhere.append(whereCols.toWhereSQL());
        }

        StringBuffer sbOrder = new StringBuffer(256);
        if(orderCols != null && orderCols.size() > 0)
        {
            sbOrder.append(" ORDER BY ");
            for(int j = 0 ; j < orderCols.size() ; j++)
            {
                sbOrder.append(orderCols.get(j));
                if(j != (orderCols.size() - 1))
                    sbOrder.append(",");
            }
        }

        sql = sql + sbWhere.toString() + sbOrder.toString();

        SQLLog.logSelectRowSet(log,sql,whereCols);

        try
        {
            pstmt = conn.prepareStatement(sql);
            
            int parameterIndex = 0;
            if(whereCols != null){
                for(int j = 0 ; j < whereCols.size() ; j++){
                    if(whereCols.get(j).name != null){
                        parameterIndex++;
                        PreparedStmtUtils.setObject(pstmt,parameterIndex,whereCols.get(j));
                    }
                }
            }
            
            rset = pstmt.executeQuery();

            rset.setFetchSize(RSET_FETCH_SIZE);

            cacheSet = dbSession.populate(rset);
        }
        catch(SQLException e)
        {
            String errorCode = ErrorCode.ERR_QRYOPOPERATORLOGFAIL;
            log.error("[DBERROR-("+ errorCode + ")]==>[sqlcode]:"+e.getErrorCode() + " [errmsg]:"+e.getMessage() + " [sql]:"+sql);
            throw new EduException(errorCode);
        }
        finally
        {
            dbSession.closeResultSet(rset);
            dbSession.closeStatement(pstmt);
        }

        return cacheSet;
    }


    public RowSet select(JDBCFieldArray whereCols,int recordBegin,int recordNum) throws EduException
    {
        RowSet cacheSet = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        String sql = "SELECT * FROM  OPOperatorLog WHERE 1=1 ";

        StringBuffer sbWhere = new StringBuffer(256);
        if(whereCols != null)
        {
            sbWhere.append(whereCols.toWhereSQL());
        }

        sql = sql + sbWhere.toString();

        java.util.List<String> list = new java.util.LinkedList<String>();
        list.add("OperLogID");

        DAOFactory daoFactory = DAOFactory.getDAOFactory(dbSession.getDatabaseType());
        UtilDAO utilDAO = daoFactory.getUtilDAO();
        sql = utilDAO.constructNMSql(sql,list,recordBegin,recordNum);

        log.debug("[RowSet sql]:" + sql );

        try
        {
            pstmt = conn.prepareStatement(sql);
            
            int parameterIndex = 0;
            if(whereCols != null){
                for(int j = 0 ; j < whereCols.size() ; j++){
                    if(whereCols.get(j).name != null){
                        parameterIndex++;
                        PreparedStmtUtils.setObject(pstmt,parameterIndex,whereCols.get(j));
                    }
                }
            }
            
            rset = pstmt.executeQuery();

            rset.setFetchSize(RSET_FETCH_SIZE);

            cacheSet = dbSession.populate(rset);
        }
        catch(SQLException e)
        {
            String errorCode = ErrorCode.ERR_QRYOPOPERATORLOGFAIL;
            log.error("[DBERROR-("+ errorCode + ")]==>[sqlcode]:"+e.getErrorCode() + " [errmsg]:"+e.getMessage() + " [sql]:"+sql);
            throw new EduException(errorCode);
        }
        finally
        {
            dbSession.closeResultSet(rset);
            dbSession.closeStatement(pstmt);
        }

        return cacheSet;
    }


    public String selectFunctions(String fName,JDBCFieldArray whereCols) throws EduException
    {
        String result = "";
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String sql = "SELECT " + fName + " FROM OPOperatorLog WHERE 1=1 ";
        SQLLog.logSelectFunction(log,sql,whereCols);

        StringBuffer sbWhere = new StringBuffer(256);
        if(whereCols != null)
        {
            sbWhere.append(whereCols.toWhereSQL());
        }

        sql = sql + sbWhere.toString();

        try
        {
            pstmt = conn.prepareStatement(sql);
            
            int parameterIndex = 0;
            if(whereCols != null){
                for(int j = 0 ; j < whereCols.size() ; j++){
                    if(whereCols.get(j).name != null){
                        parameterIndex++;
                        PreparedStmtUtils.setObject(pstmt,parameterIndex,whereCols.get(j));
                    }
                }
            }
            
            rset = pstmt.executeQuery();

            rset.next();
            result = rset.getString(1);

        }
        catch(SQLException e)
        {
            String errorCode = ErrorCode.ERR_QRYOPOPERATORLOGFAIL;
            log.error("[DBERROR-("+ errorCode + ")]==>[sqlcode]:"+e.getErrorCode() + " [errmsg]:"+e.getMessage() + " [sql]:"+sql);
            throw new EduException(errorCode);
        }
        finally
        {
            dbSession.closeResultSet(rset);
            dbSession.closeStatement(pstmt);
        }

        return result;
    }

}