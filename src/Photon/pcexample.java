package Photon;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class pcexample{

    public static void main(String arg[]){

        resource r = new resource();

        Runnable r1 = () -> {
            try {
                r.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable r2 = () -> {
            try {
                r.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        List<Runnable> runnableList = new ArrayList<>();
        runnableList.add(r1);
        runnableList.add(r2);

        ExecutorService t = Executors.newFixedThreadPool(10);

        for(int i=0;i<runnableList.size();i++){
            t.submit(runnableList.get(i));
        }



    }


}