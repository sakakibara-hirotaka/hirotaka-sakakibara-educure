import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class WordManager {
    DBManager dbManager;
    public WordManager(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    public void addWord(Word word) {
        //wordから受け取ってデータベースに保存
        String add = "INSERT INTO words (english,japanese) VALUES (?,?)";

        try (Connection con = dbManager.getConnection();
            PreparedStatement pstmt = con.prepareStatement(add)){

            pstmt.setString(1, word.getEnglish());
            pstmt.setString(2, word.getJapanese());
            
            pstmt.executeUpdate();          
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public List<Word> getWords() {
        List<Word> words = new ArrayList<>(); 
        String word = "SELECT english, japanese FROM words ";
        try (Connection con = dbManager.getConnection();
            PreparedStatement pstmt =  con.prepareStatement(word)){
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String eng = rs.getString("english");
                String jap = rs.getString("japanese");
                Word getword = new Word(eng, jap);
                words.add(getword);
            }
            rs.close();
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("単語の取得に失敗しました");
        }
        return words;
    }

    public int getWordCount() {
        String getEng = "SELECT COUNT(english) FROM words";
        int engCount = 0;
        try (Connection con = dbManager.getConnection();
            PreparedStatement pstmt = con.prepareStatement(getEng)){
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                engCount = rs.getInt(1);        
            }
            rs.close();
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("単語の合計数の取得に失敗しました");
        }
        return engCount;
    }

    public void deleteWord(String english) {
        String delete = "DELETE FROM words WHERE english = ?";
        try (Connection con = dbManager.getConnection();
            PreparedStatement pstmt = con.prepareStatement(delete)) {
            pstmt.setString(1, english);
            int r = pstmt.executeUpdate();
            if (r == 0) {
                System.out.println("該当するワードはありませんでした。");
            } else {
                System.out.println("単語を削除しました");
            }

        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void updateWord(String english, String newJapanese) {
        String update = "UPDATE words SET japanese = ? WHERE english = ?";
        try (Connection con = dbManager.getConnection();
            PreparedStatement stmt = con.prepareStatement(update)) {
            stmt.setString(1, newJapanese);
            stmt.setString(2, english);
            int result = stmt.executeUpdate();
            if (result == 0) {
                System.out.println(english + "は登録されていません。");
            } else {
                System.out.println("単語を更新しました");
            }
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("日本語の更新に失敗しました" + e.getMessage());
        }
    }
}
