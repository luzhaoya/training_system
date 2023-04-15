package com.example.training_system.pojo.type;

/**
 * 岗位审核状态枚举
 * @author luzhao
 * @date 2023/04/15
 */
public enum AuditRecruitmentCheckEnum {
    AWAIT_CHECK(0), //未审核
    CHECK_PASS(1), //审核通过
    CHECK_NO_PASS(3) //审核失败
    ;
    private final int value;

    AuditRecruitmentCheckEnum(int value) {
        this.value = value;
    }
}
