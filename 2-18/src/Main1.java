public class Main1 {
    public static void main(String[] args) {
        int price = 1000;  // 商品価格
        int quantity = 3;  // 数量
        // ここにコードを書いてください
        System.out.println("商品価格: " + price  + "円" + ", 数量: " + quantity);
        int tax = total(price, quantity);
        System.out.println("合計金額(税込): " + tax + "円");
    }

    public static int total(int price, int quantity) {
        int result = price*quantity;
        int tax = result + (result/10);
        return tax;
}
}