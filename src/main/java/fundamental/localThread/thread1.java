package fundamental.localThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class thread1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new Thread() {
            @Override
            public void run() {
                System.out.println("111!");
            }
        }.start();

        new Thread(() -> {
            System.out.println("222!");
        }).start();

        FutureTask<String> futureTask = new FutureTask<String>(()->{
            return "333!";
        });
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
