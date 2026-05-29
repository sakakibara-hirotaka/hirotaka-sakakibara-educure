package Main2;

import Main1.Product;

public class Book extends Product{

    String author;
    int stockQuantity;

    public Book(String name , int price , String author , int stockQuantity){
        super(name,price);
        
        this.author = author;
        this.stockQuantity = stockQuantity;
    }

    public void displayInfo() {
        System.out.println("書籍名:" + this.name +"\n著者:" + this.author + "\n価格:" + price + "円");
    }
    
    public void checkStock(){
        if (stockQuantity <= 0) {
            System.out.println("在庫なし");
        }else {
                System.out.println("在庫あり");
            
        } 
    }
}

