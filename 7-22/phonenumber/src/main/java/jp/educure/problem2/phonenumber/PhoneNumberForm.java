package jp.educure.problem2.phonenumber;

import jakarta.validation.constraints.NotBlank;

@ValidPhoneNumber
public class PhoneNumberForm {
    @NotBlank(message = "電話番号を入力してください")
    private String number;
    
    public String getNumber() {
        return number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
}
