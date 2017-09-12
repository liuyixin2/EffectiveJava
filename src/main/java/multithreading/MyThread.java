package multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * wait()是让出CPU的占用，主动释放对象锁，同时本线程休眠，直到有其它线程调用对象的notify()唤醒该线程，才能继续获取对象锁，并继续执行。
 * wait(long x)是让出CPU的占用，同时等待x的时间，当到达到x的时间的时候，此时就会重新去竞争CPU资源。
 * notify()只能唤起等待队列中的第一个线程。
 * notifyAll()只是让处于wait的所有线程重新拥有锁的争夺权，但是只会有一个获得锁并执行。
 * Created by Administrator on 2017\9\10 0010.
 */
public class MyThread implements Runnable {
    public void run() {
        try {
            //int secondValue = (int) (Math.random() * 1000);
            //System.out.println(secondValue);
            TimeUnit.MILLISECONDS.sleep(10000);
            System.out.println(Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
