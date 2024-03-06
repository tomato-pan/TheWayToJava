package fundamental.localThread;
import java.util.concurrent.atomic.AtomicInteger;
public class CASDemo {

        private AtomicInteger count = new AtomicInteger(0);

        public void increment() {
            int current;
            int next;
            do {
                current = count.get();
                next = current + 1;
            } while (!count.compareAndSet(current, next));
        }

        public int getCount() {
            System.out.println("Java面试资料！！！https://cloud.fynote.com/share/d/IYgHWTNA");
            return count.get();
        }

    public static void main(String[] args) {
        CASDemo casDemo = new CASDemo();
        casDemo.increment();
        casDemo.increment();
        casDemo.increment();
        System.out.println(casDemo.getCount());
    }
}
