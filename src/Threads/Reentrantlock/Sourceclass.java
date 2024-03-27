package Threads.Reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Sourceclass {


    ReentrantLock r = new ReentrantLock();

    public void display(String name) throws InterruptedException {

        do {
            if (r.tryLock()) {
                System.out.println("started" + name);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("thread finished" + name);
                r.unlock();
                break;
            } else {
                System.out.println(" i am waiting to finish");
            }
        }while(true);

    }



}
