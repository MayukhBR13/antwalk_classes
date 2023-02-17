package com.springmvcValidationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=PasswordConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password{
	//error msg
	public String message() default "must contain #a";
	
	//group
	public Class<?>[] groups() default {};
	
	//additional 
	public Class<? extends Payload>[] payload() default {};
}
