package Main2;

public class Main2 {
    
    public static void main(String[] args) {
        
        System.out.println("果物倉庫:");
        Warehouse<String> fruitWarehouse = new Warehouse<String>();
        fruitWarehouse.store("バナナ");
        fruitWarehouse.retrieve();
        System.out.println("空チェック: " + fruitWarehouse.isEmpty());

        //日用品倉庫
        System.out.println("\n日用品倉庫:");
        Warehouse<String> DailyWarehouse = new Warehouse<String>();
        DailyWarehouse.store("ティッシュ");
        DailyWarehouse.retrieve();
        System.out.println("空チェック: " + DailyWarehouse.isEmpty());
    }
}
