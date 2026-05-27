package src.Main3;

public class Warrior extends Character{
    
    public Warrior(String name , int power) {
        super(name, power);

    }

    public String job = "戦士";

    @Override
    public void showStatus() {
        System.out.println("名前 :" + this.name +"\nHP: " + this.hp + "\n職業: " + job);
    }
}
