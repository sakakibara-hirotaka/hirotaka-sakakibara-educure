package jp.educure.problem1.productstock;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ProductStockValidator implements Validator {

    @Override
    public boolean supports(@NonNull Class<?> clazz) {
        return ProductStockForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ProductStockForm form = (ProductStockForm) target;

        if (form.getStock() == null) {
            errors.rejectValue("stock", "required", "在庫数は必須です");
        } else {
            if(form.getStock()<1 || form.getStock() >999) {
                errors.rejectValue("stock", "range", "在庫数は1～999の範囲で入力してください");
            }
        }
    }
}