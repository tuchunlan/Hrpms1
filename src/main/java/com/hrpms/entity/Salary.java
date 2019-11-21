package com.hrpms.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

//工资表
@Entity
public class Salary {
    private Integer id;             //工资编号
    private String idCard;          //身份证号
    private String payCard;          //银行卡号
    private Date payDate;           //发放月份
    private Double baseSalary;        //基本工资
    private Double bonusPay;        //奖金
    private Double overtimePay;        //加班费
    private Double shebaoPay;        //社保扣费
    private Double gojijinPay;        //公积金扣费
    private Double txPay;               //应交税款
    private Double totalPay;        //应发金额
    private Double mustPay;        //实发金额
    private Double proxyFee;        //代理费用
    private String status;          //状态（0-已发 1-未发）
    private Integer createBy;           //创建者
    private Date createTime;            //创建时间
    private Integer updateBy;           //更新者
    private Date updateTime;            //更新时间
    private String remark;              //备注

    public Salary() {
    }

    public Salary(Integer id, String idCard, String payCard, Date payDate, Double baseSalary, Double bonusPay, Double overtimePay, Double shebaoPay, Double gojijinPay, Double txPay, Double totalPay, Double mustPay, Double proxyFee, String status, Integer createBy, Date createTime, Integer updateBy, Date updateTime, String remark) {
        this.id = id;
        this.idCard = idCard;
        this.payCard = payCard;
        this.payDate = payDate;
        this.baseSalary = baseSalary;
        this.bonusPay = bonusPay;
        this.overtimePay = overtimePay;
        this.shebaoPay = shebaoPay;
        this.gojijinPay = gojijinPay;
        this.txPay = txPay;
        this.totalPay = totalPay;
        this.mustPay = mustPay;
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

    public String getPayCard() {
        return payCard;
    }

    public void setPayCard(String payCard) {
        this.payCard = payCard;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getPayDate() {
        return payDate;
    }


    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Double getBonusPay() {
        return bonusPay;
    }

    public void setBonusPay(Double bonusPay) {
        this.bonusPay = bonusPay;
    }

    public Double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(Double overtimePay) {
        this.overtimePay = overtimePay;
    }

    public Double getShebaoPay() {
        return shebaoPay;
    }

    public void setShebaoPay(Double shebaoPay) {
        this.shebaoPay = shebaoPay;
    }

    public Double getGojijinPay() {
        return gojijinPay;
    }

    public void setGojijinPay(Double gojijinPay) {
        this.gojijinPay = gojijinPay;
    }

    public Double getTxPay() {
        return txPay;
    }

    public void setTxPay(Double txPay) {
        this.txPay = txPay;
    }

    public Double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(Double totalPay) {
        this.totalPay = totalPay;
    }

    public Double getMustPay() {
        return mustPay;
    }

    public void setMustPay(Double mustPay) {
        this.mustPay = mustPay;
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
