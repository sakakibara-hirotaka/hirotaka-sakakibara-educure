public class Main3 {
    public static void main(String[] args) {
        int month = 4;

      /*month =3;
        month = 5;
        month = 6;
        month = 7;
        month = 8;
        month = 9;
        month = 10;
        month = 11;
        month = 12;
        month = 1;
        month= 2;
        month = 0;
        month = 13;*/

        if (month >= 3 && month <= 5) {
            System.out.println("春");
        } else if (month >= 6 && month <= 8) {
            System.out.println("夏");
        } else if (month >= 9 && month <= 11) {
            System.out.println("秋"); 
        } else if (month == 12 || month ==1 || month == 2) {
            System.out.println("冬"); 
        } else {
            System.out.println("無効な月です");
        } 

    }

}
