package Main3;

public class Library {
    
    static int availableBooks =100;

    public static void borrowBook() {
        if (availableBooks <= 0) {
            System.out.println("貸出可能な本がありません");
        } else {
            System.out.println("1冊借りました");
            availableBooks --;
        }
        return;
    }

    public static void returnBook(){
        availableBooks++;
        System.out.println("本を返却しました");
    }

    public static int getAvailableBooks() {
        return availableBooks;
    }

}
