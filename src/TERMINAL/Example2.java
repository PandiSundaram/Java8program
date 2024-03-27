package TERMINAL;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example2 {

    //findAny, findFirst, allMatch, anyMatch, noneMatch toArray()

    public static void main(String arg[]) {

        List<Employee> empList = Arrays.asList(
                new Employee("Schwerin", "zchwerin@gmail.com", "Male", 5000),
                new Employee("Kyle", "kfrudd1@ovh.net", "Male", 20000),
                new Employee("Axe", "agumb2@twitter.com", "Female", 30000),
                new Employee("pandi", "pandi@twitter.com", "Male", 50000));

        //findOne
        Optional<Employee> employee = empList.stream().findFirst();
        System.out.println(employee.get());

        //findAny
        Optional<Employee> employee1 = empList.stream().findAny();
        System.out.println(employee1.get());

        //noneMatch,anyMatch,allMatch

        Boolean allMatch = empList.stream().allMatch(e -> e.salary>10000);

        Boolean anyMatch = empList.stream().anyMatch(e -> e.getName().equals("Axe"));

        Boolean nonMatch = empList.stream().noneMatch(e -> e.salary > 1000);

        System.out.println(allMatch);
        System.out.println(anyMatch);
        System.out.println(nonMatch);

        Object[] empobj = empList.stream().toArray();

       }

    }
