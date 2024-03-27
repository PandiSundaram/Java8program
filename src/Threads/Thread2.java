package Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class Thread2 {



    public static void main(String arg[]) throws ExecutionException, InterruptedException {

//        Integer t = Runtime.getRuntime().availableProcessors();
//        System.out.println(t);

       // ExecutorService e = Executors.newFixedThreadPool(5);

       // ExecutorService e1 = Executors.newSingleThreadExecutor(); it has only one thread used to make sure every task has been executed with out faile sequentially

      //  ExecutorService e2 = Executors.newCachedThreadPool();

        ExecutorService e3 = Executors.newScheduledThreadPool(10);
       // e3.schedule();


        ArrayList<CompletableFuture<Integer>> li = new ArrayList<>();
        Supplier r = () -> {return 2;};
        for(int i=0;i<10;i++){
            CompletableFuture<Integer> f = CompletableFuture.supplyAsync(r,e3);
             li.add(f);
        }

        System.out.println(li.size());
        System.out.println(li.get(4));

        e3.shutdown();

    }





}
