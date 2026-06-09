package Main3;

//スコアオーバーフロー例外
public class ScoreOverflowException extends GameScoreException{
    
    public ScoreOverflowException(int score){
        super("エラー: Score cannot exceed 100 ",score);
    }
}
