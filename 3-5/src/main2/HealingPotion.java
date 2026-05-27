package main2;

public class HealingPotion {

    public static void heal(Player Player) {
        System.out.println("回復ポーションを使用しました");
        Player.hp += 50;
    }

    public static void displayInfo(Player player) {
        System.out.println("プレイヤー名: " + player.name);
        System.out.println("プレイヤーのhp: " + player.hp);
    }
     public static void displayHP(Player player) {
        System.out.println("プレイヤーのHP: " + player.hp);
    }
}
 