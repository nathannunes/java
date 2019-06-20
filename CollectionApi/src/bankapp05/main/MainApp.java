package bankapp05.main;

import bankapp05.model.BankAccount;

public class MainApp {
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.addAccount(101,"nathan",1000,"savings");
        ba.addAccount(102,"benji",1000,"savings");
        ba.addAccount(103,"hartono",1000,"savings");
        ba.addAccount(104,"naofumi",1000,"savings");

        System.out.println("added successfully");

        System.out.println(ba.getAccHolderName(101));

    }
}
