package com.ajay.OrderService.constraint;

import com.ajay.OrderService.util.IdValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IdValidator.class)
public @interface ValidId {
    String message() default "Invalid Id,customerId or orderid is only acceptable";
    Class<?>[]groups() default {};
    Class<? extends Payload>[] payload() default {};
}
