package com.hzdongcheng.persistent.entity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class OPMenu implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public String MenuID = "";
    public String MenuName = "";
    public int MenuLevel;
    public String MenuEngName = "";
    public String CorpShortName = "";
    public String Description = "";
    public String Action = "";
    public int HotKey;
    public String Icon = "";
    public String HelpContext = "";
    public int MenuType;
    public int LeafFlag;
    public String Remark = "";

    public void setMenuID(String menuID) {
        this.MenuID = menuID;
    }

    public String getMenuID() {
        return this.MenuID;
    }

    public void setMenuName(String menuName) {
        this.MenuName = menuName;
    }

    public String getMenuName() {
        return this.MenuName;
    }

    public void setMenuLevel(int menuLevel) {
        this.MenuLevel = menuLevel;
    }

    public int getMenuLevel() {
        return this.MenuLevel;
    }

    public void setMenuEngName(String menuEngName) {
        this.MenuEngName = menuEngName;
    }

    public String getMenuEngName() {
        return this.MenuEngName;
    }

    public void setCorpShortName(String corpShortName) {
        this.CorpShortName = corpShortName;
    }

    public String getCorpShortName() {
        return this.CorpShortName;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setAction(String action) {
        this.Action = action;
    }

    public String getAction() {
        return this.Action;
    }

    public void setHotKey(int hotKey) {
        this.HotKey = hotKey;
    }

    public int getHotKey() {
        return this.HotKey;
    }

    public void setIcon(String icon) {
        this.Icon = icon;
    }

    public String getIcon() {
        return this.Icon;
    }

    public void setHelpContext(String helpContext) {
        this.HelpContext = helpContext;
    }

    public String getHelpContext() {
        return this.HelpContext;
    }

    public void setMenuType(int menuType) {
        this.MenuType = menuType;
    }

    public int getMenuType() {
        return this.MenuType;
    }

    public void setLeafFlag(int leafFlag) {
        this.LeafFlag = leafFlag;
    }

    public int getLeafFlag() {
        return this.LeafFlag;
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