package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPOperOnline implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public String OperID = "";
    public int OperType;
    public String DepartmentID = "";
    public java.sql.Timestamp LoginInTime;
    public java.sql.Timestamp LoginOutTime;
    public String NetCardAddr = "";
    public String LoginIPAddr = "";
    public java.sql.Timestamp LastLoginTime;
    public String LastLoginIP = "";
    public String PreVersion = "";
    public java.sql.Timestamp LastQueryTime;
    public String CurrentVersion = "";
    public String LoginTerminal = "";
    public String PreClientVession = "";
    public String CurrentClientVersion = "";
    public String OnlineStatus = "";

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

    public void setDepartmentID(String departmentID) {
        this.DepartmentID = departmentID;
    }

    public String getDepartmentID() {
        return this.DepartmentID;
    }

    public void setLoginInTime(java.sql.Timestamp loginInTime) {
        this.LoginInTime = loginInTime;
    }

    public java.sql.Timestamp getLoginInTime() {
        return this.LoginInTime;
    }

    public void setLoginOutTime(java.sql.Timestamp loginOutTime) {
        this.LoginOutTime = loginOutTime;
    }

    public java.sql.Timestamp getLoginOutTime() {
        return this.LoginOutTime;
    }

    public void setNetCardAddr(String netCardAddr) {
        this.NetCardAddr = netCardAddr;
    }

    public String getNetCardAddr() {
        return this.NetCardAddr;
    }

    public void setLoginIPAddr(String loginIPAddr) {
        this.LoginIPAddr = loginIPAddr;
    }

    public String getLoginIPAddr() {
        return this.LoginIPAddr;
    }

    public void setLastLoginTime(java.sql.Timestamp lastLoginTime) {
        this.LastLoginTime = lastLoginTime;
    }

    public java.sql.Timestamp getLastLoginTime() {
        return this.LastLoginTime;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.LastLoginIP = lastLoginIP;
    }

    public String getLastLoginIP() {
        return this.LastLoginIP;
    }

    public void setPreVersion(String preVersion) {
        this.PreVersion = preVersion;
    }

    public String getPreVersion() {
        return this.PreVersion;
    }

    public void setLastQueryTime(java.sql.Timestamp lastQueryTime) {
        this.LastQueryTime = lastQueryTime;
    }

    public java.sql.Timestamp getLastQueryTime() {
        return this.LastQueryTime;
    }

    public void setCurrentVersion(String currentVersion) {
        this.CurrentVersion = currentVersion;
    }

    public String getCurrentVersion() {
        return this.CurrentVersion;
    }

    public void setLoginTerminal(String loginTerminal) {
        this.LoginTerminal = loginTerminal;
    }

    public String getLoginTerminal() {
        return this.LoginTerminal;
    }

    public void setPreClientVession(String preClientVession) {
        this.PreClientVession = preClientVession;
    }

    public String getPreClientVession() {
        return this.PreClientVession;
    }

    public void setCurrentClientVersion(String currentClientVersion) {
        this.CurrentClientVersion = currentClientVersion;
    }

    public String getCurrentClientVersion() {
        return this.CurrentClientVersion;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.OnlineStatus = onlineStatus;
    }

    public String getOnlineStatus() {
        return this.OnlineStatus;
    }

    public String toString () {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
    }
}