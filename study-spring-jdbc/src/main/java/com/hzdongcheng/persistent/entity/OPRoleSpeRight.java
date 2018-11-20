package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPRoleSpeRight implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public int SpePrivID;
    public int RoleID;

    public void setSpePrivID(int spePrivID) {
        this.SpePrivID = spePrivID;
    }

    public int getSpePrivID() {
        return this.SpePrivID;
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