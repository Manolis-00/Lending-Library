package models;

import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Cost {
    private int id;
    private int memberId;
    private int loanId;
    private Date expirationDate;
    private double costAmount;
    private Date paymentDate;
    private double paymentAmount;
    private final double DAILY_COST = 5.0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberId() {
        return  memberId;
    }

    public void setMemberId(Member member) {
        this.memberId = member.getId();
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(Loan loan) {
        this.loanId = loan.getId();
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(double costAmount) {
        this.costAmount = costAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public long dateDifference(Loan loan) {
        long loanDate = loan.getLoanDate().getTime();
        long payDate = paymentDate.getTime();
        long timeDifference = Math.abs(payDate - loanDate);
        long daysDifference = TimeUnit.DAYS.convert(timeDifference, TimeUnit.MILLISECONDS);
        return daysDifference;
    }

    public double calculateCost(Loan loan) {
        return this.costAmount = dateDifference(loan) * DAILY_COST;
    }
}
