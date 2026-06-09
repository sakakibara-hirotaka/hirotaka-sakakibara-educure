package Main2;

import java.util.Objects;


public class Monster {
    
    private String name;
    private int level;

    public Monster(String name , int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this ==obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Monster other = (Monster) obj;
        return this.name.equals(other.name) && this.level == other.level;
    }

   @Override
    public int hashCode() {
        return Objects.hash(name,level);
    }

    public String getName() {
        return name;
    }

    public int getLevel(){
        return level;
    }

}
