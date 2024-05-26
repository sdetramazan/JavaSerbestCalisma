package Class.Ornek_09;

public class BookStore {
    public static void main(String[] args) {
        Book book=new Book();
        book.bookName="zengin";
        book.publishYear=1882;
        book.author="Ramazan";

        Book book1=new Book("fakir",1980,"ebrar");
        Book book2=new Book("orta",1999);

        System.out.println(book.toString());
        System.out.println("******");
        System.out.println(book1.toString());
        System.out.println("******");
        System.out.println(book2.toString());
    }
}
