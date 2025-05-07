package es.lardevpro.spring.mvc.customValidations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ZipCodeValidation implements ConstraintValidator <ZipCode, String> {

	private static final String ZIP_CODE_REGEX = "^(0[1-9]|[1-4][0-9]|5[0-2])\\d{3}$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.matches(ZIP_CODE_REGEX);
    }
}
