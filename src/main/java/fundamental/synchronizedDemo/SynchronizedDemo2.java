package fundamental.synchronizedDemo;

public class SynchronizedDemo2 {
    public static boolean sign = false;
    public static void main(String[] args) throws InterruptedException {
        //可见性
        Thread thread1 = new Thread(()->{
            int i = 0;
            while (!sign){
                i++;
                add(i);
            }
        });
        Thread thread2 = new Thread(()->{
           try {
               Thread.sleep(3000);

           }catch (InterruptedException ignored){}
           sign=true;
            System.out.println("vt.sign = true while (!sign)");
        });
        thread1.start();
        thread2.start();
    }

    private static synchronized int add(int i) {
        return i+1;
    }


}
