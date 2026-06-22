import java.util.Random;

public class Quiz {
    private WordManager wordManager;
    private int score;
    private int totalQuestions;

    public Quiz(WordManager wordManager) {
        this.wordManager = wordManager;
    }

    public String checkAnswer(Word word, String answer) {
        if(word.getJapanese().equals(answer)) {
            totalQuestions++;
            score++;
            return("正解です!\n");
        } else {
            totalQuestions++;
            return ("不正解です。 正解は" + word.getJapanese() + "でした。\n"); 
        }
    }

    public Word getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(wordManager.getWords().size());
        Word word = wordManager.getWords().get(index);
        return word;
    }

    public int getScore() {
        return score;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }
}
