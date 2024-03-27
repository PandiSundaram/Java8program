package NewPrep;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {


    public static void main(String arg[]){


        List<String> li9= Arrays.asList("apple","apple","grape","orange");

        Set<String> sio=  li9.stream().filter(s -> Collections.frequency(li9,s) > 1).collect(Collectors.toSet());
        System.out.println(sio);

        System.out.println(li9);

        Set s = new HashSet();

        List<String> li3 = li9.stream().distinct().collect(Collectors.toList());
        List<String> li4 = li9.stream().filter(i -> !s.add(i)).collect(Collectors.toList());

       // System.out.println(li3);

       // System.out.println(li4);

        Map<String,Long> map = li9.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        List<String> r = map.entrySet().stream().filter(e -> e.getValue() == 1).map(e->e.getKey()).collect(Collectors.toList());

        System.out.println(r);
        //System.out.println(map);
//
//        Set s = new HashSet();
//        s.addAll(li);
//
//        System.out.println(s);
//
//        Set s1 = new HashSet();
//       List<String> li1= li.stream().filter(i -> s1.add(i)).collect(Collectors.toList());
//
//        System.out.println(li1);
//
//       Map<String,String> map = li.stream().collect(Collectors.toMap(n -> n, n->n,(n1, n2)->n1));
//
//        System.out.println(map);

        Employee emp1 = new Employee();
        emp1.setSalary(10000);
        emp1.setAge(20);
        emp1.setName("pandi");

        Employee emp2 = new Employee();

        emp2.setSalary(2000);
        emp2.setAge(20);
        emp2.setName("sundaram");


        Employee emp3 = new Employee();

        emp3.setSalary(3000);
        emp3.setAge(22);
        emp3.setName("fullcreative");


        List<Employee> employeeList = new ArrayList<>(3);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        System.out.println(employeeList);

        TreeMap<Integer,Set<Employee>> li = employeeList.stream().collect(Collectors.groupingBy(e ->e.getAge(),TreeMap::new,Collectors.toSet()));

        System.out.println(li);

           //List<Integer> li2 =employeeList.stream().map(employee -> employee.getSalary()).collect(Collectors.toList());
//        List<Employee> li5 = employeeList.stream().sorted((e1,e2) -> e1.getSalary() < e2.getSalary() ?-1:e1.getSalary() > e2.getSalary()?1:0)
//                    .collect(Collectors.toList());
//
//            System.out.println(li5);

        //li.stream().sort((a1,a2) -> a1<a2?)


        Integer a[] = {1,2,3,4,5};
        Integer b[] = {4,5,6,1,7};


       List<Integer> li45 = Arrays.stream(a).filter(i -> Arrays.stream(b).anyMatch(i1 -> i1 == i)).collect(Collectors.toList());

       System.out.println(li45);

        Integer c[] = {1,2,3,4,5};
//
//        int m = c.length/2;
//        int len = c.length-1;
//        for(int i=0; i<m;i++){
//            int temp = c[len];
//            c[len] = c[i];
//            c[i] = temp;
//            len--;
//        }
//
//     System.out.println(Arrays.toString(c));


        IntStream.range(0,c.length/2).forEach(e ->{
            int tem = c[e];
            c[e] = c[c.length-e-1];
            c[c.length-e-1]= tem;
        });

        System.out.println(Arrays.toString(c));


        String arr1[]  = {"pandi","pandisndr","pafafds","fdsfdsf"};

        int high = 0;
        for(int i=0;i<arr1.length;i++){

            if(arr1[i].length() >= high){
                high = arr1[i].length();
            }

        }

        System.out.println(high);

        int s12 = Arrays.stream(arr1).mapToInt(e -> e.length()).max().orElse(0);

        System.out.println(s12);

    }





}
