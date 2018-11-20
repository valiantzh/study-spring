package com.study.spring.mybatis.dao;

import com.study.spring.mybatis.entity.OPRole;

public interface OPRoleDAO {
    int deleteByPrimaryKey(Integer roleID);

    int insert(OPRole record);

    int insertSelective(OPRole record);

    OPRole selectByPrimaryKey(Integer roleID);

    int updateByPrimaryKeySelective(OPRole record);

    int updateByPrimaryKey(OPRole record);
}