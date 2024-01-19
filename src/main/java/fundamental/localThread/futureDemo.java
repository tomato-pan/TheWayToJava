package fundamental.localThread;

import java.util.concurrent.CompletableFuture;

public class futureDemo {

    public static void main(String[] args) {
        SmallTool.printTimeAndThread("小白进入餐厅");
        CompletableFuture.supplyAsync(()->{
            System.out.println();
            return null;
        });
    }
}
