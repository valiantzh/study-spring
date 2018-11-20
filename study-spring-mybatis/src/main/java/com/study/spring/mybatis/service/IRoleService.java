package com.study.spring.mybatis.service;

import com.study.spring.mybatis.entity.OPRole;

public interface IRoleService {
    public OPRole getRoleById(int roleId);
    public int addRole(OPRole entity) throws Exception;
    public int update(OPRole entity);
    public int delete(int id);
}
