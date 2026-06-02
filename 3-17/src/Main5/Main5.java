package Main5;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        // プレイヤーのスコアリストを作成
        List<GameScore> scores = new ArrayList<>();
        scores.add(new GameScore("タナカサン", 100));
        scores.add(new GameScore("サトウサン", 300));
        scores.add(new GameScore("スズキサン", 200));

        // ソート前のスコアを表示
        System.out.println("ソート前：");
        for (GameScore score : scores) {
            System.out.println(score);
        }

        // スコア順（昇順）でソート
        Collections.sort(scores);

        // ソート後のスコアを表示
        System.out.println("\nソート後：");
        for (GameScore score : scores) {
            System.out.println(score);
        }
    }
}