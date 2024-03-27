package OLDER;

public class Account {


    public Account(){

    }
    public Account(String accountNumber, double balance, AccountType type) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.type = type;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    private String accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountType getType() {
        return type;
    }

    private AccountType type;
}
