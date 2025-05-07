package es.lardevpro.spring.mvc.customValidations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ZipCodeValidation.class)
public @interface ZipCode {
	String message() default "Código postal no válido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
