package Main4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Main4 {

    
    public static void main(String[] args){

        HashMap<String, Integer> battleCount = new HashMap<>();
        LinkedHashSet<String> monsterList = new LinkedHashSet<>();
        LinkedHashSet<String> discovered = new LinkedHashSet<>();
        ArrayList<String> history = new ArrayList<>();
        LinkedHashSet<String> undiscovered = new LinkedHashSet<>();
        
        //モンスターリスト
        monsterList.add("スライム");
        monsterList.add("ドラゴン");
        monsterList.add("ゴブリン");
        monsterList.add("フェニックス");
        monsterList.add("ユニコーン");
        //monsterList.add("ボス");
        
        //発見モンスター
        history.add("スライム");
        history.add("スライム");
        history.add("スライム");
        history.add("スライム");
        history.add("スライム");
        /*history.add("スライム");
        history.add("スライム");
        history.add("スライム");
        history.add("スライム");
        history.add("スライム");*/
        history.add("ドラゴン");
        history.add("ドラゴン");
        //history.add("ドラゴン");
        history.add("ゴブリン");
        history.add("ゴブリン");
        //history.add("ゴブリン");
        /*history.add("フェニックス");
        history.add("ユニコーン");
        /*history.add("ユニコーン");
        history.add("ユニコーン");
        history.add("ユニコーン");*/
        /*history.add("ボス");
        history.add("ボス");
        history.add("ボス");
        history.add("ボス");
        history.add("ボス");*/


        //モンスタ－初期化
        for(String m : monsterList) {
            battleCount.put(m,0);
        }
        //バトル回数
        for (String name : history) {
            Integer count = battleCount.get(name);
            battleCount.put(name , count +1);
        }

        //発見
        for (String discvered : history) {
            discovered.add(discvered);
        }

        //未発見
        for (String m : monsterList) {
            if (!discovered.contains(m)){
                undiscovered.add(m);
            }
        }

        int slimeCounter = battleCount.get("スライム");

        System.out.println("発見済みモンスター:" + discovered);
        System.out.println("発見済みモンスター数:" + discovered.size());
        System.out.println("スライムとの戦闘回数:"+slimeCounter);
        System.out.println("未発見のモンスター:"+undiscovered);
        
 
    }
}