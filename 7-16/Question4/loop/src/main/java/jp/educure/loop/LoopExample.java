package jp.educure.loop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoopExample {
    
    @GetMapping("/loop")
    public String loops(Model model){
        List<String> loop = new ArrayList<>();
        loop.add("Item1");
        loop.add("Item2");
        loop.add("Item3");

        model.addAttribute("items", loop);
        return "loop";
    }
}
