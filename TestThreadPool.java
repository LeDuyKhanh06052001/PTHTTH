package TH3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(5);
        for (int i=0 ; i<5 ; i++){
            Runnable worker = new WorkerThread(" " + i);
            ex.execute(worker);
        }
        ex.shutdown();
        while(!ex.isTerminated()){}
        System.out.println("Finised");
    }
}
