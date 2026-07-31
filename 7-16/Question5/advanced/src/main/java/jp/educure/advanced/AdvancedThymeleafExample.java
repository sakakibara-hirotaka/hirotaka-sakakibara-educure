package jp.educure.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdvancedThymeleafExample {
    
    @GetMapping("/advanced")
    public String getMethodName(Model model) {

        User user = new User("Bob", "Admin", "ACTIVE");
        model.addAttribute("users", user);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 1200.0));
        productList.add(new Product("Smartphone", 800.0));
        productList.add(new Product("Tablet", 450.0));
        model.addAttribute("productList", productList);
        return "advanced";
    } 
}
