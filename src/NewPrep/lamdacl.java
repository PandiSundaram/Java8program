package NewPrep;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class lamdacl {



    public static void main(String arg[]){


//        Runnable r = () -> {
//            System.out.println("i am running");
//        };
//
//        Thread t = new Thread(r);
//        t.start();
//
//
//        String s = "pandi";
//
//
//       char[] ar =  s.toCharArray();
//
//
//       System.out.println( s.chars().allMatch( e -> !Character.isLetter(e)));
//
//
//        List<String> intList
//                = List.of("5", "19", "8", "23", "6", "54", "32", "5", "23");
//        List<Double> intList1 =  intList.stream().mapToDouble(e -> Double.parseDouble(e)).boxed().collect(Collectors.toList());
//
//       Double d = intList1.stream().mapToDouble(e->e).sum();
//       System.out.println(d);
//
//       Double t1 =  intList1.stream().mapToDouble(e->e).average().getAsDouble();
//        System.out.println(t1);


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Auava");
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Apple");
        Map<String,Long> ioop=  fruits.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(ioop);

        Map<Boolean,List<String>> s = fruits.stream().collect(Collectors.partitioningBy(e-> e.length()>5,Collectors.toList()));

        System.out.println(s);

        Map<Character,String> map = fruits.stream().collect(Collectors.toMap(e->e.charAt(0), e->e,(e1,e2) -> e1));

        System.out.println(map);

        Map<String,Integer> map1 = fruits.stream().collect(Collectors.toMap((e) -> e,(e) -> e.toString().length(),(e1,e2) -> e1));
        System.out.println(map1);


        List<String> lis = fruits.stream().collect(Collectors.filtering((name)-> name.equals("Apple"),Collectors.toList()));


        Long r = fruits.stream().collect(Collectors.mapping((e) -> e.toUpperCase(),Collectors.counting()));




        //tolist
        //toset
        //collection(() -> new ArrayList())

        //tomap()
           //  - () -> key , () -> value , () -> merge

        // partiniong

        // grouping



        // filtering

        // mapping





    }



}
