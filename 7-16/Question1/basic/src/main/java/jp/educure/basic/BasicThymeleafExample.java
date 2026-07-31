package jp.educure.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicThymeleafExample {
    
    @GetMapping("/basic")
    public String greeting(Model model) {
      model.addAttribute("message","Hello,Thymeleaf!");
      return "basic";
    }
}
