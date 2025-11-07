public class Main9 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 =5;
        char operator = '+';
        int result =0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("結果: " + result);
                break;

            case '-' :
                 result = num1 - num2;
                System.out.println("結果: " + result);
                break;

            case '*' :
                result = num1 * num2;
                System.out.println("結果: " + result);
                break;

            case '/' :
                if (num2 == 0) {
                    System.out.println("エラー : 0で割ることはできません") ;
                } else {
                    result = num1/num2 ;
                    System.out.println("結果: " + result);
                }
                break;

            default :
                System.out.println("エラー: 無効な演算子です");
                break;
            
            

        }

    }
}
