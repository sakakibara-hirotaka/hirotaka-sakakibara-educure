package jp.educure.apli;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

    @GetMapping("/greet")
    public String hello(Model model) {
        model.addAttribute("message","Hello,Word!");
        return "greet";
    }
}
