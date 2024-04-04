package Photon;

import java.util.Arrays;
import java.util.List;

public class newtest1 {


    public static void main(String arg[]){

        oddoreven oddoreven = new oddoreven();

        Runnable r1 = () -> {
            try {
                oddoreven.pringevenNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable r2 = () -> {
            try {
                oddoreven.printOddNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };


        Thread t1 = new Thread(r1);
        t1.setName("event thread");
        Thread t2 = new Thread(r2);
        t2.setName("odd thread");
        t1.start();
        t2.start();



    }


}
