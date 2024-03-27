package Threads.Deadlock;

public class lockClass {
    //lockClass2 lockClass2;
    public synchronized void display(lockClass2 lockClass2)  {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //  lockClass2.display(this);
        //System.out.println();
        lockClass2.l2method();
    }

    public synchronized void l1method(){
        System.out.println("l1 method");
    }


}
