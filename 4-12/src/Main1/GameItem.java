package Main1;

public class GameItem {

    private String item;
    private int price;

    public GameItem(String item , int price) {
        this.item = item;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + this.item + "] 価格: " + this.price + "G";
    }
}