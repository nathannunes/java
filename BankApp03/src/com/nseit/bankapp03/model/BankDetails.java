package com.nseit.bankapp03.model;

public class BankDetails {
    private int accId;
    private String accHolder;
    private double balance;

    public BankDetails() {
        super();
    }

    public BankDetails(int accId, String accHolder, double balance) {
        super();
        this.accId = accId;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankDetails{" +
                "accId=" + accId +
                ", accHolder='" + accHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
