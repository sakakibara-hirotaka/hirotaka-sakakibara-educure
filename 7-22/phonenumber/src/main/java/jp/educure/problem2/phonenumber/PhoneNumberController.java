package jp.educure.problem2.phonenumber;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class PhoneNumberController {

    @GetMapping("/form")
    public String numberForm(Model model) {
        model.addAttribute("formNumber", new PhoneNumberForm());
        return "input";
    }

    @PostMapping("/checkForm")
    public String numberCheck(@Valid @ModelAttribute("formNumber") PhoneNumberForm form, BindingResult result, Model model) {

        if(result.hasErrors()) {
            return "input";
        }
        model.addAttribute("checkNumber", form);
        return "confim";
    }
    
}
