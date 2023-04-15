package com.example.training_system.pojo.type;


/**
 * 招聘信息表流程状态
 * @author luzhao
 * @date 2023/04/15
 */
public enum RecruitmentAuditStatusEnum {
    AWAIT_CHECK("AWAIT_CHECK"), //等待审核
    CHECK_PASS("CHECK_PASS"), //企业审核通过
    CHECK_NO_PASS("CHECK_NO_PASS"), //企业审核不通过
    ACCEPT("ACCEPT"), //学生同意
    REFUSE("REFUSE"), //学生拒绝
    ;
    private String value;

    RecruitmentAuditStatusEnum(String value) {
        this.value = value;
    }
}
