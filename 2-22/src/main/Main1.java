package main;

import java.util.Scanner;
import wordregister.WordRegister;
import quiz.Quiz;

public class  Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] words = null;

        //メニュー画面
        System.out.println("```bash");
        while (true) {
            System.out.println("1: 単語を登録する");
            System.out.println("2: クイズを受ける");
            System.out.println("3: 終了する");

            if (!scanner.hasNextInt()) {
                System.out.println("1-3の数字を入力してください。\n");
                scanner.next();
                continue;
            }
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                words = WordRegister.tester();
            } else if (choice == 2) {
                if (words == null) {
                    System.out.println("単語が登録されていません。\n");
                } else {
                    Quiz.quiz(words);
                    }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("1-3の数字を入力してください。\n");
            }
        }
        scanner.close();
    }
}
