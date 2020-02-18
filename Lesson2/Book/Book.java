package lv.javaguru.JavaGuruQA2.Lesson2.Book;

public class Book {
    private String title;
    private String publisher;
    private String ibn;
    private int pageNUmber;

    public Book(String title, String publisher){
        this.title = title;
        this.publisher = publisher;
    }

    public Book(String title, String publisher, String inb, int pageNUmber){
        this.title = title;
        this.publisher = publisher;
        this.ibn = inb;
        this.pageNUmber = pageNUmber;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIbn() {
        return ibn;
    }

    public int getPageNUmber() {
        return pageNUmber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIbn(String ibn) {
        this.ibn = ibn;
    }

    public void setPageNUmber(int pageNUmber) {
        this.pageNUmber = pageNUmber;
    }

    public void printInformation(){
        System.out.println("lv.javaguru.JavaGuruQA2.Lesson3.Book.Book title is: " + this.title);
        System.out.println("lv.javaguru.JavaGuruQA2.Lesson3.Book.Book publisher is " + this.publisher);
        System.out.print("IBN for this book is: " + this.ibn);
        System.out.print("This book has: " + this.pageNUmber + " pages.");
    }
}
