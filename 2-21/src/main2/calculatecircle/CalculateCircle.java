package calculatecircle;

public class CalculateCircle {
    public static void calculateCircle(double radius) {
        // ここにコードを書いてください
        double area = radius * radius * Math.PI;
        double circumference = radius * Math.PI * 2;

        System.out.println("半径が" + radius +"の場合:");
        System.out.println("円の面積: " + area);
        System.out.println("円周: " + circumference);
        
    }
}
