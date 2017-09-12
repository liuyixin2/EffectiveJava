package multithreading;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017\9\10 0010.
 */
public class Structure1 implements Runnable{

    public void run() {
        try {
            System.out.println("Hello from a thread!");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getContextClassLoader());
            System.out.println(Thread.currentThread().getThreadGroup().toString());
            System.out.println(Thread.currentThread().getId());
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Structure1());
        thread.start();
        System.out.println("In main method.");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(Thread.currentThread().getThreadGroup().toString());
        System.out.println(Thread.currentThread().getId());
    }
}
