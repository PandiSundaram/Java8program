package Threads;

public class Producer extends Thread{

    Listresource listresource;

    public Producer(Listresource listresource){
        this.listresource =  listresource;
    }


    public void run(){
        try {
            for(int i=0;i<10;i++){
                listresource.put(i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
