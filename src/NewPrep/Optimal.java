package NewPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Optimal {

    public static void main(String arg[]){

       List<Integer> integerList = Arrays.asList(1,2,3,4,4,4,1,1,1,6,7,9,10,20,30,1,1,1,1);

      Map<Integer,Long> map  = integerList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

      Long max = 0L;
      Integer key = 0;

       //map.entrySet().stream().

        for(Map.Entry<Integer,Long> m: map.entrySet()){

            if(m.getValue()>max){
                key = m.getKey();
                max = m.getValue();
            }

        }

        System.out.println(key+" "+ max);







//
//       List<Long> li = map.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
//
//        Long l = li.stream().mapToLong(e -> e).max().getAsLong();
//
//        System.out.println(l);


    }
}
