package Class.Ornek_09;

public class Book {
    String bookName;
    int publishYear;
    String author;

    public Book(){

    }
    public Book(String bookName,int publishYear,String author){
        this.bookName=bookName;
        this.publishYear=publishYear;
        this.author=author;
    }
    public Book(String bookName,int publishYear){
        this(bookName,publishYear,"");
    }
    public  String toString(){
         return this.bookName+" "+this.publishYear+" "+this.author;
    }
}
