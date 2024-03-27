package Threads.ProducerConsumer;

import java.util.Arrays;
import java.util.List;

public class main {


    public static void main(String arg[]){

        List<String> questions = Arrays.asList("Hi","how are you","how about you");
        List<String> answers = Arrays.asList("Hi","i am fine","fine thanks");

        Chat c = new Chat();

        Runnable runnable1 = () -> {

            for(int i=0;i<questions.size();i++){
                try {
                    c.question(questions.get(i));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        Thread thread1 = new Thread(runnable1);


        Runnable runnable2 = () -> {

            for(int j=0;j<answers.size();j++){
                try {
                    c.answer(answers.get(j));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread2 = new Thread(runnable2);


        thread1.start();
        thread2.start();

    }


}
