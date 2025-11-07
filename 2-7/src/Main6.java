import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("現在の経験値を入力してください : ");
        int experience = scanner.nextInt();
        int borns = experience * 25/100;
        int total = experience + borns;

        System.out.println("ボーナス後の経験値 : " + total);

        scanner.close();
    }
}