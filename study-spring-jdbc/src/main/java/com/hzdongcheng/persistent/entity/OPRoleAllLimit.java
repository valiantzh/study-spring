package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPRoleAllLimit implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public int RoleID;
    public int LimitTypeID;
    public String LimitObject = "";
    public String LimitObjectName = "";

    public void setRoleID(int roleID) {
        this.RoleID = roleID;
    }

    public int getRoleID() {
        return this.RoleID;
    }

    public void setLimitTypeID(int limitTypeID) {
        this.LimitTypeID = limitTypeID;
    }

    public int getLimitTypeID() {
        return this.LimitTypeID;
    }

    public void setLimitObject(String limitObject) {
        this.LimitObject = limitObject;
    }

    public String getLimitObject() {
        return this.LimitObject;
    }

    public void setLimitObjectName(String limitObjectName) {
        this.LimitObjectName = limitObjectName;
    }

    public String getLimitObjectName() {
        return this.LimitObjectName;
    }

    public String toString () {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
    }
}