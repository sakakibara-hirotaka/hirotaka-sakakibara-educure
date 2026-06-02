package Main3;

public class Product {
    
    private String name;
    private int stock;

    public Product(String name , int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        this.stock += amount;
        System.out.println(amount + "個追加しました");
    }

    public void removeStock(int amount) {     
         if (amount <= 0) {
            System.out.println("正しい数を入力してください");
        } else if (stock < amount) {
            System.out.println("エラー: 在庫が不足しています");
            return;
        }else {
            this.stock -= amount;
            System.out.println(amount + "個販売しました");
        }
    }

    public void merchandise() {
        System.out.println("商品名: " + this.name + "\n在庫数: " + this.stock + "個");
    }

}
