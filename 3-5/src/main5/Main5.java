package main5;

public class Main5 {
    public static void main(String[] args) {
        
        Book book1 = new Book(1,"java入門","山田太郎");
        Book book2 = new Book(2,"Python実践" , "鈴木次郎" ,300);

        //Book book1 = new Book(1,"C++基礎","田中花子");
        //Book book2 = new Book(2,"JavaSclipt応用" , "佐藤一郎" ,450);

        book1.bookinformation();
        book2.bookinformation();
    }
}
