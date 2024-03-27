package OLDER;

import java.util.*;
import java.util.stream.Collectors;

public class priorityqueue {




    public static void main(String arg[]){


       List<user> userList = Arrays.asList(new user(100,"pandi",Arrays.asList("iop","rty")),
                new user(1110,"sundar",Arrays.asList("8900","fsfsfsfs")),
                new user(500,"bala",Arrays.asList("uiooa","tnj"))
                );


       String r =  userList.stream()
                .map(user -> user.getAddress())
                .flatMap(address -> address.stream())
                .map(a -> a.toUpperCase())
               .findAny()
                .orElse("no");

        //System.out.print(r);


       List<user> userl = userList.stream().skip(1)
                .limit(2)
                .collect(Collectors.toList());

        //System.out.print(userl);

       user u = userList.stream().min(Comparator.comparing(user::getSalary)).orElse(null);

//        System.out.print(u);


     Integer r1 = userList.stream().map(user -> user.getSalary())
              .reduce(10,Integer::sum);

        System.out.print(r1);


        //Comparator<OLDER.user> c = (o1,o2)->  o1.getSalary()<o2.getSalary()?-1:1;
//        PriorityQueue<OLDER.user> pq = new PriorityQueue<>(10, (o1,o2) ->o1.getSalary()<o2.getSalary()?-1:1);
//
//        pq.add(new OLDER.user("ss",900));
//        pq.add(new OLDER.user("oppsapfdsa",20));
//        pq.add(new OLDER.user("ss89",33));
//        pq.add(new OLDER.user("sioos",90));
//        pq.add(new OLDER.user("iopasf",1000));
//
//        System.out.println(pq.peek());
//
//        System.out.println(pq.poll());
//
//        System.out.println(pq.peek());

    }
}

//class salarycomparater implements Comparator<OLDER.user>{
//
//    @Override
//    public int compare(OLDER.user o1, OLDER.user o2) {
//        return o1.getSalary()<o2.getSalary()?-1:1;
//    }
//}

class user   {

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OLDER.user{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    private Integer salary;

    public user(Integer salary, String name, List<String> address) {
        this.salary = salary;
        this.name = name;
        this.address = address;
    }

    private String name;

    private List<String> address;

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

//    OLDER.user(){
//
//    }
//    OLDER.user(String name,Integer salary){
//       this.salary = salary;
//       this.name =name;
//    }

}
