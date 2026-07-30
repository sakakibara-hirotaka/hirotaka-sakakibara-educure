package jp.educure.product;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
}


   /* @GetMapping("/product/1")
    public String productId(Model model1){
        model1.addAttribute("product1" , "商品1-¥1000.0");
        return "productDetail";
    }

    @GetMapping("/product/2")
    public String productId2(Model model2){
        model2.addAttribute("product2" , "商品2-¥2000.0");
        return "productDetail"; 
    }

    @GetMapping("/product/3")
    public String productId3(Model model3){
        model3.addAttribute("product3" , "商品3-¥3000.0");
        return "productDetail"; 
    }
    
}
*/