package Threads.ProducerConsumer;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
    LinkedList<Integer> li = new LinkedList<>();
    Integer capacity = 0;


    private final Lock lock;
    private final Condition condition1;
    private final Condition condition2;

    ProducerConsumer(){
        lock = new ReentrantLock();
        condition1 = lock.newCondition();
        condition2 = lock.newCondition();
    }

    public void produce() throws InterruptedException {


        int item = 0;
       while(item < 10) {

          // synchronized(this) {

           lock.lock();
               while(li.size() > 0)
//                   wait();
                   condition1.await();
               System.out.println("produce" + item);
               li.add(item);
               item++;
              // notify();
              condition2.signal();
               Thread.sleep(1000);

          // }
       }
    }

    public void consume() throws InterruptedException {
       int item = 0;
        while(item < 10){
            lock.lock();
           // synchronized (this){
                while(li.size() == 0){
                  //  wait();
                    condition2.await();
                }
                 item = li.removeFirst();
                System.out.println("consume"+ item);
                //notify();
            condition1.signal();
                Thread.sleep(1000);
            }
       // }

    }




}

class test{

    public static void main(String arg[]){

        ProducerConsumer p = new ProducerConsumer();

        Runnable r = () -> {
            try {
                p.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable r1 = () -> {
            try {
                p.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        List<Runnable> rli = new LinkedList<>();
        rli.add(r);
        rli.add(r1);

        ExecutorService e = Executors.newFixedThreadPool(10);

        for(Runnable rs : rli){
            e.submit(rs);
        }


//        Thread thread1 = new Thread(r);
//        Thread thread2 = new Thread(r1);
//
//        thread1.start();
//        thread2.start();


    }
}

