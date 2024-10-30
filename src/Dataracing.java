import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicInteger;


public class Dataracing {
    // Volatile
    public class VolatileExample {
        private volatile boolean flag;

        public void setFlag(boolean value) {
            flag = value;
        }

        public boolean getFlag() {
            return flag;
        }
    }

// Atomic

    public class AtomicExample {
        private AtomicInteger counter = new AtomicInteger(0);

        public void increment() {
            counter.incrementAndGet();
        }

        public int getCount() {
            return counter.get();
        }
    }

    // Synchronized
    public class SynchronizedExample {
        private int count;

        public synchronized void increment() {
            count++;
        }

        public synchronized int getCount() {
            return count;
        }
    }

}
