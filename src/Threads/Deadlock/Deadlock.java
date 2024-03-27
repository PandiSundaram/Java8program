package Threads.Deadlock;

public class Deadlock extends Thread{

   lockClass l1 = new lockClass();
   lockClass2 l2 = new lockClass2();
    public void m1() throws InterruptedException {
       this.start();
       l1.display(l2);
    }

    public void run(){
        l2.display(l1);
    }

public static void main(String arg[]) throws InterruptedException {

    Deadlock d = new Deadlock();
    d.m1();


}



}
