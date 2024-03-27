package INTERMEDIATE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

    //filter map  flatmap
    public static void main(String arg[]){

        List<Employee> empList = Arrays.asList(
                new Employee(1,"Schwerin",  "Male", 5000),
                new Employee(1,"Schwerin", "Male", 5000),
                new Employee(3,"Axe",  "Female", 30000),
                new Employee(4,"pandi",  "Male", 50000));

        List<Employee> emli = empList.stream().filter(e -> e.getSalary()>5000 && e.getName().equalsIgnoreCase("Axe")).collect(Collectors.toList());
        System.out.println(emli);

      //boxed()
       List<Double> liit = empList.stream().map(e -> e.getSalary()).mapToDouble(e -> e).boxed().collect(Collectors.toList());
        System.out.println(liit);

        //flatmap


       List<List<Integer>> listList = Arrays.asList(Arrays.asList(1,4,6,6),Arrays.asList(9,0,4,6),Arrays.asList(1,5,6,8));

       List<Integer> li = listList.stream().flatMap(l->l.stream()).collect(Collectors.toList());

       System.out.println(li);


       Character a[][] = new Character[][]{{'a','b','c'},{'d','e','f'},{'g','h','i'}};

       List<Character> characterList = Arrays.stream(a)
               .flatMap(b -> Arrays.stream(b).sorted())
               .collect(Collectors.toList());

       System.out.println(characterList);





    }

}
