package main3;

public class RPGCharacter {

    private int level;
    private int hp;
    private int mp;

    public RPGCharacter() {
        this.level = 1;
        this.hp = 100;
        this.mp = 50;
    }

    public void levelUp() {
        if (level == 99){
            throw new IllegalArgumentException("最大レベルに達しています");
        }
        this.level++;
        this.hp+=10;
        this.mp+=5;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

}
