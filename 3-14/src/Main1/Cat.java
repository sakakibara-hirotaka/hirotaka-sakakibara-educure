package Main1;

public class Cat extends Animal {
    
    String catcry;

    public Cat(String catcry) {
        this.catcry = catcry;
    }

    @Override
    public void makeSound() {
        System.out.println("猫の鳴き声: " + this.catcry);
    }
}
