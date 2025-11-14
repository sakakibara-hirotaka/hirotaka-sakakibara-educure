package test;

import java.util.Scanner;

public class Test {
    public static String[][] tester() {
        Scanner scanner = new Scanner(System.in);

        String[] englishWords = new String[20];
        String[] japaneseWords = new String[20];
        int counter = 0;

        while (counter < 20) {
            System.out.print("英単語を入力してね: ");
            String eng = scanner.nextLine();

            // endが入力されたら登録を終了
            if (eng.equalsIgnoreCase("end")) {
                break;
            }

            System.out.print("日本語訳を入力してね: ");
            String jp = scanner.nextLine();

            // 配列に保存
            englishWords[counter] = eng;
            japaneseWords[counter] = jp;
            counter++;

            if (counter >= 20) {
                System.out.println("エラー: 登録可能な単語数は20個までです。");
                break;
            }
        }
        return new String[][] { englishWords, japaneseWords };
    }
}
