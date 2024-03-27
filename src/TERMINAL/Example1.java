package TERMINAL;

import java.util.Arrays;
import java.util.List;

public class Example1 {

    //  count, foreach, min, max, sort


    public static void main(String arg[]){

        List<Employee> empList = Arrays.asList(
                new Employee("Schwerin", "zchwerin@gmail.com", "Male", 5000),
                new Employee("Kyle", "kfrudd1@ovh.net", "Male", 20000),
                new Employee("Axe", "agumb2@twitter.com", "Female", 30000),
                new Employee("pandi", "pandi@twitter.com", "Male", 50000));

        // no of elements
        Long count = empList.stream().filter(e -> e.getSalary()>20000).count();
        System.out.println(count);

        //find min salary
        Employee minsalaryemployee = empList.stream().min((e1,e2) -> {return e1.salary < e2.getSalary() ?-1:e1.getSalary()>e2.getSalary()?1:0;}).get();
        System.out.println(minsalaryemployee);

        //find max salary
        Employee maxsalaryemployee = empList.stream().max((e1,e2) -> e1.getSalary() < e2.getSalary() ?-1:e1.getSalary()>e2.getSalary()?1:0).get();
        System.out.println(maxsalaryemployee);

        Integer p = empList.stream().mapToInt(e -> e.getSalary()).sum();

        System.out.println("panid"+p);
        //sort based on salary
        empList.stream().sorted((e1,e2) -> {return e1.getSalary() < e2.getSalary() ?-1:e1.getSalary() > e2.getSalary()?1:0;} )
                .forEach(e -> System.out.println(e.getSalary()));

        //sort based on name
        empList.stream().sorted((e1,e2) -> {return e1.getName().compareToIgnoreCase(e2.getName());}).forEach(e -> System.out.println(e.getName()));

    }



}
