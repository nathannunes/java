package com.nseit.bankapp02.model;

import com.nseit.bankapp02.service.IBankApp;

public class SalaryAccount extends BankDetails implements IBankApp {
    public SalaryAccount() {
        super();
    }

    public SalaryAccount(int accId, String accHolderName, double balance) {
        super(accId, accHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        double bal = getBalance()-amount;
        if (bal>minBalance){
            setBalance(bal);
        }else{
            System.out.println("Put Money First\n current balance:  "+getBalance());
        }

    }

    @Override
    public void deposit(double amount) {
        double bal = getBalance()+amount;
        setBalance(bal);
    }
}
