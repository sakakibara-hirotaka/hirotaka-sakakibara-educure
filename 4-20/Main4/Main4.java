package Main4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.File;

public class Main4 {
    public static void main(String[] args) {

        File file = new File("source.txt");
        File folder = new File("backup");
        File folder2 = new File("archive");

        try {
            if(!file.exists()) {
            file.createNewFile();
            }    
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("ファイルの作成に失敗しました");
        }

        if(!folder.exists()) {
            folder.mkdir();
        }

        if(!folder2.exists()) {
            folder2.mkdir();
        }
        
        Path source = Paths.get("source.txt");
        Path backup = Paths.get("backup","source.txt");
        Path archive = Paths.get("archive","source.txt");

        try {
        Files.copy(source,backup);
        System.out.println("ファイルが 'backup/' にコピーされました。");
            if (Files.exists(backup)) {
                System.out.println("コピーの確認:成功");
            }
        Files.move(backup,archive);
        System.out.println("ファイルが 'archive/' に移動されました。");
        if (Files.exists(archive)) {
                System.out.println("移動の確認:成功");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
