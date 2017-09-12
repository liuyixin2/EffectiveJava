package multithreading;

/**
 * Created by Administrator on 2017\9\10 0010.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new MyThread());
            Thread thread2 = new Thread(new MyThread());
            thread.start();
            thread2.start();
            thread.join();//底层源码显示的就是判断线程给定的时间是否还活着，如果活着，如果活着调用wait(毫秒)，直到运行晚。
            thread2.join();
            /**
             * yield()的作用是放弃当前的CPU资源，
             * 将它让给其它的任务去占用CPU执行时间。
             * 但放弃的时间不确定，有可能刚刚放弃，马上又获得CPU时间片。
             */
            //thread.yield();
            System.out.println("子线程MyThread执行完，我再执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}