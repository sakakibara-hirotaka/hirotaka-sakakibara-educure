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
            errors.rejectValue("name", "", "キャンペーン名は必須です");
        }

         if(form.getValue() == null) {
            errors.rejectValue("value", "", "割引値は必須です");
            return;
        }

        if(form.getType().equals("fixed") && form.getValue() %100 != 0) {
            errors.rejectValue("value", "", "定額割引は100円単位で入力してください");
        }

        if(form.getValue() > 10000) {
            errors.rejectValue("value", "", "定額割引は最大10,000円までです");
        }

        if(form.getType().equals("percent") 
            && (form.getValue() < 1 || form.getValue() > 50)) {
            errors.rejectValue("value", "outOfRange", "定率割引は1～50%の範囲で入力してください");
        }

        if(form.getStartDate().isBefore(LocalDate.now())){
            errors.rejectValue("startDate", "", "開始日は本日以降を指定してください");
        }

        if(form.getEndDate().isBefore(form.getStartDate())) {
            errors.rejectValue("endDate", "", "終了日は開始日より後の日付にしてください");
        }

        if(form.getEndDate().isAfter(form.getStartDate().plusMonths(1))) {
            errors.rejectValue("endDate", "", "キャンペーン期間は最大1ヶ月までです");
        }

    }
    
}
