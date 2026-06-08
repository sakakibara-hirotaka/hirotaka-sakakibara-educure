package Main1;

public class Main1{
    
    public static void main(String[] args) {

        int a = 10;
        int b =0;

        Calculator calc = new Calculator();
        
        try {
            int result = calc.divide(a,b);
            System.out.println(a + " ÷ " + b + " = " + result); 
        } catch (Calculited e) {
            // TODO: handle exception
            System.out.println(a + " ÷ " + b +" = エラー：" + e.getMessage() );
        }

    }
}



