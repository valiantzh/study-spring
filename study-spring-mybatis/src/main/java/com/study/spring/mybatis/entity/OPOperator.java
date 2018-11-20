package com.study.spring.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class OPOperator implements Serializable {
    private String operID;

    private String departmentID;

    private String userID;

    private Integer operType;

    private String operName;

    private String operPassword;

    private String plainPassword;

    private String bindCardID;

    private String bindMobile;

    private String officeTel;

    private String mobile;

    private String email;

    private Date createDate;

    private Date createTime;

    private String upperUserID;

    private String operStatus;

    private Date lastModifyTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getOperID() {
        return operID;
    }

    public void setOperID(String operID) {
        this.operID = operID == null ? null : operID.trim();
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID == null ? null : departmentID.trim();
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public Integer getOperType() {
        return operType;
    }

    public void setOperType(Integer operType) {
        this.operType = operType;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public String getOperPassword() {
        return operPassword;
    }

    public void setOperPassword(String operPassword) {
        this.operPassword = operPassword == null ? null : operPassword.trim();
    }

    public String getPlainPassword() {
        return plainPassword;
    }

    public void setPlainPassword(String plainPassword) {
        this.plainPassword = plainPassword == null ? null : plainPassword.trim();
    }

    public String getBindCardID() {
        return bindCardID;
    }

    public void setBindCardID(String bindCardID) {
        this.bindCardID = bindCardID == null ? null : bindCardID.trim();
    }

    public String getBindMobile() {
        return bindMobile;
    }

    public void setBindMobile(String bindMobile) {
        this.bindMobile = bindMobile == null ? null : bindMobile.trim();
    }

    public String getOfficeTel() {
        return officeTel;
    }

    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel == null ? null : officeTel.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpperUserID() {
        return upperUserID;
    }

    public void setUpperUserID(String upperUserID) {
        this.upperUserID = upperUserID == null ? null : upperUserID.trim();
    }

    public String getOperStatus() {
        return operStatus;
    }

    public void setOperStatus(String operStatus) {
        this.operStatus = operStatus == null ? null : operStatus.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}