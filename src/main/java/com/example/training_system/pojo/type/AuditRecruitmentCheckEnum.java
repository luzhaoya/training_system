package com.example.training_system.pojo.type;

/**
 * 岗位审核状态枚举
 * @author luzhao
 * @date 2023/04/15
 */
public enum AuditRecruitmentCheckEnum {
    /**
     * 未审核
     */
    GO_CHECK(0),
    /**
     * 审核通过
     */
    PASS(1),
    /**
     * 审核失败
     */
    NO_PASS(3)
    ;
    private final int value;

    AuditRecruitmentCheckEnum(int value) {
        this.value = value;
    }
}
