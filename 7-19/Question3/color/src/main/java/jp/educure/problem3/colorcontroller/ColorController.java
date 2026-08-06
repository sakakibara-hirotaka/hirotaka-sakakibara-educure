package jp.educure.problem3.colorcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ColorController {
    
    @GetMapping("/color")
    public String colorForm(Model model){
        model.addAttribute("color", "color");
        return "color-select";
    }

    @GetMapping("/color/result")
    public String golorResult(@RequestParam(name="name") String name,
                              @RequestParam(name="color") String color,                            
                              Model model) {
                                
        model.addAttribute("name", name);
        model.addAttribute("color", color);
        return "color-result";
    }
    
}
