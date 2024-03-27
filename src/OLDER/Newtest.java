package OLDER;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Newtest {


    public static void main(String arg[]) {

        List<user> userList = Arrays.asList(new user(100, "pandi", Arrays.asList("iop", "rty")),
                new user(1110, "sundar", Arrays.asList("8900", "fsfsfsfs")),
                new user(500, "bala", Arrays.asList("uiooa", "tnj"))
        );


        List<String> r = Arrays.asList("23","35","76");

       List<Integer> salaryList = userList.stream().map(user -> user.getSalary()).collect(Collectors.toList());

//       System.out.println(salaryList.stream().mapToInt(salry -> salry).summaryStatistics().getMax());
//        System.out.println(salaryList.stream().mapToInt(salry -> salry).summaryStatistics().getMin());
//        System.out.println(salaryList.stream().mapToInt(salry -> salry).summaryStatistics().getSum());
//        System.out.println(salaryList.stream().mapToInt(salry -> salry).summaryStatistics().getAverage());
//        System.out.println(salaryList.stream().mapToInt(salry -> salry).summaryStatistics().getCount());


     //   System.out.println( r.stream().mapToInt(s -> Integer.parseInt(s)).summaryStatistics().getMax());

        List<Integer> t = Arrays.asList(23,35,76);

        Integer s = t.stream().reduce(0,(i,i1)->i+i1);

        System.out.println(s);


        List<String> stringlist = userList.stream().map(user -> user.getName()).collect(Collectors.toList());
       Optional<String> my = stringlist.stream().reduce((s1, s2) -> s1+"_"+s2);
        System.out.println(my);

       Optional<Integer> r4 = t.stream().min((t1,t2) -> {
            if(t1<t2){
                return -1;
            }else if(t1<t2){
                return 1;
            }else{
                return 0;
            }
        });

        System.out.println(r4.get());

    }


}
