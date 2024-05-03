package com.example.ex8_1_register_form.utils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Period;

public class AgeValidator implements ConstraintValidator<IAgeConstraint, LocalDate> {

    @Override
    public void initialize(IAgeConstraint constraintAnnotation) {
    }
    @Override
    public boolean isValid(LocalDate dateOfBirth, ConstraintValidatorContext context) {
        if (dateOfBirth == null){
            return false;
        }
        LocalDate now= LocalDate.now();
        Period period  = Period.between(dateOfBirth,now);
        return  period.getYears() >= 18;
    }
}
