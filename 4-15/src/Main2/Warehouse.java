package Main2;

public class Warehouse<T> {
    
    private T item;

    public void store(T item) {
        this.item = item;
        System.out.println("商品追加: " + item);
    }

    public T retrieve() {
        T listing  = item;
        item = null;
        System.out.println("取り出し: " + listing);
        return listing;
    }

    public boolean isEmpty() {
        if (item == null) {
            return true;
        } else {
            return false;
        }
    }

}
