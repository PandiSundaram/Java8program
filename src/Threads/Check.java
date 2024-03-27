package Threads;

public class Check {



    public static void main(String arg[]){

        Display d = new Display();
        Display d1 = new Display();
        DisplayThread thread1 = new DisplayThread(d,"pandi");
        DisplayThread thread2 = new DisplayThread(d1,"sundaram");

        thread1.start();
        thread2.start();

    }
}
