import java.util.Random;
import java.util.List;

public class Quiz {
    WordManager wordManager;
    private int score;
    private int totalQuestions;
    
    public Quiz(WordManager wordManager) {
        this.wordManager = wordManager;
    }

    public void checkAnswer(Word word , String answer) {
        if (!word.getJapanese().equals(answer)) {
            totalQuestions++;
            System.out.println("不正解です。 正解は" + word.getJapanese() + "です。");
        } else {
            score++;
            totalQuestions++;
            System.out.println("正解です。");
        }
    }

    public Word getRandomWord(List<Word> words) {
        Random random = new Random();
        int total = words.size();
        int randomNumber = random.nextInt(total);
        Word randomWord = words.get(randomNumber);
        return randomWord;
    }

    public int getScore() {
        return score;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void totalQuestionsScoreReset() {
        totalQuestions = 0;
        score = 0;
    }
}
