package Threads.Deadlock;

public class lockClass2 {




    public synchronized void display(lockClass lockClass)  {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
            throw new RuntimeException(e);
        }
        lockClass.l1method();
    }


    public synchronized void l2method(){
        System.out.println("l2 method");
    }


}
