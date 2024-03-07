package fundamental.designMode;

public class Singleton {
    private static volatile Singleton instance;

    public Singleton() {
    }

    public synchronized static Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }
//    public Singleton getInstance(){
//        if (instance==null){
//            synchronized (Singleton.class){
//                if (instance==null){
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    public enum Singleton1 {

        INSTANCE;

        public void test() {
            System.out.println("hi~");
        }

    }

    public static void main(String[] args) {
        Singleton1.INSTANCE.test();
        Singleton s = new Singleton();
        Singleton s1 = new Singleton();
        System.out.println(s==s1);
    }
}
