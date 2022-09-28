package models;

import java.util.Date;

public class Reservation {
    private int id;
    private int bookId;
    private int memberId;
    private Date reservationDate;
    private boolean isReserved;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(Book book) {
        bookId = book.getId();
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(Member member) {
        memberId = member.getId();
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}
