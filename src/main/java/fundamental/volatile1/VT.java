package fundamental.volatile1;

public class VT implements Runnable{
    public volatile boolean sign = false;
    //其他线程可见性
    @Override
    public void run() {
        while (!sign){}
        System.out.println("1123");
    }
}
