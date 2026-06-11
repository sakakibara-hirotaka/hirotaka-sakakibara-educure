package Main3;

public class Inventory<T> {
    private T item;
    private final ProductCategory category;
    
    public Inventory(ProductCategory category) {
        this.category = category;
    }

    public void stockIn(T item ) {
        System.out.println(category.getDisplayName() + "コーナー: " + item + "を入荷");
        this.item = item;
    }

    public T stockOut() {
        T listing = item;
        item = null;
        return listing;
    }

    public T getCurrentStock() {
        return item;
    }
    
}
