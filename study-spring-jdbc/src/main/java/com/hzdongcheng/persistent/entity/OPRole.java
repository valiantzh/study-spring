package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPRole implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public int RoleID;
    public String RoleName = "";
    public String OperID = "";

    public void setRoleID(int roleID) {
        this.RoleID = roleID;
    }

    public int getRoleID() {
        return this.RoleID;
    }

    public void setRoleName(String roleName) {
        this.RoleName = roleName;
    }

    public String getRoleName() {
        return this.RoleName;
    }

    public void setOperID(String operID) {
        this.OperID = operID;
    }

    public String getOperID() {
        return this.OperID;
    }

    public String toString () {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
    }
}