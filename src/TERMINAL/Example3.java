package TERMINAL;

import java.util.Arrays;
import java.util.List;


public class Example3 {

    //reduce -> Used to get single out put by reducing the dataset
    public static void main(String arg[]) {

        List<Employee> empList = Arrays.asList(
                new Employee("Schwerin", "zchwerin@gmail.com", "Male", 5000),
                new Employee("Kyle", "kfrudd1@ovh.net", "Male", 20000),
                new Employee("Axe", "agumb2@twitter.com", "Female", 30000),
                new Employee("pandi", "pandi@twitter.com", "Male", 50000));

        List<String> namestr = Arrays.asList("pandi","sundaram","neelarmstorn","sita");
        List<Integer> nostr = Arrays.asList(23,23,1,5,6,0);




        //get total salary from employee list
        Integer totalsalary = empList.stream().map(e -> e.getSalary()).reduce(0,(s1,s2) -> s1+s2);

        //get total salary from employee list without reduce
        Integer sum = empList.stream().map(e->e.getSalary()).mapToInt(e -> e).sum();

        //get avg salary from employee list without reduce
        Double avg = empList.stream().map(e -> e.getSalary()).mapToDouble(e-> e).average().getAsDouble();

        //concat string using reduce
        String contactstr = namestr.stream().reduce("",(str1,str2) -> str1.concat(str2));

        //sum digits using reduce
        Integer sumint = nostr.stream().reduce(0,(n1,n2) -> n1+n2);

        //finding greatest length of the string
        String higstr = namestr.stream().reduce("",(str1,str2) -> str1.length()>str2.length()?str1:str2);

        //fidning greatest integer of the list
        Integer hist = nostr.stream().reduce(0,(no1,no2) -> no1>no2?no1:no2);


        System.out.println(contactstr);
//        System.out.println(sumint);
//        System.out.println(higstr);
//        System.out.println(hist);
//
//        System.out.println(avg);
//        System.out.println(totalsalary);
//        System.out.println(sum);



    }
}
