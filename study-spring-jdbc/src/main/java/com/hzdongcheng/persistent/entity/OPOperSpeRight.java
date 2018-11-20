package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPOperSpeRight implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public String OperID = "";
    public int SpePrivID;

    public void setOperID(String operID) {
        this.OperID = operID;
    }

    public String getOperID() {
        return this.OperID;
    }

    public void setSpePrivID(int spePrivID) {
        this.SpePrivID = spePrivID;
    }

    public int getSpePrivID() {
        return this.SpePrivID;
    }

    public String toString () {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
    }
}