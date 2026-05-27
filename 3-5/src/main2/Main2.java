package main2;

public class Main2 {
    public static void main(String[] args) {

        Player man = new Player("勇者",30);
        
        HealingPotion.displayInfo(man);
        HealingPotion.heal(man);
        HealingPotion.displayHP(man);
    }
    
}
