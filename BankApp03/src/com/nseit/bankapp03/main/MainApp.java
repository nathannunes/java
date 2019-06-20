package com.nseit.bankapp03.main;

import com.nseit.bankapp03.model.SavingsAccount;

public class MainApp {
    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount(101,"Nathan",1000);
        System.out.println("Account details: "+ sa );

        System.out.println("Amt before: "+ sa.getBalance() );
        sa.withdraw(200);

        System.out.println("Amt after: "+ sa.getBalance() );
        sa.deposit(800);
        System.out.println("Current Bal.: "+ sa.getBalance() );
    }
}
