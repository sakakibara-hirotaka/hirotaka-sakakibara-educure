import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Main1 {
    public static void main(String[] args) {
        
       String fileName = "excersise.csv";

       try(PrintWriter writer = new PrintWriter(fileName)) {
            writer.println("名前,年齢,職業");
            writer.println("山田,28,プログラマー");
            System.out.println("CSVファイルを作成しました: " + fileName);
       } catch (IOException e) {
        // TODO: handle exception
        e.printStackTrace();
       }

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            br.readLine();
            String line = br.readLine();
            String[] values = line.split(",");
            for (String value : values) {
            System.out.println(value);
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
