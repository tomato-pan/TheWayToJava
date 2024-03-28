package fundamental.synchronizedDemo;

public class SynchronizedDemo1 {
    private static volatile int count=0;
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(()->{
                for (int j = 0; j < 10000; j++) {
                    add();
                }
            });
            thread.start();
        }
        Thread.sleep(1000);
        System.out.println(count);

    }
    private static void add() {
//        count++;
//        volatile不能保证原子性
        synchronized (SynchronizedDemo1.class){
            count++;
        }
    }

}
