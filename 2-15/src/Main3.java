public class Main3 {
    public static void main(String[] args) {
        double[] temperatures = {25.5, 26.0, 24.5, 26.5, 27.0, 25.0, 24.0};
        //double[] temperatures = {22.0, 23.5, 24.0, 25.0, 23.0, 22.5, 21.5};
        String[] day = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日","土曜日","日曜日"};

        // ここに平均気温を計算するコードを書いてください
        double total = 0;
        for (int i = 0; i < temperatures.length; i++) {
            total += temperatures[i];
        System.out.println(day[i] + " : " + temperatures[i] + "度");
        }

        double avg = 0;
        avg = total / temperatures.length;
        System.out.println("平均気温 : " + avg + "度");
        
    }   

}