package jp.educure.problem5.discountcampaign;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class DiscountCampaignController {

    @GetMapping("/register")
    public String campaignRegister(Model model) {
        model.addAttribute("register", new DiscountCampaignForm());
        return "input";
    }

    @PostMapping("/check")
    public String checkCampaign(@ModelAttribute("register") DiscountCampaignForm form, BindingResult result, Model model) {
        //TODO: process POST request
        DiscountCampaignVilidator discountCampaignVilidator = new DiscountCampaignVilidator();
        discountCampaignVilidator.validate(form, result);

        if(result.hasErrors()) {
            return "input";
        }
        
        model.addAttribute("check", form);
        return "confirm";
    }
    
    
}