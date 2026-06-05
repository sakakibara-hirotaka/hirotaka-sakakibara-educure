package Main1;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String>  names = new ArrayList<String>();

        names.add("田中");
        names.add("佐藤");
        names.add("鈴木");


        System.out.println("学生リスト: " + names);
        System.out.println("２番目の学生: " + names.get(1));
        System.out.println("学生数: " + names.size());
        System.out.println("鈴木さんは含まれていますか？: " + names.contains("鈴木"));
    }    
}
