package Threads;

public class DisplayThread extends Thread {

    Display d;
    String name;

    DisplayThread(Display d, String name){
        this.name = name;
        this.d = d;
    }

    public void run(){
        try {
            d.wish(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
