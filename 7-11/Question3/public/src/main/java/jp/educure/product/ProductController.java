package jp.educure.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@Controller
public class ProductController {
    
    private final List<Product> products = List.of(
    new Product(1, "商品1", 1000.0, "商品の説明1"),
    new Product(2, "商品2", 2000.0, "商品の説明2"),
    new Product(3, "商品3", 3000.0, "商品の説明3"));

    @GetMapping("/product")
    public String productList(Model model){
        model.addAttribute("products" , products);
        return "productList";
    }

    @GetMapping("/product/{id}")
    public String product(@PathVariable("id") int id, Model model) {

        Product foundProduct = products.stream()
            .filter(product -> product.getId() == id)
            .findFirst()
            .orElse(null);

        if (foundProduct == null) {
            model.addAttribute("error", "商品一覧に戻る");
            return "error";
        }

        model.addAttribute("product", foundProduct);
        return "productDetail";
    }
}
