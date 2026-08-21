package jp.educure.problem5.discountcampaign;

import java.time.LocalDate;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class DiscountCampaignVilidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return DiscountCampaignForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        DiscountCampaignForm form = (DiscountCampaignForm) target;
        if(form.getName() == null || form.getName().isEmpty()) {
            errors.rejectValue("name", "required", "キャンペーン名は必須です");
            return;
        }

        if(form.getValue() == null) {
            errors.rejectValue("value", "required", "割引値は必須です");
            return;
        }

        if(form.getType() == null) {
            errors.rejectValue("type", "required", "割引種別は必須です");
            return;
        }

        if(form.getStartDate() == null) {
            errors.rejectValue("startDate", "required", "開始日は必須です");
            return;
        }

        if(form.getEndDate() == null) {
            errors.rejectValue("endDate", "required", "終了日は必須です");
            return;
        }

        if(form.getType().equals("fixed") && form.getValue() %100 != 0) {
            errors.rejectValue("value", "invalidUnit", "定額割引は100円単位で入力してください");
        }

        if(form.getType().equals("fixed") && form.getValue() > 10000) {
            errors.rejectValue("value", "outOfRange", "定額割引は最大10,000円までです");
        }

        if(form.getType().equals("percent") 
            && (form.getValue() < 1 || form.getValue() > 50)) {
            errors.rejectValue("value", "outOfRange", "定率割引は1～50%の範囲で入力してください");
        }

        if(form.getStartDate().isBefore(LocalDate.now())
            || form.getStartDate().isEqual(form.getEndDate())){
            errors.rejectValue("startDate", "past", "開始日は本日以降を指定してください");
        }

        if(form.getEndDate().isBefore(form.getStartDate())) {
            errors.rejectValue("endDate", "invalidOrder", "終了日は開始日より後の日付にしてください");
        }

        if(form.getEndDate().isAfter(form.getStartDate().plusMonths(1))) {
            errors.rejectValue("endDate", "tooLong", "キャンペーン期間は最大1ヶ月までです");
        }

    }
    
}
