package Main3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();
        
        characters.add(new Character("勇者A", 100, 50));
        characters.add(new Character("魔法使いB", 70, 70));
        characters.add(new Character("戦士C", 80, 40));
        /*characters.add(new Character("ドラゴンナイト", 200, 350));
        characters.add(new Character("魔法使いA", 100, 50));
        characters.add(new Character("タンク", 500, 10));
        characters.add(new Character("アタッカー", 10, 500));
        characters.add(new Character("弱者", 1, 1));*/

        
        Collections.sort(characters);

        System.out.println("--- 戦闘力順 ---");
        for (Character character : characters) {
            System.out.println(character.toString());
        }
    }
}
