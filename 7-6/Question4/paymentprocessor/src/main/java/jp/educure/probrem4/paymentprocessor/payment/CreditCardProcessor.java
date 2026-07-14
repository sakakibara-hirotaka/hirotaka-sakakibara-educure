package jp.educure.probrem4.paymentprocessor.payment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditCardProcessor implements PaymentProcessor{
    
    @Override
    public void processPayment(double amount) {
        
        System.out.println( "クレジットカードで支払いを処理中: ¥" + amount);
    }
}