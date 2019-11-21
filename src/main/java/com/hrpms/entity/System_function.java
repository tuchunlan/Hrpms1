package com.hrpms.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

//系统权限表
@Entity
public class System_function {
    private Integer id;             //ID
    private String funcName;        //权限名称
    private String funcURL;         //权限链接
    private Integer funcType;       //权限类型 （0菜单 1按钮）
    private String funcNote;        //权限备注
    private Integer parentId;       //权限父ID
    private String iconClass;       //图标样式
    private String iconURL;         //图标路径
    private Integer sortnum;         //排序
    private String status;          //状态（0正常1停用）
    private Integer createBy;           //创建者
    private Date createTime;            //创建时间
    private Integer updateBy;           //更新者
    private Date updateTime;            //更新时间

    public System_function() {
    }

    public System_function(Integer id, String funcName, String funcURL, Integer funcType, String funcNote, Integer parentId, String iconClass, String iconURL, Integer sortnum, String status, Integer createBy, Date createTime, Integer updateBy, Date updateTime) {
        this.id = id;
        this.funcName = funcName;
        this.funcURL = funcURL;
        this.funcType = funcType;
        this.funcNote = funcNote;
        this.parentId = parentId;
        this.iconClass = iconClass;
        this.iconURL = iconURL;
        this.sortnum = sortnum;
        this.status = status;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public String getFuncURL() {
        return funcURL;
    }

    public void setFuncURL(String funcURL) {
        this.funcURL = funcURL;
    }

    public Integer getFuncType() {
        return funcType;
    }

    public void setFuncType(Integer funcType) {
        this.funcType = funcType;
    }

    public String getFuncNote() {
        return funcNote;
    }

    public void setFuncNote(String funcNote) {
        this.funcNote = funcNote;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    public Integer getSortnum() {
        return sortnum;
    }

    public void setSortnum(Integer sortnum) {
        this.sortnum = sortnum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
