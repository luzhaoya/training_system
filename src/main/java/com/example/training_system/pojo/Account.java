package com.example.training_system.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.training_system.annotate.FieldInfo;
import com.example.training_system.pojo.type.RoleEnum;

import javax.management.relation.RoleStatus;

/**
 * 账户
 * @author luzhao
 * @date 2023/04/15
 */
@TableName("t_account")
public class Account {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    
    @FieldInfo("账号")
    private String account;

    @FieldInfo("密码")
    private String password;

    @FieldInfo(value = "角色", basis = RoleEnum.class)
    private String role;

    @FieldInfo("对应的实体的id")
    private String entityId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }
}
