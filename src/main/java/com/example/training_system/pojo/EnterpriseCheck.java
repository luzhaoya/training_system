package com.example.training_system.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.training_system.annotate.FieldInfo;
import com.example.training_system.pojo.type.EnterpriseCheckStatusEnum;

/**
 * 作用：用于学校认证企业
 * @author luzhao
 * @date 2023/04/15
 */
@TableName("t_enterprise_check")
public class EnterpriseCheck {
    @TableId
    private Integer id;

    @FieldInfo("企业id")
    private String enterpriseId;

    @FieldInfo("企业名称")
    private String enterpriseName;

    @FieldInfo(value = "审核状态", basis = EnterpriseCheckStatusEnum.class)
    private String checkStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }
}
