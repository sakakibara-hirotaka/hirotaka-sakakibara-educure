package Main3;

public class Main3 {
    public static void main(String[] args) {
        
        Product product = new Product("りんご", 100);

        product.merchandise();
        product.removeStock(50);
        product.merchandise();
        product.addStock(10);
        product.merchandise();
        product.removeStock(61);
        //.merchandise();
    }
}
