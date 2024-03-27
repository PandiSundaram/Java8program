package Threads;

public class Display {

    public static synchronized void wish(String name) throws InterruptedException {

        for(int i=0;i<10;i++){
            System.out.println(name);
            Thread.sleep(1000);
        }

    }


}
