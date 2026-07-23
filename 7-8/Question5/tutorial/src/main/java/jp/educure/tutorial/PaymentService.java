package jp.educure.tutorial;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void processPayment() {
        try {
            Thread.sleep(500); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("支払い処理を実行中...");
        System.out.println("支払い完了");
    }
}
