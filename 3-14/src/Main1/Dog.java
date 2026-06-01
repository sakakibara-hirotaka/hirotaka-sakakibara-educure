package Main1;

public class Dog extends Animal{
    
    String dogcry;

    public Dog(String dogcry) {
        this.dogcry = dogcry;
    }

    @Override
    public void makeSound() {
        System.out.println("犬の鳴き声: "+ this.dogcry);
    }
}
