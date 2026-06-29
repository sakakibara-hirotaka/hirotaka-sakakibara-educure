import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FileHandler {
    DBManager dbManager = new DBManager();

    public void exportTOSCV(List<Word> words, String filenames) {
        try ( FileWriter writer = new FileWriter(filenames);
            BufferedWriter bw = new BufferedWriter(writer)){
                
            for (Word word : words) {
                bw.write(word.getEnglish() + "," + word.getJapanese() + "\n");    
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        } 
    }
    int count = 0;
    public void importFromCSV(String filename, WordManager wordManager) throws IOException{
        count = 0;
        String insertSQL = "INSERT INTO words (english,japanese) VALUES (?,?)";

        try (Connection con = dbManager.getConnection();
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            PreparedStatement pstmet = con.prepareStatement(insertSQL)){
            
            con.setAutoCommit(false);
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length < 2) {
                    throw new IllegalArgumentException();
                } else {
                    String eng = values[0];
                    String jp = values[1];
                    pstmet.setString(1,eng);
                    pstmet.setString(2,jp);
                    pstmet.addBatch();
                    count++;
                }
                pstmet.executeUpdate();
                con.commit();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getCount() {
        return count;
    }
}
