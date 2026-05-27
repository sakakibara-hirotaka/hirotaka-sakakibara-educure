package src.Main4;

public class Wizard extends GameCharacter{
    
    int MP;

    public Wizard(String name , int HP,int MP) {
        super(name, HP);
        this.MP = MP;
    }

    @Override
    public void showStatus() {
        System.out.println("名前: " + this.name + "\nHP: " + this.HP + "\nMP: " + this.MP);
    }
}
