package bankapp05.model;

import bankapp05.service.IBankAccountService;

public class SalaryAccount extends BankAccount  {

    public SalaryAccount() {
        super();

    }
    public SalaryAccount(int accId, String accHolderName, double balance,String accType) {
        super(accId, accHolderName, balance, accType);
    }


    public void withdraw(double amount) {
        double bal = getBalance()-amount;
        if (bal>10000){
            setBalance(bal);
        }else {
            System.out.println("Balance is: "+getBalance()+"\n Add more money");
        }
    }


    public void deposit(double amount) {
        double bal = getBalance()+amount;
        setBalance(bal);
        System.out.println("Balance is: "+getBalance()+"\n");

    }
}
