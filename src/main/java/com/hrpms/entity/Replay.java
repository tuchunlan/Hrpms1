package com.hrpms.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Replay {
    //编号
    private Integer id;
    //留言表ID
    private Integer messageId;
    //回复内容
    private  String content;
    //回复时间
    private Date replayTime;
    //回复者
    private Integer replayBy;
    //回复状态
    private Integer status;//0显示1隐藏
    //备注
    private String remark;

    public Replay() {
    }

    public Replay(Integer id, Integer messageId, String content, Date replayTime, Integer replayBy, Integer status, String remark) {
        this.id = id;
        this.messageId = messageId;
        this.content = content;
        this.replayTime = replayTime;
        this.replayBy = replayBy;
        this.status = status;
        this.remark = remark;
    }
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Temporal(value = TemporalType.DATE )
    public Date getReplayTime() {
        return replayTime;
    }

    public void setReplayTime(Date replayTime) {
        this.replayTime = replayTime;
    }

    public Integer getReplayBy() {
        return replayBy;
    }

    public void setReplayBy(Integer replayBy) {
        this.replayBy = replayBy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
