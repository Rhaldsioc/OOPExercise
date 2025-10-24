package exercise11_Library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void showBooks() {
        System.out.println("Books in Library: - Library.java:17");
        for (Book b : books) {
            System.out.println("" + b);
        }
    }
}
