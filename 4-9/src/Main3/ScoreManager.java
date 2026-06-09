package Main3;

//スコア管理
public class ScoreManager {

    public void validateScore(int score) throws InvalidScoreException,ScoreOverflowException{
        if (score < 0 ){
            throw new InvalidScoreException(score);
        } else if(score > 100) {
            throw new ScoreOverflowException(score);
        }
    }
}
