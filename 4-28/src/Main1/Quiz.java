import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quiz {
    private WordManager wordManager;
    private int score;
    private int totalQuestions;
    private List<Word> quizWords;

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
        int index = random.nextInt(quizWords.size());
        Word word = quizWords.get(index);
        return word;
    }

    public int getScore() {
        return score;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void copyWord() {
        quizWords = new ArrayList<>(wordManager.getWords());
    }

    public void removeWord(Word word) {
        quizWords.remove(word);
    }

    public int getQuizWordcount() {
        return quizWords.size();
    }
    public void removeScore(){
        score = 0;
        totalQuestions = 0;

    }
}
