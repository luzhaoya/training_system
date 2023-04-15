package com.example.training_system.pojo.type;

public enum EnterpriseCheckStatusEnum {
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

    EnterpriseCheckStatusEnum(int value) {
        this.value = value;
    }
}
