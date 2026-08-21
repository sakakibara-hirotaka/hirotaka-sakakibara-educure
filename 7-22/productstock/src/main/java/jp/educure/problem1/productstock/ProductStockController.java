package jp.educure.problem1.productstock;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductStockController {
    
    @GetMapping("/product")
    public String productForm(Model model) {
        model.addAttribute("product", new ProductStockForm());
        return "input";
    }
    
    @PostMapping("/stockProduct")
    public String check(@ModelAttribute("product") ProductStockForm productStockForm, BindingResult result, Model model) {
        //TODO: process POST request

        ProductStockValidator validator = new ProductStockValidator();
        validator.validate( productStockForm, result);

        if(result.hasErrors()) {
            return "input";
        }
        model.addAttribute("stock", productStockForm.getStock());
        return "confirm";
    }
}
