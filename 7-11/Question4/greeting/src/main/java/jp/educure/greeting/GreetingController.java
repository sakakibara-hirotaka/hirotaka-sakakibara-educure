package jp.educure.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {
    
    @GetMapping("/greeting")
    public String form(){
        return "greetingForm";
    }

    @PostMapping("/greeting")
    public String postMethodName(@RequestParam("userName") String userName, Model model) {
        //TODO: process POST request
        model.addAttribute("name", userName);
        return "greetingResult";
    }
    
}
