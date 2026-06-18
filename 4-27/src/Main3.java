import java.io.*;
import java.net.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        // 検索キーワードを設定
        String keyword = "Java";
        
        // Googleの検索URLに検索キーワードを付けてURLを作成
        String searchURL = "https://www.google.com/search?q=" + URLEncoder.encode(keyword, "UTF-8");

        URL url =new URL(searchURL);
        InputStream is = url.openStream();
        InputStreamReader isr = new InputStreamReader(is);

        int i = isr.read();

        while (i != -1) {
            System.out.print((char)i);
            i = isr.read();
        }
        isr.close();
    }
}