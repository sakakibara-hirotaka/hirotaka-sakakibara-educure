package Main1;

import java.io.*;


public class Main1 {
    public static void main(String[] args) {
        
        try {
            FileWriter writer = new FileWriter("exercise.txt");
            writer.write("Hello,World!");
            writer.flush();
            writer.close();
            System.out.println("ファイルに書き込みが完了しました。");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("ファイルの書き込み中にエラーが発生しました。");
        }
    }
}
