package com.nseit.bankapp03.model;

import com.nseit.bankapp03.service.IBankApp;

public class SavingsAccount extends BankDetails implements IBankApp {
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int accId, String accHolder, double balance) {
        super(accId, accHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        double bal = getBalance()-amount;
        if (bal>minbalace){
            setBalance(bal);
        }else {
            System.out.println("Balance is: "+getBalance()+"\n Add more money");
        }
    }

    @Override
    public void deposit(double amount) {
        double bal = getBalance()+amount;
        setBalance(bal);
        System.out.println("Balance is: "+getBalance()+"\n");

    }
}
