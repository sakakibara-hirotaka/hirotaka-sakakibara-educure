package jp.educure.probrem5.paymentprocessor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/orders")
public class OrderController {
    
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
       
    @PostMapping("/process")
    public String processOrder(@RequestParam("amount") double amount) {
        //TODO: process POST request
        
        orderService.processOrder(amount);
        return  "注文が正常に処理されました";
    }
}