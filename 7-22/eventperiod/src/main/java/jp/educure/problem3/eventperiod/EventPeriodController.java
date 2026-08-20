package jp.educure.problem3.eventperiod;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;


@Controller
public class EventPeriodController {

    @GetMapping("/event")
    public String getMethodName(Model model) {
        model.addAttribute("event", new EventPeriodForm());
        return "input";
    }
    
    @PostMapping("/checkEvent")
    public String checkEvent(@Valid @ModelAttribute("event") EventPeriodForm form, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "input";
        }
        
        model.addAttribute("check", form);
        return "confirm";
    }
    
}
