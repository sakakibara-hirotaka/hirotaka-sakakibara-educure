package Main2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<Integer>();
             
        score.add(85);
        score.add(92);
        score.add(78);
        score.add(55);
        score.add(43);

        System.out.println("点数リスト: " + score);

        Iterator<Integer> scores = score.iterator();

        double sum = 0;
        int MaxScore = 0;
        int failCount = 0;

        while(scores.hasNext()) {
            Integer s = scores.next();
            sum += s;
            if(s > MaxScore){
                MaxScore = s;
            }
            if (s <= 60) {
                failCount++;
            } 
        }
        
        System.out.println("平均点: " + (sum/score.size()));
        System.out.println("最高点: " + MaxScore);
        System.out.println("不合格者数: " + failCount);
                
    }    
}
