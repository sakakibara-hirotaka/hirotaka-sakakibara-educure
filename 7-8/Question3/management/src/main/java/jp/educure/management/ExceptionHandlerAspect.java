package jp.educure.management;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
@Component
public class ExceptionHandlerAspect {
    
    @AfterThrowing(pointcut = "execution(* jp.educure.management.*.*(..))", throwing = "e")
        public void handleExceptopn(Exception e){
        System.out.println(e.getMessage());
    } 
}


