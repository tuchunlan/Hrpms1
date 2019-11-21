package com.hrpms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role_function {
    private Integer roleId;             //角色ID
    private Integer funcId;             //权限ID

    public Role_function() {
    }

    public Role_function(Integer roleId, Integer funcId) {
        this.roleId = roleId;
        this.funcId = funcId;
    }

    @Id
    @GeneratedValue
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }
}
