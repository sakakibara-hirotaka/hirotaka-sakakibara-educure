package src.Main4;

public class Wizard extends GameCharacter{
    
    int MP;

    public Wizard(String name , int HP,int MP) {
        super(name, HP);
        this.MP = MP;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("MP: " + this.MP);
    }
}
