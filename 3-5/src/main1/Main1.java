package main1;

public class Main1 {
    public static void main(String[] args) {
        
        Weapon weapon = new Weapon();
        weapon.name = "魔法の剣";
        //weapon.name = "鋼の盾";
        weapon.power = 50;
        GameCharacter chara = new GameCharacter();
        
        chara.name = "剣士アレックス";
        //chara.name = "騎士チャールズ";
        chara.weapon = weapon;
        chara.hp = 100;
        
        System.out.println(chara.name + "は" + chara.weapon.name + "を装備しています");
    }
}
