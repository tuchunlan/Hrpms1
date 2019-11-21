package com.hrpms.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

//社保基础表
@Entity
public class Social_Insurance {
    private Integer id;             //社保编号
    private String idCard;          //身份证号
    private String sbCard;          //社保卡号
    private Double basePay;         //缴费基数
    private Double mustPay;         //应交金额
    private String personRatio;     //个人缴比率
    private String companyRatio;     //单位缴比率
    private Double yanglao;         //养老保险
    private Double yiliao;         //医疗保险
    private Double shiye;         //失业保险
    private Double gongshang;         //工商保险
    private Double shengyu;         //生育保险
    private Date payDate;         //预交款日期
    private Double proxyFee;         //代理费用
    private String status;          //状态（0-正常 1-删除）
    private Integer createBy;           //创建者
    private Date createTime;            //创建时间
    private Integer updateBy;           //更新者
    private Date updateTime;            //更新时间
    private String remark;              //备注

    public Social_Insurance() {
    }

    public Social_Insurance(Integer id, String idCard, String sbCard, Double basePay, Double mustPay, String personRatio, String companyRatio, Double yanglao, Double yiliao, Double shiye, Double gongshang, Double shengyu, Date payDate, Double proxyFee, String status, Integer createBy, Date createTime, Integer updateBy, Date updateTime, String remark) {
        this.id = id;
        this.idCard = idCard;
        this.sbCard = sbCard;
        this.basePay = basePay;
        this.mustPay = mustPay;
        this.personRatio = personRatio;
        this.companyRatio = companyRatio;
        this.yanglao = yanglao;
        this.yiliao = yiliao;
        this.shiye = shiye;
        this.gongshang = gongshang;
        this.shengyu = shengyu;
        this.payDate = payDate;
        this.proxyFee = proxyFee;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getSbCard() {
        return sbCard;
    }

    public void setSbCard(String sbCard) {
        this.sbCard = sbCard;
    }

    public Double getBasePay() {
        return basePay;
    }

    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }

    public Double getMustPay() {
        return mustPay;
    }

    public void setMustPay(Double mustPay) {
        this.mustPay = mustPay;
    }

    public String getPersonRatio() {
        return personRatio;
    }

    public void setPersonRatio(String personRatio) {
        this.personRatio = personRatio;
    }

    public String getCompanyRatio() {
        return companyRatio;
    }

    public void setCompanyRatio(String companyRatio) {
        this.companyRatio = companyRatio;
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

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Double getProxyFee() {
        return proxyFee;
    }

    public void setProxyFee(Double proxyFee) {
        this.proxyFee = proxyFee;
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
