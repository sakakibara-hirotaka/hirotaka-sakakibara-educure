package Main5;


public class GameScore implements Comparable<GameScore> {
    private String playerName; // プレイヤー名
    private int score;        // スコア
    
    public GameScore(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }
    
    // このメソッドで、2つのGameScoreを比較したときの順序を決定します
    // 例：scores.sort()したとき、
    // 100点 < 200点 < 300点 という順番で並びます
    @Override
    public int compareTo(GameScore other) {
        // Integer.compare()を使って、よりシンプルに比較
        // 自分のスコア(this.score)と相手のスコア(other.score)を比較
        // 昇順（小さい順）で並べるため：
        // - 自分が小さいとき → 負の数を返す → 前に来る
        // - 自分が大きいとき → 正の数を返す → 後ろに来る
        return Integer.compare(this.score, other.score);
        
        // 上のコードは、以下の処理と同じ意味です：
        // if (this.score < other.score) return -1;  // 自分のスコアが小さい
        // if (this.score > other.score) return 1;   // 自分のスコアが大きい
        // return 0;                                 // 同点
    }

    // 結果を見やすく表示するためのメソッド
    @Override
    public String toString() {
        return playerName + ": " + score + "点";
    }
}