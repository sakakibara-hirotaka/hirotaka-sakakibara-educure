package Main4;

public class Library extends Book{
    
    public Library(String title , boolean isLent ){
        super (title , isLent);
    }

    public void lendBook() {
        if (isLent() == true) {
            System.out.println("エラー: この本は既に貸し出し中です");
        } else {
        System.out.println("「" + getTitle() + "」 を貸し出しました");
        setLent(true);
        }
    }

    public void returnBook() {
        if (isLent() == false) {
            System.out.println("エラー: この本は貸し出しされていません");
        } else {
        System.out.println("「" +getTitle() + "」 が返却されました");
        setLent(false);
        }
    }

}
