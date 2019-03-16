package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Test_1 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Counter counter = new Test_1().new Counter();
        IntStream.range(0, 10000)
                .forEach(i -> executor.submit(counter::plus));

        executor.shutdown();
        System.out.println(counter.getCount());  // 973

        ExecutorService executor2 = Executors.newFixedThreadPool(10);
        AtomicCounter atomicCounter = new Test_1().new AtomicCounter();
        IntStream.range(0, 10000)
                .forEach(i -> executor2.submit(atomicCounter::plus));

        executor2.shutdown();

        System.out.println(atomicCounter.getCount());  // 973

    }

    public class Counter {

        private int count = 0;

        public Counter() {

        }

        public void plus() {
            synchronized (this) {
                count++;
            }
        }

        public int getCount() {
            return count;
        }
    }

    public class AtomicCounter {

        private AtomicInteger count = new AtomicInteger(0);

        public AtomicCounter() {

        }

        public void plus() {
            count.addAndGet(1);
        }

        public int getCount() {
            return count.get();
        }
    }
}
