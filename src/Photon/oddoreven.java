package Photon;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class oddoreven {

    private final ReentrantLock lock;
    private final Condition condition1;

    private final Condition condition2;
     int i = 2;

    public oddoreven() {
        this.lock = new ReentrantLock();
        this.condition1 = lock.newCondition();
        this.condition2 = lock.newCondition();
    }



    public void pringevenNumber() throws InterruptedException {

        while(i<10){

            lock.lock();
            while(i%2 != 0){
                condition1.await();
            }

            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
            i++;
            condition2.signal();

        }

    }

    public void printOddNumber() throws InterruptedException {

        while(i<10){

            lock.lock();
             while(i%2 == 0){
                 condition2.await();
             }

             System.out.println(i);
            System.out.println(Thread.currentThread().getName());
             i++;
             condition1.signal();

        }

    }


}
