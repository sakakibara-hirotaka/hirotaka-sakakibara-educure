package jp.educure.problem2.phonenumber;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PhoneNumberValidator implements Validator {
    
    @Override 
    public boolean supports(@NonNull Class<?> clazz) {
        return PhoneNumberForm.class.isAssignableFrom(clazz);
    }

    @Override 
    public void validate(Object target, Errors errors) {
        PhoneNumberForm form = (PhoneNumberForm) target;
        String number = form.getNumber();
        
        if(!number.matches("\\d{2,3}-\\d{4}-\\d{4}")) {
        errors.rejectValue("number", "pattern", "正しい電話番号形式で入力してください");
        }
    }
}
