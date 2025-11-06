/**
 * Main8を表すクラスです。
 * 名前と出身地と好きな食べ物を表示させました。
 */
public class Main8 {
    public static void main(String[] args) {
        //ここの下は変数を使っています。        
        String name = "榊原 寛隆";
        String birthplace = "愛知県";
        String favoritefood = "寿司";

        /*この下のコードは変数を変化させてます。 */
        name = "山田次郎" ;
        birthplace = "大阪府";
        favoritefood = "たこ焼き";

        name = "伊藤花子";
        birthplace = "北海道";
        favoritefood = "ラーメン";

        System.out.println("===== 自己紹介 =====");
        System.out.println("名前:\t" + name + "\n出身地:\t" + birthplace + "\n好きな食べ物:\t" + favoritefood);
        

    }

}
