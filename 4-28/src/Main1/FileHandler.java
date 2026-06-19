import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandler  {
    
    public void exportToCSV(List<Word> words, String filename) throws IOException{
        FileWriter file = new FileWriter(filename);
        try {
            for(Word word : words) {
            file.write(word.getEnglish() + "," + word.getJapanese() +"\n");
        }
        file.close();
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void importFromCSV(String filename, WordManager wordManager) throws IOException{

        FileReader reader = new FileReader(filename);
        BufferedReader br = new BufferedReader(reader);
        String line;

        while((line = br.readLine()) != null) {
            String[] values = line.split(",");

            Word word = new Word(values[0], values[1]);
            wordManager.addWord(word);
        }
        br.close();
    }
}
