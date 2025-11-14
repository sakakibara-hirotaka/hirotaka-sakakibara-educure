package main;

import java.util.Scanner;
import test.Test;
import quiz.Quiz;

public class  Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] words = null;

        //メニュー画面
        while (true) {
            System.out.println("1,2,3を入力してしたいことを選んでね。\n");
            System.out.println("1: 英語登録テスト");
            System.out.println("2: クイズ機能");
            System.out.println("3: 終了");
            System.out.print("数字を入力してください: ");

            if (!scanner.hasNextInt()) {
                System.out.println("1-3の数字を入力してください。\n");
                scanner.next();
                continue;
            }
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                words = Test.tester();
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
