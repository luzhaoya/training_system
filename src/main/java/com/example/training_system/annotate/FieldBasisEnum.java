package com.example.training_system.annotate;


import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Documented
@Target(ElementType.FIELD)
public @interface FieldBasisEnum {
    Class<?> value();
}
