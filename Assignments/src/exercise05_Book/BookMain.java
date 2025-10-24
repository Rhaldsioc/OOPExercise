package exercise05_Book;

import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {
        ArrayList<Book> collection = new ArrayList<>();

        // Add books
        collection.add(new Book("Java Programming", "John Doe", "12345"));
        collection.add(new Book("OOP Concepts", "Jane Smith", "67890"));

        // Display books
        System.out.println("Books in collection: - BookMain.java:14");
        for (Book b : collection) {
            System.out.println("" + b);
        }

        // Remove a book
        collection.remove(0);
        System.out.println("\nAfter removing a book: - BookMain.java:21");
        for (Book b : collection) {
            System.out.println("" + b);
        }
    }
}
