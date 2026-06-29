package Main5;

import java.sql.*;

public class  ProductMaintenance {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db";
        String username = "postgres";
        String password = "CYV94XpcfV";
        String priceZeroSQL = "UPDATE products SET price = 0 WHERE stock = 0";
        String productRemoveSQL = "DELETE FROM products WHERE price >= 200000";
        String productUpdateSQL = "UPDATE products SET stock = 20 WHERE price >= 100000 AND stock <= 10";
        String showProduct = "SELECT * FROM products ORDER BY product_id" ;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            throw new IllegalStateException();
        }

        Connection con = null;

        try {
            con = DriverManager.getConnection(url, username, password);
            con.setAutoCommit(false);
            PreparedStatement priceZero = con.prepareStatement(priceZeroSQL);
            int zeroResult = priceZero.executeUpdate();
            PreparedStatement productRemove = con.prepareStatement(productRemoveSQL);
            int removeResult = productRemove.executeUpdate();
            PreparedStatement productUpdate = con.prepareStatement(productUpdateSQL);
            int updateResult = productUpdate.executeUpdate();
            PreparedStatement show = con.prepareStatement(showProduct);
            ResultSet rs = show.executeQuery();
                
            System.out.println("影響を受けた行数 (在庫数0の商品価格を0に設定): " + zeroResult);
            System.out.println("影響を受けた行数 (価格が200000以上の商品削除): " + removeResult);
            System.out.println("影響を受けた行数 (価格100000以上、在庫数10以下の商品を在庫数20に更新): " + updateResult);
            con.commit();
            while (rs.next()) {
                System.out.println(rs.getInt("product_id") + "|"
                                 + rs.getString("product_name") + "|"
                                 + rs.getInt("price") + "|"
                                 + rs.getInt("stock"));
            }
            rs.close();
        } catch (SQLException e) {
            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException ee) {
                    ee.printStackTrace();
                }
            }
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