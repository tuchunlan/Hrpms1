package com.hrpms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//用户角色表
@Entity
public class User_role {
    private Integer userId;   //用户ID
    private Integer roleId;   //角色ID

    public User_role() {
    }

    public User_role(Integer userId, Integer roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    @Id
    @GeneratedValue
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
