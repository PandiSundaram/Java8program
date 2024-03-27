package Threads;

public class main {


     public static void main(String arg[]){


//         ProducerConsumer producerConsumer = new ProducerConsumer();
//         Thread t1 = new Thread(() -> {
//             try {
//                 producerConsumer.produce();
//             } catch (InterruptedException e) {
//                 throw new RuntimeException(e);
//             }
//         });
//
//
//         Thread t2 = new Thread(() -> {
//             try {
//                 producerConsumer.consume();
//             } catch (InterruptedException e) {
//                 throw new RuntimeException(e);
//             }
//         });

         Listresource li = new Listresource();
        // Listresource li1 = new Listresource();
         Producer p = new Producer(li);
         Consumer c = new Consumer(li);

         p.start();
         c.start();

//
//         t1.start();
//         t2.start();
     }



}
