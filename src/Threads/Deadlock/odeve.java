package Threads.Deadlock;

import Threads.ProducerConsumer.Oddoreven;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class odeve {
    ReentrantLock lock = new ReentrantLock();

    Condition c1 = lock.newCondition();
    int start = 1;

    int N = 10;


    public void evencheck(){


        synchronized (this) {

            while (N > start) {

                if (start % 2 != 0) {
                    try {
                        wait();

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + start);
                start++;
                notify();
            }

        }




    }

    public void oddcheck(){

       synchronized (this) {
           while (N > start) {

               if (start % 2 == 0) {
                   try {
                       wait();

                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
                   System.out.println(Thread.currentThread().getName() + start);
                   start++;
                   notify();
               }

           }
       }
    }


class Test{


    public static void main(String arg[]){
        odeve oddoreven = new odeve();
        Runnable r1 = () -> oddoreven.evencheck();

        Runnable r2 = () -> oddoreven.oddcheck();

        Thread t1 = new Thread(r1);
        t1.setName("even");
        Thread t2 = new Thread(r2);
        t2.setName("odd");

        t1.start();
        t2.start();

    }
}
