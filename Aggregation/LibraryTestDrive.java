package Aggregation;

public class LibraryTestDrive {
public static void main(String[] args) {
    Book book1 = new Book("1984", "George Orwell");
    Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
    Library library = new Library();
    library.addBook(book1);
    library.addBook(book2);
    for (Book book : library.getBooks()) {
        System.out.println(book.getTitle() + " by " + book.getAuthor());
    }
}
}
