public class Main5 {
    public static void main(String[] args) {
        int stock = 1;

        System.out.println("現在の在庫数: " + stock);

        do {
            stock--;
            if (stock == 0) {
                System.out.println("在庫がなくなりました！");
            } else {
                    System.out.println("現在の在庫数: " + stock);
            }

        } while (stock > 0);
        
          
        
    }
}
