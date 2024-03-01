package fundamental.localThread;

import sun.misc.Unsafe;

import java.util.concurrent.ConcurrentHashMap;

public class Example {
    private volatile int state = 0;
    private static final Unsafe unsafe = Unsafe.getUnsafe();

    private static final long stateOffSet;

    static {
        try {
            stateOffSet = unsafe.objectFieldOffset(Example.class.getDeclaredField("state"));
        }catch (Exception ex){
            throw new Error(ex);
        }
    }
    public void doSomething(){
        if (unsafe.compareAndSwapInt(this,stateOffSet,0,1)){
            System.out.println("good!");
        }
        System.out.println("false");
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public static void main(String[] args) {
        Example example = new Example();
        Thread thread1 = new Thread(()->{
            example.setState(1);
            example.setState(1);
            example.setState(1);
            example.setState(1);
        });
        Thread thread2 = new Thread(()->{
            example.setState(0);
            example.setState(0);
            example.setState(0);
            example.setState(0);
        });

        thread1.start();
        thread2.start();

    }
}
