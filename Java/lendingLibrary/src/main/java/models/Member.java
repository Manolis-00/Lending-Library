package models;

import java.util.Date;

public class Member {
    private int id;
    private String name;
    private Date joinedDate;
    private boolean isActive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void loanBook(Book book, Reservation reservation) {
        if(book.getBookCopies() >= 1 && !reservation.isReserved())
            book.setBookCopies(book.getBookCopies() - 1);
        else
            System.out.println("There are no more copies of this book in the library.");
    }

    public void reserveBook(Book book, Date date, Reservation reservation) {
        if(!reservation.isReserved() && book.getBookCopies() >= 1) {
            reservation.setReserved(true);
            book.setBookCopies(book.getBookCopies() - 1);
        }
        else
            System.out.println("There are no more copies of this book in the library.");
    }
}
