package com.baseproject.business.common.custom.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckMeValidator implements ConstraintValidator<CheckMe, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		return value != null && !value.equals("tienph");
	}

}
