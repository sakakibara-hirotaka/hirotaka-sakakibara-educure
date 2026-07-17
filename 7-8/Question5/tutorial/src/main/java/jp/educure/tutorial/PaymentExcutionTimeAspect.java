package jp.educure.tutorial;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PaymentExcutionTimeAspect {

    @Around("execution(* jp.educure.tutorial.PaymentService.*(..))")
    public Object ExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        Object result = joinPoint.proceed();
        long end = System.nanoTime();
        long ms = (end - start)/1000000;
        System.out.println("[実行時間] processPayment: " + ms + "ms");
        return result;
    }
}
