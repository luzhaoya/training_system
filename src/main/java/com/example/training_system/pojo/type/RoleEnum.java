package com.example.training_system.pojo.type;

public enum RoleEnum {
    ADMIN("ADMIN"),
    STUDENT("STUDENT"),

    ENTERPRISE("ENTERPRISE")
    ;

    private String value;

    RoleEnum(String value) {
        this.value = value;
    }
}
