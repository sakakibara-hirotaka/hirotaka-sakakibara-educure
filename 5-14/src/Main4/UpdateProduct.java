package Main4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateProduct {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db";
        String user = "postgres";
        String password = "CYV94XpcfV";

        String updatePriceSQL = "UPDATE products SET price = price - 5000 WHERE product_name = 'タブレット'";
        String updateStockSQL = "UPDATE products SET stock = stock + 5 WHERE price < 50000";
        String selectSQL = "SELECT * FROM products ORDER BY product_id";

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            throw new IllegalStateException("ドライバーのロードに失敗しました");
        }

        Connection con = null;

        try {
            con =DriverManager.getConnection(url, user, password);
            PreparedStatement updateprice = con.prepareStatement(updatePriceSQL);
            int resultPrice = updateprice.executeUpdate();
            System.out.println("価格を値下げした行数: " + resultPrice);
            PreparedStatement updateStock = con.prepareStatement(updateStockSQL);
            int resultStock = updateStock.executeUpdate();
            System.out.println("在庫を増やした行数: " + resultStock + "\n");
            PreparedStatement pstmt = con.prepareStatement(selectSQL);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String product_id = rs.getString("product_id");
                String name = rs.getString("product_name");
                int price = rs.getInt("price");
                int stock = rs.getInt("stock");

                System.out.println(product_id + "|" + name + "|" + price + "|" + stock + "|");
            }
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
