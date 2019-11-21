package com.hrpms.entity;

import javax.persistence.Entity;
import java.util.Date;

//客户表
@Entity
public class Customer {
    private Integer id;             //客户编号
    private String name;             //客户名称
    private String idCard;          //身份证号
    private String phone;           //电话
    private String sex;             //性别
    private Date birthday;          //生日
    private String email;           //电子邮件
    private String address;         //客户地址
    private String zipcode;         //邮编
    private String school;          //毕业学校
    private String specialty;       //专业
    private String graduation;      //毕业时间
    private Integer companyId;      //所属公司
    private String customerType;     //客户类型(0-本公司员工 1-代理公司  2-个人客户 3-外包客户)
    private String isSalary;          //代发工资（0-是  1-否）
    private String isShebao;          //代缴社保（0-是  1-否）
    private String isGongjijin;          //代缴公积金（0-是  1-否）
    private String status;          //状态（0-正常 1-封存）
    private String delflag;             //删除标志（0-正常  1-删除）
    private Integer createBy;           //创建者
    private Date createTime;            //创建时间
    private Integer updateBy;           //更新者
    private Date updateTime;            //更新时间
    private String remark;              //备注


}
