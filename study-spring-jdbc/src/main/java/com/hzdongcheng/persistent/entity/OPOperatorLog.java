package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPOperatorLog implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public long OperLogID;
    public String FunctionID = "";
    public String OperID = "";
    public int OperType;
    public String TerminalNo = "";
    public java.sql.Date OccurDate;
    public java.sql.Timestamp OccurTime;
    public String StationAddr = "";
    public String Remark = "";

    public void setOperLogID(long operLogID) {
        this.OperLogID = operLogID;
    }

    public long getOperLogID() {
        return this.OperLogID;
    }

    public void setFunctionID(String functionID) {
        this.FunctionID = functionID;
    }

    public String getFunctionID() {
        return this.FunctionID;
    }

    public void setOperID(String operID) {
        this.OperID = operID;
    }

    public String getOperID() {
        return this.OperID;
    }

    public void setOperType(int operType) {
        this.OperType = operType;
    }

    public int getOperType() {
        return this.OperType;
    }

    public void setTerminalNo(String terminalNo) {
        this.TerminalNo = terminalNo;
    }

    public String getTerminalNo() {
        return this.TerminalNo;
    }

    public void setOccurDate(java.sql.Date occurDate) {
        this.OccurDate = occurDate;
    }

    public java.sql.Date getOccurDate() {
        return this.OccurDate;
    }

    public void setOccurTime(java.sql.Timestamp occurTime) {
        this.OccurTime = occurTime;
    }

    public java.sql.Timestamp getOccurTime() {
        return this.OccurTime;
    }

    public void setStationAddr(String stationAddr) {
        this.StationAddr = stationAddr;
    }

    public String getStationAddr() {
        return this.StationAddr;
    }

    public void setRemark(String remark) {
        this.Remark = remark;
    }

    public String getRemark() {
        return this.Remark;
    }

    public String toString () {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
    }
}