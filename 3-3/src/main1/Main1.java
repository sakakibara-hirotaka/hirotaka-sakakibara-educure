package main1;

public class Main1 {
    public static void main(String[] args) {
        Pet nm = new Pet();

        nm.setName("ポチ");
        nm.setEnergy(100);

        System.out.println(nm.name + "を生み出しました！");
        System.out.println("初期体力 : " + nm.energy);

        nm.eat();
        nm.showEnergy();

        nm.play();
        nm.showEnergy();


        /*タマ
        nm.setName("タマ");
        nm.setEnergy(50);

        System.out.println(nm.name + "を生み出しました！");
        System.out.println("初期体力 : " + nm.energy);

        nm.eat();
        nm.showEnergy();

        nm.play();
        nm.showEnergy();*/


        /*ミケ
        nm.setName("ミケ");
        nm.setEnergy(80);

        System.out.println(nm.name + "を生み出しました！");
        System.out.println("初期体力 : " + nm.energy);

        nm.eat();
        nm.showEnergy();

        nm.eat();
        nm.showEnergy(); */
        

        /*チビ
        nm.setName("チビ");
        nm.setEnergy(5);

        System.out.println(nm.name + "を生み出しました！");
        System.out.println("初期体力 : " + nm.energy);

        nm.eat();
        nm.showEnergy();

        nm.eat();
        nm.showEnergy();

        nm.play();
        nm.showEnergy(); */


        /*ゼロ
        nm.setName("ゼロ");
        nm.setEnergy(0);

        System.out.println(nm.name + "を生み出しました！");
        System.out.println("初期体力 : " + nm.energy);

        nm.eat();
        nm.showEnergy();

        nm.play();
        nm.showEnergy(); */


        /*マイナス
        nm.setName("マイナス");
        nm.setEnergy(10);

        System.out.println(nm.name + "を生み出しました！");
        System.out.println("初期体力 : " + nm.energy);

        nm.play();
        nm.showEnergy(); 
        nm.play();
        nm.showEnergy(); */
    }
}
