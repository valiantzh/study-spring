package com.study.spring.mybatis.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.spring.mybatis.dao.OPRoleDAO;
import com.study.spring.mybatis.entity.OPRole;
import com.study.spring.mybatis.service.IRoleService;




@Service("roleService")
public class RoleServiceImpl implements IRoleService {
    @Resource
    private OPRoleDAO roleDAO;
    public OPRole getRoleById(int roleId) {
        return roleDAO.selectByPrimaryKey(roleId);
    }

    public int addRole(OPRole entity) throws Exception {
        this.roleDAO.insert(entity);
        return 0;
    }

    public int update(OPRole entity) {
        return roleDAO.updateByPrimaryKey(entity);
    }

    public int delete(int id) {
        return this.roleDAO.deleteByPrimaryKey(id);
    }

}
