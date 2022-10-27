package fundamental.localThread;

public class InterruptExample {
    private static class MyThead1 extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run!");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new MyThead1();
        thread.start();
        thread.interrupt();
        System.out.println("MAIN!");
        //线程中断方式：1、执行完毕 2、发生异常提前结束
        // run方法中无限循环且没有执行sleep等会抛出异常InterruptedException的操作，调用interrupt方法无法中断线程

    }
}
