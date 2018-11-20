package com.study.spring.mybatis.entity;

import java.io.Serializable;

public class OPRole implements Serializable {
    private Integer roleID;

    private String roleName;

    private String operID;

    private static final long serialVersionUID = 1L;

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getOperID() {
        return operID;
    }

    public void setOperID(String operID) {
        this.operID = operID == null ? null : operID.trim();
    }
}