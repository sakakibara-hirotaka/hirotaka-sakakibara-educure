package Main3;

public class Main3 {
    public static void main(String[] args) {
        
        Book book = new Book("Javaプログラミング", "山田 太郎", 2800);
            System.out.println("タイトル: " + book.getTitle());
            System.out.println("著者: " + book.getAuthor());
            System.out.println("価格: " + book.getPrice());      
    }
}
