package multithreading;

/**
 * Created by Administrator on 2017\9\10 0010.
 */
public class MyThreadGroupTest {
    public static void main(String args[]) throws Exception {
        ThreadGroup tg = new ThreadGroup("My Group");
        MyThreadGroup thrd = new MyThreadGroup(tg, "MyThread #1");
        MyThreadGroup thrd2 = new MyThreadGroup(tg, "MyThread #2");
        MyThreadGroup thrd3 = new MyThreadGroup(tg, "MyThread #3");
        thrd.start();
        thrd2.start();
        thrd3.start();
        Thread.sleep(1000);
        System.out.println(tg.activeCount() + " threads in thread group.");
        Thread thrds[] = new Thread[tg.activeCount()];
        tg.enumerate(thrds);
        for (Thread t : thrds)
            System.out.println(t.getName());
        thrd2.myStop();
        Thread.sleep(1000);
        System.out.println(tg.activeCount() + " threads in tg.");
        tg.interrupt();
    }
 }
