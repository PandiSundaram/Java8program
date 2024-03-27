package OLDER;

import java.util.*;
import java.util.stream.Collectors;


public class groupbytest {



        public static void main(String[] args) {

            List<Employee> empList = Arrays.asList(
                    new Employee("Schwerin", "zchwerin@gmail.com", "Male", 5000),
                    new Employee("Kyle", "kfrudd1@ovh.net", "Male", 20000),
                    new Employee("Axe", "agumb2@twitter.com", "Female", 30000),
                    new Employee("pandi", "pandi@twitter.com", "Male", 50000));


// with function as a paramer
            Map<String,List<Employee>> empli1 = empList.stream().collect(Collectors.groupingBy(e -> e.getGender()));
           // System.out.println(empli1);
// with function and collector as a paramer
            Map<String,List<String>> empli2 = empList.stream().collect(Collectors.groupingBy(e -> e.getGender(),Collectors.mapping(e->e.getName(),Collectors.toList())));
           // System.out.println(empli2);
// with function supplier and collector as a paramer
            Hashtable<String,List<Employee>> empli3 = empList.stream().collect(Collectors.groupingBy(e->e.getGender(),() -> new Hashtable<>(),Collectors.toList()));
           // System.out.println(empli3);


            List<String> items = Arrays.asList("apple", "apple", "banana",
                    "apple", "orange", "banana", "papaya");

// function.identity or s -> s are same
           Map<String,Long> result = items.stream().collect(
                            Collectors.groupingBy(s -> s,Collectors.counting()));

            //System.out.println(result);



        }

}