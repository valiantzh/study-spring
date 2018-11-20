package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPOperRole implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public String OperID = "";
    public int RoleID;

    public void setOperID(String operID) {
        this.OperID = operID;
    }

    public String getOperID() {
        return this.OperID;
    }

    public void setRoleID(int roleID) {
        this.RoleID = roleID;
    }

    public int getRoleID() {
        return this.RoleID;
    }

    public String toString () {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
    }
}