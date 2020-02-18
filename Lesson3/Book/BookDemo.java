package lv.javaguru.JavaGuruQA2.Lesson3.Book;

public class BookDemo {

    public static void main(String[] args){
        Book javaBook = new Book("Head first Java","O'reilly");
        Book newJavaBook = new Book("Head first Java", "O'reilly", "0596009208", 688);

        System.out.println("javaBook.title = " + javaBook.title);
        System.out.println("javaBook.publisher = " + javaBook.publisher);
        System.out.println("javaBook.isbn = " + javaBook.isbn);
        System.out.println("javaBook.pageCount = " + javaBook.pageCount);
        System.out.println();

        System.out.println("newJavaBook.title = " + newJavaBook.title);
        System.out.println("javaBook.publisher = " + newJavaBook.publisher);
        System.out.println("javaBook.isbn = " + newJavaBook.isbn);
        System.out.println("javaBook.pageCount = " + newJavaBook.pageCount);
        System.out.println();

        System.out.println();
        javaBook.printInformation();
    }
}
