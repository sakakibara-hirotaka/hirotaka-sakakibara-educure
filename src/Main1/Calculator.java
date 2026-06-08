package Main1;

public class Calculator {

    public int divide(int a,int b) throws Calculited{
            if (b == 0) {
                throw new Calculited("0で割ることはできません"); 
            }
            return a/b;
    }
}


