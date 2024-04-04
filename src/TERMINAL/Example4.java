package TERMINAL;

import java.util.*;
import java.util.stream.Collectors;

public class Example4 {

    //collect is one of the terminal operator which will take collectors unitlity class to provide implementation

    public static void main(String arg[]) {


        List<Employee> empList = Arrays.asList(
                new Employee("Schwerin", "zchwerin@gmail.com", "Male", 5000),
                new Employee("Kyle", "kfrudd1@ovh.net", "Male", 20000),
                new Employee("Axe", "agumb2@twitter.com", "Female", 30000),
                new Employee("suda", "suda@twitter.com", "Female", 70000),
                new Employee("pandi", "pandi@twitter.com", "Male", 50000),
                 new Employee("pandi", "pandi1@twitter.com", "Male", 40000));



        // toList , toSet, toCollection

        List<String> li = empList.stream().map(e -> e.getName()).collect(Collectors.toList());
        Set<String> li1 =  empList.stream().map(e -> e.getName()).collect(Collectors.toSet());
        LinkedHashSet<String> li2= empList.stream().map(e -> e.getEmail()).collect(Collectors.toCollection(() -> new LinkedHashSet<>()));
        empList.stream().map(e -> e.getName()).collect(Collectors.toCollection(() -> new LinkedList<>()));

//        System.out.println(li);
//        System.out.println(li1);
//        System.out.println(li2);

        // counting

       Long n = empList.stream().collect(Collectors.counting());

       //joining 3 overloading method delimeter, prefix and suffix

       String str = empList.stream().map(e -> e.getName()).collect(Collectors.joining(".","{","}"));

       //System.out.println(str);

       //partitioningBy - always accept predicate so only two possible entries 2 overloaded method

        List<Integer> salaryList = empList.stream().map(e -> e.getSalary()).collect(Collectors.toList());

        Map<Boolean,List<Integer>> partion= salaryList.stream().collect(Collectors.partitioningBy(e -> e > 30000));

        System.out.println(partion);

        Map<Boolean,Long> partionboolean =  salaryList.stream().collect(Collectors.partitioningBy(e->e > 30000,Collectors.counting()));

       System.out.println(partionboolean);


       // groupby has 3 overloaded method


        Map<String,List<Employee>> grp1 = empList.stream().collect(Collectors.groupingBy(e->e.getName(),Collectors.toList()));
        System.out.println(grp1);

        Map<String,Long> grp2= empList.stream().map(e -> e.getGender()).collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(grp2);

        Map<Integer, Set<String>> group3= empList.stream().collect(Collectors.groupingBy(e -> e.getSalary(),Collectors.mapping(e->e.getName(),Collectors.toSet())));
        System.out.println(group3);

        TreeMap<String, Set<Employee>> group6= empList.stream().collect(Collectors.groupingBy(e -> e.getGender(),TreeMap::new,Collectors.toSet()));
        System.out.println("group6"+group6);

        Map<String,Double> grp4= empList.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingDouble(e->e.getSalary())));
        System.out.println(grp4);

        Map<Object, Optional<Employee>> grp5= empList.stream().collect(Collectors.groupingBy(e -> e.getGender(),Collectors.maxBy((e1, e2) -> e1.getSalary()<e2.getSalary()?-1:e1.getSalary()>e2.getSalary()?1:0)));
        System.out.println(grp5);

        Map<String,List<Employee>> maprdu = empList.stream().
                collect(Collectors.groupingBy((e) -> e.getGender(),
                        Collectors.filtering(e -> e.getSalary()>30000,Collectors.toList())));

        System.out.println(maprdu);



        //toMap used to convert stream to map 3 overloaded methods used to handle duplicate keys

        List<String> maplist = Arrays.asList("apple","banana","grape","cuva");
        Map<Character,String> map1 = maplist.stream().collect(Collectors.toMap(a->a.charAt(0),a-> a));
//        System.out.println(map1);
        List<String> maplist1 = Arrays.asList("apple","banana","grape","guva");
        Map<Character,String> map2 = maplist1.stream().collect(Collectors.toMap(a->a.charAt(0),a->a,(a,a1)-> a1));
//        System.out.println(map2);

        //mapping, filtering, reducing

        List<Integer> mapp1= empList.stream().collect(Collectors.mapping(e -> e.getSalary(),Collectors.toList()));
        //System.out.println(mapp1);





    }

}
