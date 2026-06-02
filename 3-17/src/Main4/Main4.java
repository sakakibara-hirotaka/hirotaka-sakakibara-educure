package Main4;

public class Main4 {
    public static void main(String[] args) {
        Library library = new Library(new Book("java入門", false));


        library.lendBook();
        library.lendBook();
        library.returnBook();
        library.lendBook();
        
    }
}
