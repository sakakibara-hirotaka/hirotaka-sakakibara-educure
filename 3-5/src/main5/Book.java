package main5;

public class Book {
    int id;
    String title;
    String author;
    int pages;

    public Book(int id , String title, String author) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    
    public Book(int id,String title, String author, int pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void bookinformation() {
        System.out.println("本" + id +": " + this.title + " - " + this.author + "(" + this.pages + "ページ)");
    }

}
