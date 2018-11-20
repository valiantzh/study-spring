package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPRoleToMenu implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public String MenuID = "";
    public int RoleID;

    public void setMenuID(String menuID) {
        this.MenuID = menuID;
    }

    public String getMenuID() {
        return this.MenuID;
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