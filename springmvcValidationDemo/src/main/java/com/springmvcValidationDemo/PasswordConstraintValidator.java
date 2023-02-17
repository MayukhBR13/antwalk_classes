package com.springmvcValidationDemo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password,String> {

	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result= value.contains("#a");
		return result;
	}


}
