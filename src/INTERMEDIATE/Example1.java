package INTERMEDIATE;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

    //distict, peek, limit, summarystatics,boxed, max, min, sum

       public static void main(String arg[]){


         List<String> fruits =  Arrays.asList("apple","banana","apple","graphs");

          List<String> f1 = fruits.stream().distinct().collect(Collectors.toList());
          List<String> f2 =  fruits.stream().peek(e -> e.toUpperCase()).collect(Collectors.toList());
           List<String> f3 = fruits.stream().limit(2).collect(Collectors.toList());


           System.out.println(f1);

           System.out.println(f2);
          System.out.println(f3);


           List<Employee> empList = Arrays.asList(
                   new Employee(1,"Schwerin",  "Male", 5000),
                   new Employee(1,"Schwerin", "Male", 5000),
                   new Employee(3,"Axe",  "Female", 30000),
                   new Employee(4,"pandi",  "Male", 50000));



          List<Employee> e3= empList.stream().distinct().collect(Collectors.toList());

          //System.out.println(e1.size());


           List<Integer> intList
                   = List.of(5, 19, 8, 23, 6, 54, 32, 5, 23);


           List<Integer> lit = intList.stream().distinct().sorted((d1,d2)->d1<d2?1:d1>d2?-1:0).skip(1).limit(2).toList();

           System.out.println("padi"+lit);
           // functions to find aggrigate results
           intList.stream().mapToInt(i->i).summaryStatistics().getAverage();
           intList.stream().min((d1,d2) -> d1>d2?1:d1<d2?-1:0);
           intList.stream().mapToInt(i->i).sum();
           intList.stream().mapToInt(i ->i).average();

          List<Integer> lin = intList.stream().distinct().filter(i -> i%2 == 0 ).map(e-> e*5)
                  .limit(4)
                  .sorted((e1,e2) -> e1>e2?1:e1<e2?-1:0)
                  .collect(Collectors.toList());
           lin.forEach(System.out::println);
       }

}
