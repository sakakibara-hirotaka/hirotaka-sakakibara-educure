import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("攻撃力を入力してください : ");
        int atack = scanner.nextInt();
        System.out.print("防御力を入力してください : ");
        int armer = scanner.nextInt();

        int damage = atack - armer;
        double curiticalDouble = (damage*1.5);
        int curitical = (int) curiticalDouble;

        System.out.println("通常ダメージ : " + damage);
        System.out.println("クリティカルダメージ : " + curitical);

        scanner.close();

    }
}