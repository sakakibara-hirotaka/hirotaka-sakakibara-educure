package main1.process;

public class ProcessString {
    public static void processString(String input) {

        String change = input.toUpperCase();
        int len = change.length();

        System.out.println("大文字: " + change);
        System.out.println("文字数: " + len);
    }
}
