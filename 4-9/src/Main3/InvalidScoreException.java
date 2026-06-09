package Main3;

public class InvalidScoreException extends GameScoreException{

    //無効な例外スコア
    public InvalidScoreException(int score) {
        super("エラー: Score cannot be negative",score);
    }
}
