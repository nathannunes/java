package com.nseit.bankapp02.model;

public class BankDetails {
    private int accId;
    private String accHolderName;
    private double balance;

    public BankDetails() {
        super();
    }

    public BankDetails(int accId, String accHolderName, double balance) {
        this.accId = accId;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public int getAccId() {
        return accId;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankDetails{" +
                "accId=" + accId +
                ", accHolderName='" + accHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
