package jp.educure.tutorial;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {
    
    @Order(1)
    @Before("execution(* jp.educure.tutorial.PaymentService.*(..))")
    public void beforeCheck() {
        System.out.println("[認証チェック] processPayment を実行する前に認証を確認中...");
    }
}
