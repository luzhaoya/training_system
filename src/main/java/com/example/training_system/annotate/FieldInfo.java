package com.example.training_system.annotate;


import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Documented
@Target(ElementType.FIELD)
public @interface FieldInfo {
    String value();
    Class<?> basis() default Object.class;
}
