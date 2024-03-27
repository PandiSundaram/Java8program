package OLDER;

import java.util.ArrayDeque;

public class Deque {


    public static void main(String arg[]){

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(8);
        ad.offer(10);
        ad.offer(0);

        System.out.print(ad);

        ad.pop();

        System.out.print(ad.peek());


    }

}
