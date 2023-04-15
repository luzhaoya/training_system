package com.example.training_system.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.training_system.annotate.FieldInfo;

/**
 * 账户
 * @author luzhao
 * @date 2023/04/15
 */
@TableName("t_account")
public class Account {
    @TableId
    private Integer id;
    @FieldInfo("账号")
    private String account;

    @FieldInfo("密码")
    private String password;

    @FieldInfo("角色")
    private String role;

    @FieldInfo("对应的实体的id")
    private String entityId;
}
