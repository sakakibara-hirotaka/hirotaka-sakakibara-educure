package Main2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main2 {
    public static void main(String[] args) {
        Properties filePath = new Properties();

        try (FileInputStream fis = new FileInputStream("C:\\Users\\sakak\\OneDrive\\Desktop\\educure\\4-22\\src/Main2/excersise.properties")) {
            filePath.load(fis);
            System.out.println("username=" + filePath.getProperty("username"));
            System.out.println("password=" + filePath.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
