package Main3;

import java.io.File;

public class Main3 {
    public static void main(String[] args) {

        File folder = new File("exercise_folder");
        if(!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("フォルダを作成しました。");
            } else {
                System.out.println("フォルダの作成に失敗しました");
            }
        } else{
            System.out.println("フォルダは既に存在します。");
        }

        try {
            File file = new File(folder,"exercise_file.txt");
            if (file.createNewFile()) {
                System.out.println("ファイルを作成しました。");
            } else {
                System.out.println("ファイルは既に存在します");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ファイルの作成中にエラーが発生しました。");
        }
        
    }
}
