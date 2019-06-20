package com.nseit.bankapp02.main;
import com.nseit.bankapp02.model.SalaryAccount;


public class MainApp {
    public static void main(String[] args){
        SalaryAccount sa = new SalaryAccount(101,"Nathan",700);
        System.out.println("Account details: "+ sa );

        System.out.println("Amt before: "+ sa.getBalance() );
        sa.withdraw(200);

        System.out.println("Amt after: "+ sa.getBalance() );
        sa.deposit(800);
        System.out.println("Current Bal.: "+ sa.getBalance() );
    }
}
