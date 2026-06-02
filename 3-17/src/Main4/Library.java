package Main4;

public class Library {
    
    private Book books;

    public Library(Book books){
     this.books = books;
    }

    public void lendBook() {
        if (books.isLent() == true) {
            System.out.println("エラー: この本は既に貸し出し中です");
        } else {
        System.out.println("「" + books.getTitle() + "」 を貸し出しました");
        books.setLent(true);
        }
    }

    public void returnBook() {
        if (books.isLent() == false) {
            System.out.println("エラー: この本は貸し出しされていません");
        } else {
        System.out.println("「" +books.getTitle() + "」 が返却されました");
        books.setLent(false);
        }
    }

}
