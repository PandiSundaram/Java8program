package Threads.Deadlock;
    class Threenumbers implements Runnable{

        public int PRINT_NUMBERS_UPTO=10;
        static int  number=1;
        int remainder;
        static Object lock=new Object();

        Threenumbers(int remainder)
        {
            this.remainder=remainder;
        }

        @Override
        public void run() {
            while (number < PRINT_NUMBERS_UPTO-1) {
                synchronized (lock) {

                    System.out.println("comingnumbere "+ number);
                    System.out.println("comingthread "+ Thread.currentThread().getName() + " " + number);

                    if (number % 2 != remainder) { // wait for numbers other than remainder
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " " + number);
                    number++;
                    lock.notifyAll();
                }
            }
        }
    }


    class PrintThreadsSequentiallyMain {

        public static void main(String[] args) {




            Threenumbers runnable1=new Threenumbers(1);
           // Threenumbers runnable2=new Threenumbers(2);
            Threenumbers runnable2=new Threenumbers(0);


            Thread t1=new Thread(runnable1,"T1");
         //   Thread t2=new Thread(runnable2,"T2");
            Thread t2=new Thread(runnable2,"T2");

            t1.start();
           // t2.start();
            t2.start();
        }
    }
