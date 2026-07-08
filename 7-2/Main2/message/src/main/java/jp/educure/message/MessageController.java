package jp.educure.message;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.Map;


@Controller
public class MessageController {
    
    @GetMapping("/form")
    public String showForm(){
        return "form";
    }

    @PostMapping("/message")
    @ResponseBody
    public String message(@RequestParam Map<String, String> params) {
        //TODO: process POST request
        String message = params.get("message");
        if (message == null || message.trim().isEmpty()) {
            message = "No message provided";
        }

        String color = params.get("color");
        if (color == null || color.trim().isEmpty()) {
            color = "black";
        }    

        LocalDateTime now = LocalDateTime.now();
        
        String html = "<!DOCTYPE html>"
                    + "<html>"
                    + "<head>"
                    + "<title>Message Board</title>"
                    + "</head>"
                    + "<body>"
                    + "<h1>Message Board</h1>"
                    + "<div style='color:" + color + "; font-size: 20px; padding: 10px; border: 1px solid black;'>"
                    + message
                    + "</div>"
                    + "<p>Posted at:" + now + "</p>"
                    + "</body>"
                    + "</html>";
        return html;
    }
}