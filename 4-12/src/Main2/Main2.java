package Main2;

public class Main2 {
    public static void main(String[] args) {
        
        Monster monster1 = new Monster("スライム", 5);
        Monster monster2 = new Monster("スライム", 5);
        Monster monster3 = new Monster("スライム", 10);
        //Monster monster4 = new Monster("ドラゴン", 5);

        if(monster1.equals(monster2) ==false){
            System.out.println(monster1.getName() + "LV" + monster1.getLevel() + "と" +  monster2.getName() + "LV" + monster2.getLevel()  + "は違うモンスターです");
        }else if (monster1.equals(monster2) ==true) {
            System.out.println(monster1.getName() + "LV" + monster1.getLevel()  + "と" +  monster2.getName() + "LV" + monster2.getLevel()  + "は同じモンスターです");
        }

       if(monster1.equals(monster3) ==false){
            System.out.println(monster1.getName() + "LV" + monster1.getLevel()  + "と" +  monster3.getName() + "LV" + monster3.getLevel()  + "は違うモンスターです");
        }else if (monster1.equals(monster3) ==true) {
            System.out.println(monster1.getName() + "LV" + monster1.getLevel()  + "と" +  monster3.getName() + "LV" + monster3.getLevel()  + "は同じモンスターです");
        }
        
    }
}
