package Threads.ProducerConsumer;

import Threads.Reentrantlock.Reentrant;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chat {


    Boolean cantrigger = true;

    private final Lock reentrant;
    private final Condition isEmpty;
    private final Condition isFull;

    public Chat() {
        reentrant = new ReentrantLock();
        isEmpty = reentrant.newCondition();
        isFull = reentrant.newCondition();
    }

    public void question(String question) throws InterruptedException {

          reentrant.lock();
            while(!cantrigger)
                isEmpty.await();

            System.out.println("question :" + question);
            cantrigger = false;
            isFull.signal();
            reentrant.unlock();
        try {
          //  Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
           finally{

        }

    }

    public void answer(String answer) throws InterruptedException {

            reentrant.lock();
            while(cantrigger)
                isFull.await();

            System.out.println("answer :" + answer);
            cantrigger = true;

             isEmpty.signal();
             reentrant.unlock();

        try {
            //  Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
        }

    }


}
