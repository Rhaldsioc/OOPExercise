package exercise11_Library;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book b1 = new Book("Java for Beginners", "John Doe");
        Book b2 = new Book("Object Oriented Design", "Jane Smith");

        library.addBook(b1);
        library.addBook(b2);

        library.showBooks();

        library.removeBook(b1);
        System.out.println("\nAfter removing one book: - LibraryMain.java:15");
        library.showBooks();
    }
}
