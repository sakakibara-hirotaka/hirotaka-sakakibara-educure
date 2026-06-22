
import java.util.ArrayList;

public class WordManager {
    ArrayList<Word> words = new ArrayList<>();

    public WordManager(){
    }

    public void addWord(Word word) {
        if (words.size() > 1000) {
            System.out.println("これ以上単語の登録できません");
        } else {  
            words.add(word);
        }
    }

    public ArrayList<Word> getWords(){
        return words;
    }

    public int getWordCount() {
        return words.size();
    }
    //return countにしていた
}
