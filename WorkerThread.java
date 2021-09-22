package TH3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable {
    String message;
    public WorkerThread(String s){
        this.message = s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + "(strat) message = " + message);
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "(end).");
    }
}
