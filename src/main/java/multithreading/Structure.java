package multithreading;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017\9\10 0010.
 */
public class Structure extends Thread{
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Hello from a thread!");
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Structure structure = new Structure();
        structure.start();
        System.out.println("In main thread.");
        System.out.println(Thread.currentThread().getContextClassLoader());
    }
}
