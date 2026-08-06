package jp.educure.problem4.productcontroller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    List<Product> products = List.of(
        (new Product(1, "ノートパソコン", 120000)),
        (new Product(2, "スマートフォン", 80000)),
        (new Product(3, "イヤホン", 12000))
    );

    /*Product product1 = new Product(1, "ノートパソコン", 120000);
    Product product2 = new Product(2, "スマートフォン", 80000);
    Product product3 = new Product(3, "イヤホン", 12000);*/

    @GetMapping("/products")
    public String prodects(Model model) {

        model.addAttribute("products", products);
        return "product-list";
    }

    @GetMapping("/products/{id}")
    public String getProduct(Model model, @PathVariable int id) {

        Product product = products.stream()
        .filter(p -> p.getId() == id)
        .findFirst()
        .orElse(null);

        model.addAttribute("product", product);
        return "product-detail";
    }
}
