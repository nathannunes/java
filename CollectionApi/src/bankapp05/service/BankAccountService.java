package bankapp05.service;

import bankapp05.model.BankAccount;
import bankapp05.model.SalaryAccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountService implements IBankAccountService {
    List<BankAccount> accountList = new ArrayList<>();
    ArrayList<BankAccount>;
    
    @Override
    public String addAccount(int accId,String accHolderName, double balance,String accType) {
        boolean test = accountList.add(new SalaryAccount(accId,accHolderName,balance,accType));
        if(test){
            return "acc made.";
        }
        return "failed to create acc.";
    }


    @Override
    public double checkBalance(int accId) {
        return findByAccId(accId).getBalance();
    }

    @Override
    public String transaction(int accId, double amount, String accType) {
        return null;
    }

    @Override
    public List<BankAccount> getAccounts() {
        return null;
    }

    @Override
    public List<BankAccount> sortByAccHolderName() {
        return null;
    }

    @Override
    public List<BankAccount> sortByBal() {
        return null;
    }

    @Override
    public BankAccount findByAccId(int accId) {
        return null;
    }

    @Override
    public int closeAccount(int accId) {
        BankAccount account = findByAccId(accId);
        if (accountList.remove(account)) {
            return "Closed account ";
        }
        return "Failed to close account";
    }


}
