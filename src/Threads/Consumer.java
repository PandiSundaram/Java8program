package Threads;

public class Consumer extends Thread{

    Listresource listresource;
    Consumer(Listresource listresource){
        this.listresource = listresource;
    }

    public void run(){
        try {
            for(int i=0;i<10;i++){
              System.out.println("produce"+ listresource.get());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
