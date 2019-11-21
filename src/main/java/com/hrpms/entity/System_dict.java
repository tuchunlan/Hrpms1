package com.hrpms.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

//数据字典表
@Entity
public class System_dict {
    private Integer id;             //编号
    private String name;            //字典名称
    private String value;           //存储值
    private String label;           //显示值
    private String description;     //描述
    private Integer sort;           //排序
    private Integer parentId;       //父ID
    private String status;          //状态（0正常1停用）
    private Integer createBy;           //创建者
    private Date createTime;            //创建时间
    private Integer updateBy;           //更新者
    private Date updateTime;            //更新时间


    public System_dict() {
    }

    public System_dict(Integer id, String name, String value, String label, String description, Integer sort, Integer parentId, String status, Integer createBy, Date createTime, Integer updateBy, Date updateTime) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.label = label;
        this.description = description;
        this.sort = sort;
        this.parentId = parentId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
