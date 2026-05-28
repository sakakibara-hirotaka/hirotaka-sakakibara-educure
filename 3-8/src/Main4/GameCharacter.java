package src.Main4;

public class GameCharacter {
    String name;
    int HP;

    public GameCharacter(String name , int HP){
        this.name = name;
        this.HP = HP;
    }

    public void showStatus() {
        System.out.println("名前: " + this.name + "\nHP: " + this.HP);
    }
}
