package OLDER;

import java.util.List;

public class Customer {

    private int customerId;

//    public OLDER.Customer(int customerId, String name, List<OLDER.Account> accounts) {
//        this.customerId = customerId;
//        this.name = name;
//        this.accounts = accounts;
//    }

    Customer(int customerId, String name){
        this.customerId = customerId;
        this.name = name;
    }

    private String name;

    private List<Account> accounts;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }




}
