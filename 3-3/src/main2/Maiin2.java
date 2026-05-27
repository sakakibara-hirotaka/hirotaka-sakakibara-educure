import java.util.Scanner;

public class Maiin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        String inputTitle = scanner.nextLine();
        book.setTitle(inputTitle);
        System.out.println(book.getTitle());

        book.lend();
        book.lend();
        book.returnBook();
        book.lend();   

        scanner.close();
    }
}
