package Main3;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class Main3 {
    public static void main(String[] args) {
        
        try {
            
            File xmlFile = new File("excersise.xml");
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            String title = document.getElementsByTagName("title").item(0).getTextContent();
            String author = document.getElementsByTagName("author").item(0).getTextContent();
            String priceText = document.getElementsByTagName("price").item(0).getTextContent();
            int price = Integer.parseInt(priceText);

            Book book = new Book(title, author, price);
            System.out.println("タイトル: " + book.getTitle());
            System.out.println("著者: " + book.getAuthor());
            System.out.println("価格: " + book.getPrice());

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }   
}
