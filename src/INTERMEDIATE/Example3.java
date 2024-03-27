package INTERMEDIATE;

import java.util.*;
import java.util.stream.Collectors;

public class Example3 {


    public static void main(String arg[]){


       List<Employee1> employee1List = Arrays.asList(new Employee1("pandi",1,"male",Arrays.asList(100,200,300)),
                new Employee1("sundaram",2,"male",Arrays.asList(1000,2000,3000)),
                new Employee1("benji",3,"female",Arrays.asList(50,20,300)));


//      List<Integer> lit=  employee1List.stream().filter(e->e.getGender().equalsIgnoreCase("male"))
//                .flatMap(e->e.getSalary().stream())
//                .collect(Collectors.toList());

//      System.out.println(lit);
        employee1List.stream().filter(e -> e.getGender().equals("male")).flatMap(sly -> sly.getSalary().stream())
                .collect(Collectors.toList());


        Map<Integer,String> map = new HashMap<>();
        map.put(1,"apple");
        map.put(2,"grape");
        map.put(3,"banana");


//        System.out.println(map.entrySet());
//        System.out.println(map.keySet());
//        System.out.println(map.values());


          //Set<Map.Entry<Integer, String>> s = map.entrySet();



//          map.forEach((k,v) -> System.out.println(k +""+ v));
//          map.entrySet().forEach(e -> System.out.println(e.getKey()+""+ e.getValue()));
//          map.keySet().forEach(e -> System.out.println(e));
//          map.values().forEach(e -> System.out.println(e));





    }

}
