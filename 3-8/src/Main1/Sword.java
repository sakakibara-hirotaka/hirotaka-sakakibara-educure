public class Sword extends Weapon {

    public Sword(String name , int power) {
        super(name,power);
    }
    public String getName() {
        return this.name;
    }
    
    public int getPower() {
        return this.power;
    }
}
