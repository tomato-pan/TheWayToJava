package fundamental.localThread.future;

import java.util.concurrent.CompletableFuture;

public class futureDemo {

    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10086;
        }).whenComplete((result, error) -> {
            System.out.println("拨打"+result);
            error.printStackTrace();
        });


    }
}
