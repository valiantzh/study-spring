package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPSpecialPriv implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public int SpePrivID;
    public String SpePrivName = "";

    public void setSpePrivID(int spePrivID) {
        this.SpePrivID = spePrivID;
    }

    public int getSpePrivID() {
        return this.SpePrivID;
    }

    public void setSpePrivName(String spePrivName) {
        this.SpePrivName = spePrivName;
    }

    public String getSpePrivName() {
        return this.SpePrivName;
    }

    public String toString () {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
    }
}