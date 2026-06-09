package Main5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameCharacter {
    
    String name;
    List<Equipment> equipments = new ArrayList<>();  

    public GameCharacter(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addEquipment(Equipment e) {
        equipments.add(e);
    }

    public void showEquipment(){
        for (int i = 0; i< equipments.size(); i++ ) {
        System.out.println((i+1) + ". " + equipments.get(i));
        }
    }

    public void sortEquipment() {
        Collections.sort(equipments);
    }

    @Override
    public GameCharacter clone() {
        try {
            GameCharacter characopy = (GameCharacter) super.clone();
            characopy.equipments = new ArrayList<>(this.equipments);
            for (Equipment e : this.equipments) {
                characopy.equipments.add(e.clone());
            }
            return characopy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    
}
