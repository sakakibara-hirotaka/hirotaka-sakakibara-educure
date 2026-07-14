package jp.educure.probrem4.paymentprocessor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jp.educure.probrem4.paymentprocessor.payment.PaymentProcessor;

@Component
public class OrderService{
    private final PaymentProcessor paymentProcessor;

    @Autowired
    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(double amount) {
        System.out.println("注文を受け付けました。支払いを処理中...");

        paymentProcessor.processPayment(amount);
        System.out.println("注文が正常に処理されました。");
    }
}