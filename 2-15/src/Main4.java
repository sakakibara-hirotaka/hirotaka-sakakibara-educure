import java.util. Scanner;
public class Main4 {
    public static void main(String[] args) {

        int[][] seats = new int[5][6];
        Scanner scanner = new Scanner(System.in);
        //すでに埋まっている席
        seats[0][2] =1;
        seats[1][1] =1;
        seats[1][4] =1;
        seats[3][0] =1;
        seats[3][5] =1;
        seats[4][2] =1;

        // ここに座席予約のコードを書いてください

        System.out.println("予約前の座席状況:");
        for (int i = 0; i < 5; i++) {
            for (int t = 0; t < 6; t++) {
                System.out.print("[" + seats[i][t] + "]");
            }
            System.out.println();
        } 

        //入力後の席の表示
        System.out.print("\n予約したい座席の行番号 (1-5) : ");
        int row = scanner.nextInt();
        System.out.print("予約したい座席の列番号 (1-6) : ");
        int col = scanner.nextInt();

        /*System.out.println("予約後の座席状況");*/
        if (row < 1 || row > 5 || col < 1 || col > 6) {
            System.out.println("無効な座席番号です。");
        }
        //予約済み
        else if (seats[row-1][col-1] ==1) {
            System.out.println("\n指定された座席はすでに予約済みです。");
        }
        //予約成功
        else {
            seats[row - 1][col - 1] = 1;
            System.out.println("\n" + row + "行" + col + "列の座席を予約しました\n");
            //最終席の表示
            System.out.println("予約後の座席状況");
            for (int i = 0; i < 5; i++) {
                for (int t = 0; t < 6; t++) {
                    System.out.print("[" + seats[i][t] + "]");
                }
                System.out.println(); 
            }
        }
        scanner.close();
    }
}

