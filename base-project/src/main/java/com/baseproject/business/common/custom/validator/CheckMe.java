package com.baseproject.business.common.custom.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = CheckMeValidator.class)
public @interface CheckMe {

	String message() default "Value is not tienph";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
