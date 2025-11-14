package quiz;

import java.util.Scanner;

public class Quiz {
    public static void quiz(String[][] words) {
        Scanner scanner = new Scanner(System.in);

        String[] englishWords = words[0];
        String[] japaneseWords = words[1];

        int ansawer =0;
        int tortal = 0;

        for (int i = 0; i < japaneseWords.length; i++) {
            if (englishWords[i] == null) break;

        System.out.print(englishWords[i] + "の意味は？");
        String correct = scanner.nextLine();

        if (correct.equalsIgnoreCase("end")) break;
        
        if (japaneseWords[i].equals(correct)) {
            System.out.println("正解です!");
            ansawer++;
        } else {
            System.out.println("不正解です");
        }
            tortal++;
        }
        
        System.out.println("クイズ終了!");
        System.out.println(tortal+ "門中" + ansawer + "問正解でした。!");    
    }   
}
