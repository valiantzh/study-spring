package com.study.spring.mybatis.dao;

import com.study.spring.mybatis.entity.OPOperator;

public interface OPOperatorDAO {
    int deleteByPrimaryKey(String operID);

    int insert(OPOperator record);

    int insertSelective(OPOperator record);

    OPOperator selectByPrimaryKey(String operID);

    int updateByPrimaryKeySelective(OPOperator record);

    int updateByPrimaryKey(OPOperator record);
}