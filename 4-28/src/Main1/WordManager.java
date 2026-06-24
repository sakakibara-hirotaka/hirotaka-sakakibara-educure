
import java.util.ArrayList;
import java.util.List;

public class WordManager {
    private ArrayList<Word> words = new ArrayList<>();

    public WordManager(){
    }

    public void addWord(Word word) {
            words.add(word);
        }
  

    public List<Word> getWords(){
        return words;
    }

    public int getWordCount() {
        return words.size();
    }
    //return countにしていた
}
