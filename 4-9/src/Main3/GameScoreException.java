package Main3;

public abstract class GameScoreException extends Exception{
    
    //ゲームスコア例外
    private int score;

    public GameScoreException(String message , int score){
        super(message);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

}
