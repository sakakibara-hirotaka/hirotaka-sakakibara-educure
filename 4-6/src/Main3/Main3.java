package Main3;

import java.util.Map;
import java.util.HashMap;

public class Main3 {
    //販売
    public static void sell(Map<String, Integer> map, String item, int count) {
        if (map.containsKey(item)) {
            int stock = map.get(item);
            stock -= count;
            map.put(item, stock);

            System.out.println(item + "を" + count + "個販売しました");
            }
        }

    //在庫確認
    public static void search(Map<String, Integer> map,  String item) {
        if (!map.containsKey(item)) {
        System.out.println(item + "は在庫がありますか?: false");
        return;
        } else {
            System.out.println(item + "は在庫がありますか?: true");
        }
    }
    
    //在庫状況
    public static void stock(Map<String, Integer> map) {
        System.out.println("在庫状況: " + map);
    }
    public static void main(String[] args) {

        Map<String , Integer> map = new HashMap<>();

        map.put("おにぎり",15);
        map.put("サンドイッチ", 8);
        map.put("お弁当",5);

        stock(map);
        sell(map,"おにぎり",1);
        stock(map);
        search(map,"アイスクリーム");
    }     
}
