package jp.educure.problem1.messagecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {
    
    @GetMapping("/message")
    public String getMessage(Model model) {
        model.addAttribute("name", "name");
        model.addAttribute("message", "message");
        return "message-form";
    }
    
    @GetMapping("/message/result")
    public String postMessage(
        @RequestParam(name = "name") String name,
        @RequestParam(name = "message") String message,
        Model model
    ) {
        //TODO: process POST request
        model.addAttribute("userName", name);
        model.addAttribute("message", message);
        return "message-result";
    }
}
