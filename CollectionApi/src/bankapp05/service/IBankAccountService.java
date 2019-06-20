package bankapp05.service;
import bankapp05.model.BankAccount;

import java.util.*;

public interface IBankAccountService {
    String addAccount(int accId, String accHolderName, double balance,String accType);
    double checkBalance(int accId);
    String transaction(int accId, double amount, String accType);
    List<BankAccount> getAccounts();
    List<BankAccount> sortByAccHolderName();
    List<BankAccount> sortByBal();

    BankAccount findByAccId(int accId);
    BankAccount closeAccount(int accId);
}
