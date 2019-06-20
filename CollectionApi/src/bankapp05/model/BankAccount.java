package bankapp05.model;

public class BankAccount {
    private int accId;
    private String accHolderName;
    private double balance;
    private String accType;

    public BankAccount() {
        super();
    }

    public BankAccount(int accId, String accHolderName, double balance, String accType) {
        super();
        this.accId = accId;
        this.accHolderName = accHolderName;
        this.balance = balance;
        this.accType = accType;
    }

    public int getAccId(int accId) {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getAccHolderName(int accId) {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void addAccount(int accId, String accHolderName, double balance, String accType) {
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accId=" + accId +
                ", accHolderName='" + accHolderName + '\'' +
                ", balance=" + balance +
                ", accType='" + accType + '\'' +
                '}';
    }

}
