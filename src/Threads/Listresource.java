package Threads;

import java.util.LinkedList;

public class Listresource {


    LinkedList<Integer> li = new LinkedList<>();
    Boolean available = false;


    public synchronized void put(Integer item) throws InterruptedException {

            if (!li.isEmpty())
                wait();

            System.out.println("produce"+ item);
            li.add(item);
            //item++;
            notifyAll();


            Thread.sleep(1000);


    }


    public synchronized Integer get() throws InterruptedException {



            if(li.isEmpty())
                wait();

            Integer produce =  li.removeFirst();
            System.out.println("consume"+ produce);
            notifyAll();
            Thread.sleep(1000);

            return produce;

    }

}
