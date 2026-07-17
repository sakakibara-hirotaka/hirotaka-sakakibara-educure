package jp.educure.tutorial;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {

    @After("execution(* jp.educure.tutorial.PaymentService.*(..))")
    public void afterCheck() {
        System.out.println("[ログ出力] processPayment メソッドの実行が完了しました。");
    }
}
