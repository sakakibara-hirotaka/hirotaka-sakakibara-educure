package Main1;

public class Calculator {

    public int divide(int a,int b) {
            if (b == 0) {
                throw new ArithmeticException("0で割ることはできません"); 
            }
            return a/b;
    }
}


