public class Main3 {
    public static void main(String[] args) {
        int height = 5;

        //段
        for (int r = 1; r <= height; r++) {
            //空白
            for (int space = 1; space <= height - r; space++) {
                System.out.print(" ");
            }
            //星
            for (int i = 1; i <= 2 * r - 1; i++)  {
                System.out.print("*");  
            }

            System.out.println();
        }

    }
}
