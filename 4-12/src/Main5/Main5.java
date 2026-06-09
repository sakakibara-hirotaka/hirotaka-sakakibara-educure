package Main5;

public class Main5 {
    public static void main(String[] args) {
        
        GameCharacter gameCharacter = new GameCharacter("勇者A");

        Equipment weapon = new Equipment("伝説の剣",100,0);
        Equipment armor = new Equipment("光の盾", 0, 80);
        Equipment ornaments = new Equipment("魔法の靴", 10, 20); 

        /*Equipment weapon = new Equipment("ドラゴンスレイヤー",150,30);
        Equipment armor = new Equipment("魔法のローブ", 50, 0);
        Equipment ornaments = new Equipment("知恵の指輪", 20, 10);*/
        
        gameCharacter.addEquipment(weapon);
        gameCharacter.addEquipment(armor);
        gameCharacter.addEquipment(ornaments);
        
        System.out.println("--- キャラクター装備情報 --- \n" + gameCharacter.getName() + "の装備:");
        gameCharacter.showEquipment();
        
        Equipment copy = weapon.clone();

        if (weapon.equals(copy) == true) {
        System.out.println("装備の複製テスト: OK");
        } else if (weapon.equals(copy) == false) {
            System.out.println("装備の複製テスト: NG");
        }

        if (weapon.getPower() == armor.getPower() ) {
            System.out.println("総合力が同じ"); 
        }else if(weapon.getPower() >= armor.getPower() == true) {
            System.out.println("装備の比較テスト: OK"); 
        } else {
            System.out.println("装備の比較テスト: NG");
        }

        gameCharacter.sortEquipment();

        if (gameCharacter.equipments.get(0).equals(weapon)
        && gameCharacter.equipments.get(1).equals(armor)
        && gameCharacter.equipments.get(2).equals(ornaments)) {
            System.out.println("装備の強さソート: OK");
        } else {
            System.out.println("装備の強さソート: NG");
        }


        //System.out.println(gameCharacter.equipments.get(0));

    }
}
