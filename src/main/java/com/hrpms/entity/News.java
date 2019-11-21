package com.hrpms.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class News {
    private Integer id;//编号
    private String newsTitle;//新闻标题
    private String content;//新闻内容
    private Integer status;//状态  0显示1隐藏
    private Date createTime;//创建时间
    private String createBy;//创建者
    private Date updateTime;//更新时间
    private String updateBy;//更新者
    private String remark;//备注

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public News() {
    }

    public News(Integer id, String newsTitle, String content, Integer status, Date createTime, String createBy, Date updateTime, String updateBy, String remark) {
        this.id = id;
        this.newsTitle = newsTitle;
        this.content = content;
        this.status = status;
        this.createTime = createTime;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
        this.remark = remark;
    }
}
