package jp.educure.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main4 {
    public static void main(String[] args) {
        var context = SpringApplication.run(Main4.class, args);
        OrderService service = context.getBean(OrderService.class);
        service.processOrder();
    }
}

