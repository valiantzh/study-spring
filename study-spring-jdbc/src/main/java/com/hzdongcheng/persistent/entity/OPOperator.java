package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPOperator implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public String OperID = "";
    public String DepartmentID = "";
    public String UserID = "";
    public int OperType;
    public String OperName = "";
    public String OperPassword = "";
    public String PlainPassword = "";
    public String BindCardID = "";
    public String BindMobile = "";
    public String OfficeTel = "";
    public String Mobile = "";
    public String Email = "";
    public java.sql.Date CreateDate;
    public java.sql.Timestamp CreateTime;
    public String UpperUserID = "";
    public String OperStatus = "";
    public java.sql.Timestamp LastModifyTime;
    public String Remark = "";

    public void setOperID(String operID) {
        this.OperID = operID;
    }

    public String getOperID() {
        return this.OperID;
    }

    public void setDepartmentID(String departmentID) {
        this.DepartmentID = departmentID;
    }

    public String getDepartmentID() {
        return this.DepartmentID;
    }

    public void setUserID(String userID) {
        this.UserID = userID;
    }

    public String getUserID() {
        return this.UserID;
    }

    public void setOperType(int operType) {
        this.OperType = operType;
    }

    public int getOperType() {
        return this.OperType;
    }

    public void setOperName(String operName) {
        this.OperName = operName;
    }

    public String getOperName() {
        return this.OperName;
    }

    public void setOperPassword(String operPassword) {
        this.OperPassword = operPassword;
    }

    public String getOperPassword() {
        return this.OperPassword;
    }

    public void setPlainPassword(String plainPassword) {
        this.PlainPassword = plainPassword;
    }

    public String getPlainPassword() {
        return this.PlainPassword;
    }

    public void setBindCardID(String bindCardID) {
        this.BindCardID = bindCardID;
    }

    public String getBindCardID() {
        return this.BindCardID;
    }

    public void setBindMobile(String bindMobile) {
        this.BindMobile = bindMobile;
    }

    public String getBindMobile() {
        return this.BindMobile;
    }

    public void setOfficeTel(String officeTel) {
        this.OfficeTel = officeTel;
    }

    public String getOfficeTel() {
        return this.OfficeTel;
    }

    public void setMobile(String mobile) {
        this.Mobile = mobile;
    }

    public String getMobile() {
        return this.Mobile;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setCreateDate(java.sql.Date createDate) {
        this.CreateDate = createDate;
    }

    public java.sql.Date getCreateDate() {
        return this.CreateDate;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.CreateTime = createTime;
    }

    public java.sql.Timestamp getCreateTime() {
        return this.CreateTime;
    }

    public void setUpperUserID(String upperUserID) {
        this.UpperUserID = upperUserID;
    }

    public String getUpperUserID() {
        return this.UpperUserID;
    }

    public void setOperStatus(String operStatus) {
        this.OperStatus = operStatus;
    }

    public String getOperStatus() {
        return this.OperStatus;
    }

    public void setLastModifyTime(java.sql.Timestamp lastModifyTime) {
        this.LastModifyTime = lastModifyTime;
    }

    public java.sql.Timestamp getLastModifyTime() {
        return this.LastModifyTime;
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