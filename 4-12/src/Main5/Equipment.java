package Main5;

public class Equipment implements Cloneable,Comparable<Equipment>{
    
    private String name;
    private int attack;
    private int defense;

    public Equipment(String name , int attack , int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense; 
    }

    public int getPower() {
        return attack + defense;
    }

    @Override
    public Equipment clone() {
        try {
            Equipment copy = (Equipment) super.clone();
            return copy; 
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } 
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Equipment other = (Equipment) obj;
        return this.name.equals(other.name)
            && this.attack == other.attack
            && this.defense == other.defense;
    }

    public int compareTo(Equipment other){
        return other.getPower() - this.getPower();
    }

    @Override
    public String toString(){
        return name + "(攻撃:" + attack + ",防御:" + defense + ")";
    } 
}
