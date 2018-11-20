package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPOperAllLimit implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public String OperID = "";
    public int LimitTypeID;
    public String LimitObject = "";
    public String LimitObjectName = "";

    public void setOperID(String operID) {
        this.OperID = operID;
    }

    public String getOperID() {
        return this.OperID;
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