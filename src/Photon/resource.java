package Photon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class resource {

    LinkedList<Integer> li = new LinkedList<>();

    private final ReentrantLock lock;
    private final Condition condition1;
    private final Condition condition2;
    int i =1;

    public resource(){
        lock = new ReentrantLock();
        condition1 = lock.newCondition();
        condition2 = lock.newCondition();
    }


    public void produce() throws InterruptedException {

        while(i<10){

          lock.lock();
          while(!li.isEmpty()) {
              condition1.await();
          }

                System.out.println("i am producing"+ i);
                li.add(i);
                i++;
            condition2.signal();


        }


    }


    public void consume() throws InterruptedException {


        while(i<10){

            lock.lock();
            while(li.isEmpty()){
                condition2.await();

            }


            li.removeFirst();
            System.out.println("i am consuming"+i);
            condition1.signal();

        }


    }



}
