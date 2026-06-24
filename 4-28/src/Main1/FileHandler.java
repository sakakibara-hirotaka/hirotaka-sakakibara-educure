import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandler  {
    
    public void exportToCSV(List<Word> words, String filename) throws IOException{
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
            for (Word word : words) {
                bw.write(word.getEnglish() + "," + word.getJapanese() +"\n");
            }
        } 
    }

    public void importFromCSV(String filename, WordManager wordManager) throws IOException{

        try (FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader)){
                
            String line;

            while((line = br.readLine()) != null) {
            String[] values = line.split(",");
            Word word = new Word(values[0], values[1]);
            wordManager.addWord(word);
            }   
        } 
    }
}
