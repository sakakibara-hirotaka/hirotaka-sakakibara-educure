package Main2;

public class Student {
    
    private String name;
    private int score;

    public Student(String name , int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("エラー: 点数は0-100の範囲で設定してください");
        } else {
            this.score = score;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 1 || name.length() > 20) {
            System.out.println("エラー: 名前は1-20文字で設定してください");
        }else {
            this.name = name;
        }
    }

    public void grades() {
        System.out.println(getName() +"さんの点数: " + getScore() + "点");
    }

}
