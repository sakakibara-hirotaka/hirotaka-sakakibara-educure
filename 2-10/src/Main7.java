public class Main7 {
    public static void main(String[] args) {

        int key = 3;        // 押したキーの番号
        int count = 1; // 押下回数
        String result = "";

        switch (key) {
            case 1:
                if (count == 1) result = "A";
                else if (count == 2) result = "B";
                else if (count == 3) result = "C";
                break;
            
            case 2:
                if (count == 1) result = "D";
                else if (count == 2) result = "E";
                else if (count == 3) result = "F";
                break;

            default:
                result = "Invalid key";
                break;
        }
        System.out.println("出力結果：" + result);

    }
}
