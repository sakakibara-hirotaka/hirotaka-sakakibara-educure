package main1;

public class  Pet {
    String name;
    int energy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    public void eat() {
        this.energy += 10;
        System.out.println(name + "は食事をして元気になった!");
    }

    public void play() {
        this.energy -= 20;
        System.out.println(name + "は遊んで疲れた!");
    }

    public void showEnergy() {
        System.out.println("現在の体力 : " + energy);
    }
}
