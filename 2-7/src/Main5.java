public class Main5 {
    public static void main(String[] args) {
        int note = 280*3;
        int pencil =120*5;
        int elesare = 100*2;
        int maney = 2000;

        int price = note + pencil + elesare;
        int tax = price/10;

        System.out.println("小計 : " + price + "円");
        System.out.println("消費税 : " + tax + "円");
        System.out.println("合計金額 : " + (price + tax) + "円");
        System.out.println("おつり : " + (maney - (price + tax)) + "円");
    }
}
