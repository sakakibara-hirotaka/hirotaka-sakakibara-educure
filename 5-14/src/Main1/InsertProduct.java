import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertProduct {
    public static void main(String[] args) {

    String url = "jdbc:postgresql://localhost:5432/educure_db";
    String user = "postgres";
    String password = "CYV94XpcfV";
    String insertSQL = "INSERT INTO products(product_name, price, stock) VALUES(?,?,?)";

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            throw new IllegalStateException("ドライバーのロードに失敗しました");
        }
        
        Connection con =null;

        try {
            con = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = con.prepareStatement(insertSQL);
            pstmt.setString(1, "スマートフォン");
            pstmt.setInt(2, 80000);
            pstmt.setInt(3, 30);
            pstmt.executeUpdate();
            System.out.println("商品が正常に追加されました。");
            pstmt.close();

            PreparedStatement pstmt2 = con.prepareStatement( "SELECT * FROM products ORDER BY product_id");
            ResultSet rs = pstmt2.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("product_id") + " | "
                + rs.getString("product_name") + " | "
                + rs.getInt("price") + " | "
                + rs.getInt("stock"));
            }

        rs.close();
        pstmt.close();
        
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
        

    }
}
