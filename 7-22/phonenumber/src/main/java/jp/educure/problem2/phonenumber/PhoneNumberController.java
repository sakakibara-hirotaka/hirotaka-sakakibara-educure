package jp.educure.problem2.phonenumber;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhoneNumberController {
    
    private final PhoneNumberValidator phoneNumberValidator;

    PhoneNumberController(PhoneNumberValidator phoneNumberValidator) {
        this.phoneNumberValidator = phoneNumberValidator;
    }

    @GetMapping("/form")
    public String numberForm(Model model) {
        model.addAttribute("formNumber", new PhoneNumberForm());
        return "input";
    }

    @PostMapping("/checkForm")
    public String postMethodName(@ModelAttribute("formNumber") PhoneNumberForm form, BindingResult result, Model model) {
        //TODO: process POST request
        phoneNumberValidator.validate(form, result);

        if(result.hasErrors()) {
            return "input";
        }
        model.addAttribute("checkNumber", form);
        return "confim";
    }
    
}
