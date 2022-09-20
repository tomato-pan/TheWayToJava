package fundamental.designMode;

public class Singleton {
    private static volatile Singleton instance;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (null != instance) {
            return instance;
        }
        synchronized (Singleton.class) {
            if (null == instance) {
                instance = new Singleton();
            }
        }
        return instance;
    }
    public enum Singleton1 {

        INSTANCE;
        public void test(){
            System.out.println("hi~");
        }

    }
}
