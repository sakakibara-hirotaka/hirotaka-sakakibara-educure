public class Book {

    String title;
    boolean isLent = false;
    
    public String getTitle() {
        return title;
    }  
    public void setTitle(String title) {
        this.title = title;
        System.out.println("「" + this.title + "」を登録しました");
    }  
    
    public void returnBook() {
        if (isLent == false) {
        System.out.println("この本は貸し出し中ではありません");
        }else {
            isLent = false;
            System.out.println("本が返却されました");
        }
    }
    
    
    public void lend() {
        if (isLent == true) {
            System.out.println("申し訳ありません。この本は貸出中です");
        }else {
            isLent = true;
            System.out.println("本を貸し出しました");
        }
    } 
}
