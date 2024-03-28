package fundamental.synchronizedDemo;

import java.util.concurrent.locks.ReentrantLock;

public class ReentryTest extends ATest{
    private static volatile int num=0;
    public static void main(String[] args) {
        Thread thread  = new Thread(ReentryTest::extracted);
        Thread thread2  = new Thread(ReentryTest::extracted);
        thread.start();
        thread2.start();
    }

    private static void extracted() {
        ReentrantLock lock = new ReentrantLock(false);
        lock.lock();
        try {
            for (int i = 0; i < 100; i++) {
                num++;
                System.out.println("threadId:"+Thread.currentThread()+"nums:"+num);
            }
        }finally {
            lock.unlock();
        }
    }
}
