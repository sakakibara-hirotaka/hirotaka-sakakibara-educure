public class Main3 {
    public static void main(String[] args) {
        String input = "Hello";  // 逆順にする文字列
        // ここにコードを書いてください

        System.out.println("入力: " + "\"" +input + "\"");
        
        String opposition = reverseString(input);
        System.out.println("出力: " + "\"" +opposition + "\"");
    }

    public static String reverseString(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return reversed;
    }
}