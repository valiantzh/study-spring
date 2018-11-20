package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPFunction implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public String FunctionID = "";
    public String FunctionName = "";
    public String FunctionServiceName = "";
    public String LogFlag = "";
    public String OpenFlag = "";

    public void setFunctionID(String functionID) {
        this.FunctionID = functionID;
    }

    public String getFunctionID() {
        return this.FunctionID;
    }

    public void setFunctionName(String functionName) {
        this.FunctionName = functionName;
    }

    public String getFunctionName() {
        return this.FunctionName;
    }

    public void setFunctionServiceName(String functionServiceName) {
        this.FunctionServiceName = functionServiceName;
    }

    public String getFunctionServiceName() {
        return this.FunctionServiceName;
    }

    public void setLogFlag(String logFlag) {
        this.LogFlag = logFlag;
    }

    public String getLogFlag() {
        return this.LogFlag;
    }

    public void setOpenFlag(String openFlag) {
        this.OpenFlag = openFlag;
    }

    public String getOpenFlag() {
        return this.OpenFlag;
    }

    public String toString () {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
    }
}