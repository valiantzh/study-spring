package com.hzdongcheng.persistent.dao.factory;

// Oracle concrete DAO Factory implementation
import com.hzdongcheng.persistent.dao.*;
import com.hzdongcheng.persistent.dao.impl.*;

import com.hzdongcheng.persistent.dao.common.*;
import com.hzdongcheng.persistent.dao.common.impl.*;

import com.hzdongcheng.toolkits.db.dao.*;
import com.hzdongcheng.toolkits.db.dao.impl.oracle.*;

public class OracleDAOFactory extends DAOFactory{

    public CommonDAO getCommonDAO() {
        return new CommonDAOImpl();
    }

    public UtilDAO getUtilDAO() {
        return new OracleUtilDAO();
    }

    public MBDepartmentDAO getMBDepartmentDAO(){
    
        return new MBDepartmentDAOImpl();
    }

    public OPFunctionDAO getOPFunctionDAO(){
    
        return new OPFunctionDAOImpl();
    }

    public OPMenuDAO getOPMenuDAO(){
    
        return new OPMenuDAOImpl();
    }

    public OPOperAllLimitDAO getOPOperAllLimitDAO(){
    
        return new OPOperAllLimitDAOImpl();
    }

    public OPOperOnlineDAO getOPOperOnlineDAO(){
    
        return new OPOperOnlineDAOImpl();
    }

    public OPOperRoleDAO getOPOperRoleDAO(){
    
        return new OPOperRoleDAOImpl();
    }

    public OPOperSpeRightDAO getOPOperSpeRightDAO(){
    
        return new OPOperSpeRightDAOImpl();
    }

    public OPOperToMenuDAO getOPOperToMenuDAO(){
    
        return new OPOperToMenuDAOImpl();
    }

    public OPOperatorDAO getOPOperatorDAO(){
    
        return new OPOperatorDAOImpl();
    }

    public OPOperatorLogDAO getOPOperatorLogDAO(){
    
        return new OPOperatorLogDAOImpl();
    }

    public OPRoleDAO getOPRoleDAO(){
    
        return new OPRoleDAOImpl();
    }

    public OPRoleAllLimitDAO getOPRoleAllLimitDAO(){
    
        return new OPRoleAllLimitDAOImpl();
    }

    public OPRoleSpeRightDAO getOPRoleSpeRightDAO(){
    
        return new OPRoleSpeRightDAOImpl();
    }

    public OPRoleToMenuDAO getOPRoleToMenuDAO(){
    
        return new OPRoleToMenuDAOImpl();
    }

    public OPSpecialPrivDAO getOPSpecialPrivDAO(){
    
        return new OPSpecialPrivDAOImpl();
    }

}