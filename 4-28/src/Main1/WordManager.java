
import java.util.ArrayList;

public class WordManager {
    ArrayList<Word> words = new ArrayList<>();

    public WordManager(){
    }

    public void addWord(Word word) {
            words.add(word);
        }
  

    public ArrayList<Word> getWords(){
        return words;
    }

    public int getWordCount() {
        return words.size();
    }
    //return countにしていた
}
