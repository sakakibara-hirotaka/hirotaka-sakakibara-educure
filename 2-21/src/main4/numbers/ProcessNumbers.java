package numbers;

import java.util.ArrayList;
import java.util.Collections;

public class  ProcessNumbers{
    public static void processNumbers(ArrayList<Integer> numbers) {
        // ここにコードを書いてください
        System.out.println("元のリスト: " + numbers);

        //ソート
        Collections.sort(numbers);
        System.out.println("ソート後: "  + numbers);

        //最大
        int max = Collections.max(numbers);
        System.out.println("最大値: " + max);

        //最小

        int min = Collections.min(numbers);
        System.out.println("最小値: " + min);

    }
}