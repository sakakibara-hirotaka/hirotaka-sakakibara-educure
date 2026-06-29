import java.sql.*;

public class DBManager {
    private Connection connection;
    String URL = "jdbc:postgresql://localhost:5432/vocabulary_db";
    String USER = "postgres";
    String PASSWORD = "CYV94XpcfV";

    public DBManager() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            initalizeDatabase();
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    } 

    public void initalizeDatabase(){
        String sql = "CREATE TABLE IF NOT EXISTS words ("
                   + "id SERIAL PRIMARY KEY,"
                   + "english VARCHAR(100) NOT NULL,"
                   + "japanese VARCHAR(100) NOT NULL,"
                   + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP);";
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        } 
    }

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("接続に失敗しました" + e.getMessage());
        }
        return connection;
    }

    public void close() {
        try {
            if (connection != null) {
            connection.close();
            }
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
