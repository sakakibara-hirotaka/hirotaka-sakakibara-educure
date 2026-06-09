package Main1;

class Main {
    public static void main(String[] args) {

        GameItem gameItem1 = new GameItem("回復薬", 100);
        GameItem gameItem2 = new GameItem("魔法の杖", 1500);

        System.out.println("アイテム情報:");
        System.out.println(gameItem1.toString());
        System.out.println(gameItem2.toString());
    }
}