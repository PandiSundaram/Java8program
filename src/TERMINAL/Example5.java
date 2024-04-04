package TERMINAL;

import java.util.*;
import java.util.stream.Collectors;

public class Example5 {


    public static void main(String arg[]){


        List<Employee> empList = Arrays.asList(
                new Employee("Schwerin", "zchwerin@gmail.com", "IT", 5000),
                new Employee("Kyle", "kfrudd1@ovh.net", "Software", 20000),
                new Employee("Axe", "agumb2@twitter.com", "Networking", 30000),
                new Employee("suda", "suda@twitter.com", "IT", 70000),
                new Employee("pandi", "pandi@twitter.com", "Networking", 50000),
                new Employee("pandi", "pandi1@twitter.com", "Networking", 40000));


       Map<String,Long> map = empList.stream().map(e->e.getGender()).collect(Collectors.groupingBy(e->e , TreeMap::new,Collectors.counting()));

       System.out.println(map);

       Map<String,Long> m1  = map.entrySet().stream().sorted((e1, e2) -> e1.getValue()>e2.getValue()?1:e1.getValue()<e2.getValue()?-1:0)
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));

        System.out.println(m1);

    }

}
