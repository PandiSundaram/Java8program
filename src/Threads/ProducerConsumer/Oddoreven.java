package Threads.ProducerConsumer;
import Threads.Thread2;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Oddoreven {

    ReentrantLock lock = new ReentrantLock();

    Condition c1 = lock.newCondition();
    int start = 1;

    public void check(){

        lock.lock();
        while(true){

             while(start % 2 != 0){
                 try {
                     c1.await();
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
                 //System.out.println(Thread.currentThread().getName()+ start );
            }
                System.out.println(Thread.currentThread().getName()+ start );
                 start++;
                 c1.signal();


        }

        //lock.unlock();

    }
}

class Test{


    public static void main(String arg[]){
        Oddoreven oddoreven = new Oddoreven();
        Runnable r1 = () -> oddoreven.check();

        Runnable r2 = () -> oddoreven.check();

        Thread t1 = new Thread(r1);
        t1.setName("odd");
        Thread t2 = new Thread(r2);
        t1.setName("even");

        t1.start();
        t2.start();

    }
}