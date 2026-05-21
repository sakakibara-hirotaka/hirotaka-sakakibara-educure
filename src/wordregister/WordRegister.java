package wordregister;

import java.util.Scanner;

public class WordRegister {
    public static String[][] tester() {
        Scanner scanner = new Scanner(System.in);

        String[] englishWords = new String[20];
        String[] japaneseWords = new String[20];
        int counter = 0;

        while (true) {

            if (counter >= 21) {
                System.out.println("登録可能数上限に達しました。");
                break;
            }

            System.out.print("「end」を入力すると登録を終了します" + "\n英単語を入力してね:");
            String eng = scanner.nextLine();

            // endが入力されたら登録を終了
            if (eng.equalsIgnoreCase("end")) {
                break;
            }

            System.out.print("日本語訳を入力してね: " + "現在の数" +counter);
            String jp = scanner.nextLine();

            // 配列に保存
            englishWords[counter] = eng;
            japaneseWords[counter] = jp;
            counter++;
        }
        return new String[][] { englishWords, japaneseWords };
    }
}
