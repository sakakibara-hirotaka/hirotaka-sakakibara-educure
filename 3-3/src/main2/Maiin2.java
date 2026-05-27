public class Maiin2 {
    public static void main(String[] args) {

        Book book = new Book();

        book.setTitle("Java入門");

        book.lend();
        book.lend();
        book.returnBook();
        book.lend();   

    }
}
