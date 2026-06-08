package Main4;

public class StudentManager {
    
    private String[] students = new String[5];
    private int count = 0;

    public StudentManager(){
        students = new String[]{"アリス","ボブ","チャーリー",null,"イヴ"};
        count = 5;
    }

    public void addStudent(String name) throws StudentOverflowException,EmptyStudentException,InvalidStudentException{
        if (count >= 5) {
            throw new StudentOverflowException("エラー: これ以上学生を追加できません。リストがいっぱいです。");
        }else {
        students[count] = name;
        count++;
        }
    }

    public String getStudent(int id) throws InvalidStudentException,EmptyStudentException{
        if (id <0 || id >= students.length) {
            throw new InvalidStudentException("エラー: 無効な学生IDです: " + id);
        }
        if (students[id] == null){
            throw new EmptyStudentException("エラー: 学生ID" + id +"にデータがありません。");
        }
        return students[id];
    }

    public void updateStudent(int id , String name) throws InvalidStudentException,EmptyStudentException{
        if (id <0 || id >= students.length) {
            throw new InvalidStudentException("エラー:無効な学生IDです: " + id);
        }
        if (students[id] == null){
            throw new EmptyStudentException("エラー: 学生ID" + id + "にデータがありません。" + id);
        }
        students[id] = name;

    }

    public String[] getstudents(){
        return students;
    }
}
