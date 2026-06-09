package Main4;

public class Main4 {
    

    public static void main(String[] args) {
        
        StudentManager student = new StudentManager();

        try {
            student.addStudent("アリ");
        } catch (StudentListException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println("学生ID 2: " +student.getStudent(2));
        } catch (StudentListException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("学生ID 3: " + student.getStudent(3));
        } catch (StudentListException e) {
            System.out.println(e.getMessage());
            System.out.println("学生ID 3: null");
            
        }

        try {
            System.out.println("学生ID 10: " + student.getStudent(10));
        } catch (StudentListException e) {
            System.out.println(e.getMessage());
            System.out.println("学生ID 10: null");
        }

        try {
            student.updateStudent(0, "フランク");
            student.updateStudent(1, "ボビー");
            System.out.println("更新後の学生ID 1: " + student.getStudent(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            student.updateStudent(10, "フランク");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
