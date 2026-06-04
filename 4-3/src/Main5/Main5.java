package Main5;

import java.util.ArrayList;
import java.util.Objects;

public class Main5 {
    private String name;  // アイテムの名前
    private int price;    // アイテムの価格

    // コンストラクタを作ります
    public Main5(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    // equalsメソッドをオーバーライド
    @Override
    public boolean equals(Object obj) {
        // 同じインスタンスなら true
        if (this == obj) return true;
        // nullまたは別のクラスなら false
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // Item型にキャストして、nameとpriceを比較
        Item other = (Item) obj;
        return price == other.price && 
               Objects.equals(name, other.name);
    }
    
    // hashCodeメソッドをオーバーライド
    @Override
    public int hashCode() {
        // nameとpriceの値からハッシュ値を生成
        return Objects.hash(name, price);
    }

    public static void main(String[] args) {
        // アイテムのリストを作ります
        ArrayList<Item> inventory = new ArrayList<>();
        // アイテムを追加します
        inventory.add(new Item("ポーション", 100));
        inventory.add(new Item("エリクサー", 500));
        
        // 同じ内容のアイテムを作成
        Item potion1 = new Item("ポーション", 100);
        Item potion2 = new Item("ポーション", 100);
        
        // equalsメソッドのテスト
        System.out.println("同じ内容のポーションを比較: " + potion1.equals(potion2));  // true
        
        // hashCodeメソッドのテスト
        System.out.println("potion1のハッシュ値: " + potion1.hashCode());
        System.out.println("potion2のハッシュ値: " + potion2.hashCode());  // 同じ値になる
    }
}