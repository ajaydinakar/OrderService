package com.ajay.OrderService.util;

import com.ajay.OrderService.constraint.ValidId;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Slf4j
public class IdValidator implements ConstraintValidator<ValidId,String> {
    @Override
    public void initialize(ValidId constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }


    @Override
    public boolean isValid(String id, ConstraintValidatorContext context) {
        if((id.startsWith("o"))||(id.startsWith("c")))
        {
            log.info("this is a valid id");
            return true;
        }
        else {
            log.info("this is not valid id");
            return false;
        }
    }
}
