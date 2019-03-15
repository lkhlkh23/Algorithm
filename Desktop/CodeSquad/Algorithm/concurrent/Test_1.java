package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Test_1 {

    private static int count = 1;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 1000)
                .forEach(i -> executor.submit(new Runnable() {
                    @Override
                    public void run() {
                        count += 1;
                    }
                })
        );

        System.out.println(count);  // 973

    }
}
