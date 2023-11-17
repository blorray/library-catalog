import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String ISBN;

    public Book(String title, String author, int publicationYear, String ISBN) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
    }

   // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
}

class LibraryCatalog {
    private List<Book> books;

    public LibraryCatalog() {
        this.books = new ArrayList<>();
    }

   // Add a book to the catalog
    public void addBook(Book bookArg) {
        books.add(bookArg);
}    // Display all books in the catalog
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library catalog is empty.");
        } else {
            System.out.println("Library Catalog:");
            for (Book book : books) {
                book.displayBookDetails();
        }
    }
}

    
   
    