package Main1;

public class Main1 {

    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "World";

        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        String result = sb.toString();
        
        String cut= sb.substring(2 , 7);

        System.out.println("元の文字列1: " + str1);
        System.out.println("元の文字列2: " + str2);
        System.out.println("連結後: " + result);
        System.out.println("部分文字列(3-7): " + cut);

    }
        
}
       