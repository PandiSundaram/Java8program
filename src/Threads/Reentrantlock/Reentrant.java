package Threads.Reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Reentrant {

    public  static void main(String arg[]){

        Sourceclass s = new Sourceclass();

        Runnable r = () -> {
            try {
                s.display("pandi");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable r1 = () -> {
            try {
                s.display("sundaram");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t = new Thread(r);
        Thread t1 = new Thread(r1);

        t.start();
        t1.start();

    }


}
