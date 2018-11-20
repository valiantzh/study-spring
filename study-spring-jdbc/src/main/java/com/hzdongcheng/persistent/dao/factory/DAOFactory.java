package com.hzdongcheng.persistent.dao.factory;

import com.hzdongcheng.persistent.dao.*;
import com.hzdongcheng.persistent.dao.common.*;

import com.hzdongcheng.toolkits.db.dao.*;

import com.hzdongcheng.toolkits.db.*;

// Abstract class DAO Factory
public abstract class DAOFactory {

    // List of DAO types supported by the factory
    public static DAOFactory getDAOFactory(int whichFactory){
    
        switch (whichFactory){
            case DataSourceUtils.DB_TYPE_ORACLE:
                return new OracleDAOFactory();
            case DataSourceUtils.DB_TYPE_MYSQL:
                return new MysqlDAOFactory();
            case DataSourceUtils.DB_TYPE_SQLSERVER:
                return new MsSQLDAOFactory();
            default:
                return null;
        }
    }

    // There will be a method for each DAO that can be
    // created. The concrete factories will have to
    // implement these methods.
    public abstract CommonDAO getCommonDAO();

    public abstract UtilDAO getUtilDAO();


    public abstract MBDepartmentDAO getMBDepartmentDAO();

    public abstract OPFunctionDAO getOPFunctionDAO();

    public abstract OPMenuDAO getOPMenuDAO();

    public abstract OPOperAllLimitDAO getOPOperAllLimitDAO();

    public abstract OPOperOnlineDAO getOPOperOnlineDAO();

    public abstract OPOperRoleDAO getOPOperRoleDAO();

    public abstract OPOperSpeRightDAO getOPOperSpeRightDAO();

    public abstract OPOperToMenuDAO getOPOperToMenuDAO();

    public abstract OPOperatorDAO getOPOperatorDAO();

    public abstract OPOperatorLogDAO getOPOperatorLogDAO();

    public abstract OPRoleDAO getOPRoleDAO();

    public abstract OPRoleAllLimitDAO getOPRoleAllLimitDAO();

    public abstract OPRoleSpeRightDAO getOPRoleSpeRightDAO();

    public abstract OPRoleToMenuDAO getOPRoleToMenuDAO();

    public abstract OPSpecialPrivDAO getOPSpecialPrivDAO();
}