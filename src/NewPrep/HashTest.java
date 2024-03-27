package NewPrep;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HashTest {


    public static void main(String arg[]){


        String s="gdhad 42353    14th";

         String s1 = "java guides java";

         String[] ch = s1.split("\\s");

//         Arrays.stream(ch).forEach(e -> System.out.println(e));
//
//
//        Map<String,Long> finalMap = Arrays.stream(ch).collect(Collectors.groupingBy(e->e,Collectors.counting()));
//
//        System.out.println(finalMap);

        int count = 0;

       for(String s5 : ch){
            if(s5.equals("java")){
                count = count +1;
            }
       }

        System.out.println(count);


        String inputString = "Java is a widely used programming language. Java is versatile and has a large community.";

//       char[] cr = inputString.toCharArray();

        Map<Character,Long>ss = inputString.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(c-> c,Collectors.counting()));

        System.out.println(ss);

        String[] array1 = {"Hello", "World"};
        String[] array2 = {"Java", "Programming"};

        List list = new ArrayList(Arrays.asList(array1));

//      List<String> li1 = Arrays.asList(array1);
        List<String> li2 = Arrays.asList(array2);

        list.addAll(li2);

        System.out.println(list);

        Object[] s7 =  list.toArray();


        String inputString1 = "Java is a programming language and Java is widely used in the software industry.";

        String finalstring = Arrays.stream(inputString1.split("\\s")).distinct().collect(Collectors.joining(" "));

        System.out.println(finalstring);

        String r = "pandid";


        char a[] = r.toCharArray();

        int end = a.length-1;
        int start =0;

        while(start < end){
            char temp = a[end];
            a[end]  = a[start];
            a[start] = temp;
            start ++;
            end --;
        }
       // for (char c : a)
           // System.out.print(c);
        //System.out.println(Arrays.asList(a));


        String digitStribng = "pandi 22289j 90";


        char[] ss1 = digitStribng.toCharArray();

        StringBuilder builder = new StringBuilder();

        for(Character c : ss1){
            if(Character.isLetter(c)){
                builder.append(c);
            }
        }

       // System.out.println(builder.toString());

//         char [] c1 = {'a','v','1'};
//
//        System.out.println(Character.isDigit(c1[1]));


        String revers = "pandi";
        StringBuilder builder1 = new StringBuilder();

        for(int i=revers.length()-1;i>=0;i--){
            builder1.append(revers.charAt(i));
        }

        System.out.println( builder1);

        String revers1 = "ssss";

        int inputlength = revers1.length();
        Boolean status = true;

        for(int i=0;i<inputlength/2;i++){
            if(revers1.charAt(i) != revers1.charAt(inputlength-i-1)){
                status = false;
                break;
            }
        }


       String nonrepeat = "Java Guides Popular blog Website";


      LinkedHashMap<Character,Long> ss9= nonrepeat.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(e ->e,() -> new LinkedHashMap<>(),Collectors.counting()));

      Character c = ss9.entrySet().stream().filter(e -> e.getValue() == 1).map(e->e.getKey()).findFirst().get();

      System.out.println(c);

        int[] array = {12,34,56,12,13,454};

        Integer rtr =  Arrays.stream(array).boxed().sorted((e1,e2) -> e1 > e2?-1:e1<e2?1:0).findFirst().get();

        System.out.println(rtr);

        String d = "decode";
        int m = 2;
        String ssss = d.substring(m)+d.substring(0,m);

        System.out.println(ssss);

        int n = d.length()-2;

        String sr = d.substring(n)+d.substring(0,n);

        System.out.println(sr);
    }




}
