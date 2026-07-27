package jp.educure.tutorial.Spring53;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a ,int b) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return a + b;
    }

    public int subtract(int a ,int b) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        if(b == 0) {
        throw new ArithmeticException("Division by zero");
        }
    
        return a/b;
    }
}