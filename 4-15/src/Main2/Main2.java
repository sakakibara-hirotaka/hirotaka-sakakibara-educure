package Main2;

public class Main2 {
    
    public static void main(String[] args) {
        
        System.out.println("果物倉庫:");

       /* Warehouse<String> warehouse = new Warehouse();
        warehouse.store("商品名");
        String item = warehouse.retrieve(); 
        System.out.println("空チェック:"+warehouse.isEmpty());*/


        Warehouse<String> fruitWarehouse = new Warehouse<String>();

        fruitWarehouse.store("バナナ");
        fruitWarehouse.retrieve();
        System.out.println("空チェック: " + fruitWarehouse.isEmpty());

        System.out.println("\n日用品倉庫:");
        fruitWarehouse.store("ティッシュ");
        fruitWarehouse.retrieve();
        System.out.println("空チェック: " + fruitWarehouse.isEmpty());
    }
}
