package Main2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Main2 {
    public static void main(String[] args) {
        
        try {
            String query = "title = java";
            String encodedQuery = URLEncoder.encode(query, "UTF-8");
            String endpoint = "https://ndlsearch.ndl.go.jp/api/sru";
            String requestUrl = endpoint + "?opration = searchRetrieve" + "&version1.2" + "&Query=" + encodedQuery + "&miximumRecirds=10" + "&recordSchema=dc";

            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            InputStream is= conn.getInputStream();
            InputStreamReader isr = new InputStreamReader(is); 
            BufferedReader br = new BufferedReader(isr);
            String read = br.readLine();

            while(read != null) {
                System.out.println(read);
                read = br.readLine();
            }
            isr.close();    

        
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
