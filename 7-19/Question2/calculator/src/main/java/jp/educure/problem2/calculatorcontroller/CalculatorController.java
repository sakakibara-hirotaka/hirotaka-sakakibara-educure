package jp.educure.problem2.calculatorcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    
    @GetMapping("/calculator")
    public String calculator(Model model) {
        model.addAttribute("calculator", "calculator");
        return "calculator";
    }

    @PostMapping("result")
    public String postMethodName(@RequestParam(name = "number1")int number1,
                                @RequestParam(name = "number2") int number2, 
                                @RequestParam(name = "operation") String operation,
                                Model model) {
        //TODO: process POST request
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("operation", operation);
        return "result";
    }
    
}
