package jp.educure.problem2.phonenumber;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, PhoneNumberForm> {

    @Override 
    public boolean isValid(PhoneNumberForm form, ConstraintValidatorContext context) {
        String number = form.getNumber();
        
        if (number == null || number.isBlank()) {
            return true;
        }

        boolean valid = number.matches("\\d{2,3}-\\d{4}-\\d{4}");

        if(!valid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("正しい電話番号形式で入力してください")
                   .addPropertyNode("number")
                   .addConstraintViolation();
        }
        return valid;
    }
}
