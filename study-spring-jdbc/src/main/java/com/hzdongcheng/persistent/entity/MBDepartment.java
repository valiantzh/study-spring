package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class MBDepartment implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public String DepartmentID = "";
    public String DepartmentName = "";
    public String Area = "";
    public String City = "";
    public String Province = "";
    public String Address = "";
    public String Zip = "";
    public String OfficeTel = "";
    public String ContactPerson = "";
    public String ContactTel = "";
    public String ParentDepartID = "";
    public int DepartLevel;
    public int LeafFlag;
    public String Level1 = "";
    public String Level2 = "";
    public String Level3 = "";
    public String Level4 = "";
    public String Level5 = "";
    public String Level6 = "";
    public String WelcomeInfo = "";
    public java.sql.Timestamp CreateTime;
    public String Remark = "";

    public void setDepartmentID(String departmentID) {
        this.DepartmentID = departmentID;
    }

    public String getDepartmentID() {
        return this.DepartmentID;
    }

    public void setDepartmentName(String departmentName) {
        this.DepartmentName = departmentName;
    }

    public String getDepartmentName() {
        return this.DepartmentName;
    }

    public void setArea(String area) {
        this.Area = area;
    }

    public String getArea() {
        return this.Area;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getCity() {
        return this.City;
    }

    public void setProvince(String province) {
        this.Province = province;
    }

    public String getProvince() {
        return this.Province;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setZip(String zip) {
        this.Zip = zip;
    }

    public String getZip() {
        return this.Zip;
    }

    public void setOfficeTel(String officeTel) {
        this.OfficeTel = officeTel;
    }

    public String getOfficeTel() {
        return this.OfficeTel;
    }

    public void setContactPerson(String contactPerson) {
        this.ContactPerson = contactPerson;
    }

    public String getContactPerson() {
        return this.ContactPerson;
    }

    public void setContactTel(String contactTel) {
        this.ContactTel = contactTel;
    }

    public String getContactTel() {
        return this.ContactTel;
    }

    public void setParentDepartID(String parentDepartID) {
        this.ParentDepartID = parentDepartID;
    }

    public String getParentDepartID() {
        return this.ParentDepartID;
    }

    public void setDepartLevel(int departLevel) {
        this.DepartLevel = departLevel;
    }

    public int getDepartLevel() {
        return this.DepartLevel;
    }

    public void setLeafFlag(int leafFlag) {
        this.LeafFlag = leafFlag;
    }

    public int getLeafFlag() {
        return this.LeafFlag;
    }

    public void setLevel1(String level1) {
        this.Level1 = level1;
    }

    public String getLevel1() {
        return this.Level1;
    }

    public void setLevel2(String level2) {
        this.Level2 = level2;
    }

    public String getLevel2() {
        return this.Level2;
    }

    public void setLevel3(String level3) {
        this.Level3 = level3;
    }

    public String getLevel3() {
        return this.Level3;
    }

    public void setLevel4(String level4) {
        this.Level4 = level4;
    }

    public String getLevel4() {
        return this.Level4;
    }

    public void setLevel5(String level5) {
        this.Level5 = level5;
    }

    public String getLevel5() {
        return this.Level5;
    }

    public void setLevel6(String level6) {
        this.Level6 = level6;
    }

    public String getLevel6() {
        return this.Level6;
    }

    public void setWelcomeInfo(String welcomeInfo) {
        this.WelcomeInfo = welcomeInfo;
    }

    public String getWelcomeInfo() {
        return this.WelcomeInfo;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.CreateTime = createTime;
    }

    public java.sql.Timestamp getCreateTime() {
        return this.CreateTime;
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