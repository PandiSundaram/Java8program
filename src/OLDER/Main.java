package OLDER;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


//       List<Integer> li =  Arrays.asList(4,56,2,34,23,0);
//
//       List<Integer> l = li.stream().filter(i->i%2==0).collect(Collectors.toList());
//
//        l.forEach(System.out::println);
//
//        List<Integer> l1 =  li.stream().map(i->i+5).collect(Collectors.toList());
//
//        System.out.print(l1);
//
//       List<Integer> li2 =  li.stream().sorted().collect(Collectors.toList());
//
//        System.out.print(li2);
//
//        List<Integer> li3 = li.stream().sorted((i1,i2)-> i1<i2?1:i1>i2?-1:0).collect(Collectors.toList());
//
//        System.out.println(li3);
//
//        List<String> names = Arrays.asList("pandi","pandi","sundaram","bala");
//        Set<String> uniqueName = new HashSet<>();
//        Set<String> dublication = names.stream().filter(name -> !uniqueName.add(name)).collect(Collectors.toSet());
//        System.out.println(dublication);
//        System.out.println(uniqueName);
//
//
//      Map<String,Long> map=  names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//      map.entrySet().forEach(a -> System.out.println(a.getKey()));
//      Set<String> s = map.entrySet().stream().filter(m->m.getValue()>1).map(m-> m.getKey()).collect(Collectors.toSet());


       HashMap<String,Integer> map1 = new HashMap<>();
       String dup = "I am am am java java program";

       String[] stingarry =  dup.split(" ");




       for(String st : stingarry){

           if(map1.get(st) !=null){
               map1.put(st,map1.get(st) + 1);
           }else{
               map1.put(st,1);
           }


       }


        map1.entrySet().forEach(System.out::println);



    }
}