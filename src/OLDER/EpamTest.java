package OLDER;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EpamTest {


//    Question 1: Find the total balance of all savings accounts across all customers.

//    Question 2: Find the average balance of all customers who have a checking account balance greater than a given threshold.

    public static void main(String arg[]){

     Customer customer1 = new Customer(1, "Alice");

      customer1.setAccounts(List.of(new Account("S123", 3000.0, AccountType.SAVINGS), new Account("C456", 7000.0, AccountType.CHECKING) ));
      Customer customer2 = new Customer(2, "Bob");
      customer2.setAccounts(List.of(new Account("S789", 5000.0, AccountType.SAVINGS), new Account("C012", 4000.0, AccountType.CHECKING)));
      List<Customer> customers = List.of(customer1, customer2);

      List<Account> accountList = customers.stream().flatMap(c ->c.getAccounts().stream()).collect(Collectors.toList());

     Double avgbalance = accountList.stream().filter(a -> a.getType().equals( AccountType.CHECKING) && a.getBalance()>3000).mapToDouble(a -> a.getBalance()).average().getAsDouble();
     Double totalbalace = accountList.stream().filter(a -> a.getType().equals(AccountType.SAVINGS)).mapToDouble(a->a.getBalance()).sum();

     System.out.println("avgBalance" + avgbalance);
     System.out.println("totalbalace" + totalbalace);


        List<Account> ali = customers.stream().flatMap(c -> c.getAccounts().stream()).collect(Collectors.toList());

         System.out.println("size"+ ali.size());

        double t  = ali.stream().filter(account -> account.getType().equals(AccountType.SAVINGS)).map(a ->a.getBalance())
                        .reduce(0.0,(a1,a2)->a1+a2);


        System.out.println(t);


       List<Account> liac = customers.stream().flatMap(customer -> customer.getAccounts().stream()).collect(Collectors.toList());
        Double avg = liac.stream().filter(a ->
        {return a.getType().equals(AccountType.CHECKING) && a.getBalance()>3000;})
                .mapToDouble(a -> a.getBalance())
                .summaryStatistics()
                .getAverage();

        System.out.println(avg);

//       double balance =0;
//
//           for(int i=0;i<customers.size();i++){
//              List<OLDER.Account> c = customers.get(i).getAccounts();
//              for(int j=0;j<c.size();j++){
//                 if( c.get(j).getType().equals( OLDER.AccountType.SAVINGS)){
//                     balance = balance + c.get(j).getBalance();
//                 }
//              }
//
//           }
//            System.out.println(balance);
       }

}
