package fundamental.volatile1;

public class demo11 {
    public static void main(String[] args) {
        final VT vt = new VT();
        Thread thread1 = new Thread(vt);
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException ig){

                }
                vt.sign = true;
                System.out.println("通知进行下一步");
            }
        });
        thread1.start();
        thread2.start();
    }
}
