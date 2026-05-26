package wordregister;

import java.util.Scanner;

public class WordRegister {

    static int counter = 0;
    static String[] englishWords = new String[20];
    static String[] japaneseWords = new String[20];

    public static String[][] tester() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            boolean duplication = true;
            if (counter >= 20) {
                System.out.println("登録可能な単語数は20個までです。");
                return new String[][] {englishWords, japaneseWords};
            }

            System.out.print("英単語を入力してください:\n");
            String eng = scanner.nextLine();
                
            //重複チェック
            for (int i =0; i<counter; i++) {
                if (englishWords[i].equals(eng)) {
                System.out.println("すでに入力されています");
                duplication = false;
                }
            }

            if (duplication == false) {
                continue;
            }

            System.out.print("日本語訳を入力してください:\n");
            String jp = scanner.nextLine();

            // 配列に保存
            englishWords[counter] = eng;
            japaneseWords[counter] = jp;
            counter++;
            
            return new String[][] {englishWords, japaneseWords };
        }
    }
}
