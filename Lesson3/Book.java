public class Book {

    public String title;
    public String publisher;
    public String isbn;
    public int pageCount;

    public Book(String title, String publisher){
        this.title = title;
        this.publisher = publisher;
    }

    public Book(String title, String publisher, String isbn, int pageCount){
        this.title = title;
        this.publisher = publisher;
        this.isbn = isbn;
        this.pageCount = pageCount;
    }

    public void printInformation(){
        System.out.println(title);
        System.out.println(publisher);
        System.out.println(isbn);
        System.out.println(publisher);
    }

}
