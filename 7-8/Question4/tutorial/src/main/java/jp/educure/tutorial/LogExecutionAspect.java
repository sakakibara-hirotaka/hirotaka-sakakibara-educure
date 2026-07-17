package jp.educure.tutorial;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogExecutionAspect {

    @Around("@annotation(LogExecution)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("[LOG] 開始: " + joinPoint.getSignature());

        try {
            Object result = joinPoint.proceed();
            return result;

        } finally {
            System.out.println("[LOG] 終了: " + joinPoint.getSignature());
        }
    }
}