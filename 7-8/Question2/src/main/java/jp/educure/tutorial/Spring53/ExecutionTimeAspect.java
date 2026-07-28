package jp.educure.tutorial.Spring53;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    @Around("execution (* jp.educure.tutorial.Spring53.CalculatorService.*(..))")
    public Object measureTime(ProceedingJoinPoint joinPoint) throws Throwable {
        Long startTime = System.currentTimeMillis();
   
        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        
        long executionTime = endTime - startTime;

        String methodName = joinPoint.getSignature().toString();

        System.out.println("execution(" + methodName + ") executed in " + executionTime + " ms");

        return result;
    }
    
}