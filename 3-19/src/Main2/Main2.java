package Main2;

public class Main2 {
    public static void main(String[] args) {
        
        Student student1 = new Student(1000 , "山田花子");
        Student student2 = new Student(1000 , "山田良子");
        Student student3 = new Student(1001 , "山田花子");

        if (student1.equals(student2)) {
            System.out.println("同一の学生です");
        } else {
            System.out.println("違う学生です");
        }

        if (student1.equals(student3)) {
            System.out.println("同一の学生です");
        } else {
            System.out.println("違う学生です");
        }
    }
}
