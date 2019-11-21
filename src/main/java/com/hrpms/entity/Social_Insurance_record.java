package com.hrpms.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

//社保记录表
@Entity
public class Social_Insurance_record {
    private Integer id;             //记录编号
    private String sbCard;          //社保卡号
    private String payMonth;        //缴费期间
    private Double payMoney;        //缴费金额
    private Double yanglao;         //养老保险
    private Double yiliao;         //医疗保险
    private Double shiye;         //失业保险
    private Double gongshang;         //工商保险
    private Double shengyu;         //生育保险
    private String status;          //状态（0-已交 1-未交）
    private Integer createBy;           //创建者
    private Date createTime;            //创建时间
    private Integer updateBy;           //更新者
    private Date updateTime;            //更新时间
    private String remark;              //备注

    public Social_Insurance_record() {
    }

    public Social_Insurance_record(Integer id, String sbCard, String payMonth, Double payMoney, Double yanglao, Double yiliao, Double shiye, Double gongshang, Double shengyu, String status, Integer createBy, Date createTime, Integer updateBy, Date updateTime, String remark) {
        this.id = id;
        this.sbCard = sbCard;
        this.payMonth = payMonth;
        this.payMoney = payMoney;
        this.yanglao = yanglao;
        this.yiliao = yiliao;
        this.shiye = shiye;
        this.gongshang = gongshang;
        this.shengyu = shengyu;
        this.status = status;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
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

    public String getSbCard() {
        return sbCard;
    }

    public void setSbCard(String sbCard) {
        this.sbCard = sbCard;
    }

    public String getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(String payMonth) {
        this.payMonth = payMonth;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public Double getYanglao() {
        return yanglao;
    }

    public void setYanglao(Double yanglao) {
        this.yanglao = yanglao;
    }

    public Double getYiliao() {
        return yiliao;
    }

    public void setYiliao(Double yiliao) {
        this.yiliao = yiliao;
    }

    public Double getShiye() {
        return shiye;
    }

    public void setShiye(Double shiye) {
        this.shiye = shiye;
    }

    public Double getGongshang() {
        return gongshang;
    }

    public void setGongshang(Double gongshang) {
        this.gongshang = gongshang;
    }

    public Double getShengyu() {
        return shengyu;
    }

    public void setShengyu(Double shengyu) {
        this.shengyu = shengyu;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
