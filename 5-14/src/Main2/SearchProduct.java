package Main2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchProduct {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db";
        String user = "postgres";
        String password = "CYV94XpcfV";
        String query = "SELECT product_name, price FROM products WHERE price >= ?";

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            throw new IllegalStateException("ドライバーのロードに失敗しました");
        }

        Connection con = null;

        try {
            con = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, 100000);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("product_name");
                int price = rs.getInt("price");
                System.out.println("商品名: " + name + ", 価格: " + price);
            }

            pstmt.close();
            rs.close();
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
    }
}
