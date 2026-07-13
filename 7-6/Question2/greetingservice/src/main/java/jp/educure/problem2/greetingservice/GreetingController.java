package jp.educure.problem2.greetingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
    private final Greetingservice greetingservice;

    @Autowired
    public GreetingController(Greetingservice greetingservice) {
        this.greetingservice = greetingservice;
    }

    @GetMapping("/greet")
    public String showGreeting() {
        return greetingservice.greet();
    }
    

}
