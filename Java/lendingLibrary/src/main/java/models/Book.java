package models;

import java.util.Date;

public class Book {
    private int id;
    private String title;
    private Date publicationDate;
    private int categoryId;
    private String author;
    private int bookCopies;

    Book() {

    }

    Book(int id, String title, Date publicationDate, int bookCopies) {
        this.id = id;
        this.title = title;
        this.publicationDate = publicationDate;
        this.bookCopies = bookCopies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category category) {
        this.categoryId = category.getId();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author.getFirstName() + " " + author.getLastName();
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getBookCopies() {
        return bookCopies;
    }

    public void setBookCopies(int bookCopies) {
        this.bookCopies = bookCopies;
    }

    @Override
    public String toString() {
        return  "Book id:" + id + "\n" +
                "Title: + " + title + "\n" +
                "Author: " + author + "\n" +
                "Book category ID: " + categoryId + "\n" +
                "Publication Year: " + publicationDate + "\n" +
                "Copies remaining: " + bookCopies;
    }
}
