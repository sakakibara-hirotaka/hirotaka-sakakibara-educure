package Main3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateStock {
    public static void main(String[] args) {
        
        String url = "jdbc:postgresql://localhost:5432/educure_db";
        String user = "postgres";
        String password = "CYV94XpcfV";
        String checkStockSQL = "SELECT COUNT(*) FROM products WHERE stock > 0";
        String updateSQL = "UPDATE products SET stock = CASE WHEN stock >= 10 THEN stock - 10 ELSE 0 END";
        String selectSQL = "SELECT * FROM products ORDER BY product_id";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            throw new IllegalStateException("ドライバーのロードに失敗しました");
        }

        Connection con = null;
        

        try {
            con = DriverManager.getConnection(url,user,password);
            PreparedStatement check = con.prepareStatement(checkStockSQL);
            ResultSet rs = check.executeQuery();
            
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count == 0) {
                    System.out.println("在庫がありません");
                    return;
                } 
            else {
                PreparedStatement pstmt = con.prepareStatement(updateSQL);
                pstmt.executeUpdate();
                System.out.println("在庫が正常に更新されました。");
                pstmt.close(); 
            }
        }
            //在庫表示
            PreparedStatement show = con.prepareStatement(selectSQL);
            ResultSet rs2 = show.executeQuery();
            while (rs2.next()) {
                System.out.println(rs2.getInt("product_id") + " | "
                + rs2.getString("product_name") + " | "
                + rs2.getInt("price") + " | "
                + rs2.getInt("stock"));
            }
            
            rs2.close();
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
