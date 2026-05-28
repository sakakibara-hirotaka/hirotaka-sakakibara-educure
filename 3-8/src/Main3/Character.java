package src.Main3;

public class Character {
    String name;
    int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void showStatus() {
        System.out.println("名前 :" + this.name +"\nHP: " + this.hp );
    }
}
