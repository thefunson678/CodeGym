package com.example.ex8_1_register_form.utils;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AgeValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface IAgeConstraint {
    String message() default "Required to be 18 years or older";
    Class<?>[] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
