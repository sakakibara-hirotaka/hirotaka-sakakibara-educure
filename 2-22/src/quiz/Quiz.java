package quiz;

import java.util.Scanner;

public class Quiz {
    public static void quiz(String[][] words) {
        Scanner scanner = new Scanner(System.in);

        String[] englishWords = words[0];
        String[] japaneseWords = words[1];

        int answer =0;
        int total = 0;

        for (int i = 0; i < japaneseWords.length; i++) {
            if (englishWords[i] == null) break;

        System.out.print(englishWords[i] + "の意味は？");
        String correct = scanner.nextLine();

        if (correct.equalsIgnoreCase("end")) break;
        
        if (japaneseWords[i].equals(correct)) {
            System.out.println("正解です!");
            answer++;
        } else {
            System.out.println("不正解です。 正解は、「" + japaneseWords[i] + "」です");
        }
            total++;
        }
        
        System.out.println("クイズ終了!");
        System.out.println(total+ "問中" + answer + "問正解でした!");    
    }   
}
