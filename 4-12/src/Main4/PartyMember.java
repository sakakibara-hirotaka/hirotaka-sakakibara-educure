package Main4;

import java.util.ArrayList;
import java.util.List;

public class PartyMember implements Cloneable {
    
    private String name;

    List<String> skills = new ArrayList<>();

    public PartyMember(String name) {
        this.name = name;
    }

    public void addSkill(String skill){
        skills.add(skill); 
    }

    public void showSkills() {
        System.out.println("「" + this.name +"」 のスキル: " + skills);
    }

    public PartyMember Clone(){
        try {
            PartyMember copy = (PartyMember) super.clone();
            copy.skills = new ArrayList<>(this.skills);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        
    }
}
