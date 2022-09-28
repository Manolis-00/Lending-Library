package models;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;

    public Library() {
        books = null;
    }

    public void addBook(Book book) {
        if(book.getBookCopies() == 0)
            books.add(book);

        book.setBookCopies(book.getBookCopies() + 1);
    }

    public void removeBook(Book book) {
        if (book.getBookCopies() > 0) {
            books.remove(book);
            book.setBookCopies(book.getBookCopies() - 1);
        }
    }

    @Override
    public String toString() {
        return "Books in the library: " + "\n" +
                books.toString();
    }

}
