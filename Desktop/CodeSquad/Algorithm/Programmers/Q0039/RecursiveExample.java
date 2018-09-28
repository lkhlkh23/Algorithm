package Q0039;

import java.util.ArrayList;
import java.util.List;

public class RecursiveExample {
    public static int recursive(int index, int[] arr) {
        /* 1. 종료조건 명시! */
         if(arr.length == 0) {
           return 0;
         } else if(index == arr.length - 1) {
             return arr[index];
         } else {
             /* 2. 작은 값부터 고려! --> 값이 줄어드는 방향으로 코딩! */
             /* 3. 점화식으로 정의! */
             return arr[index] + recursive(index + 1, arr);
         }
    }

    public static int recursiveList(List<Integer> list) {
        if(list.size() == 0) return 0;
        else return list.remove(0) + recursiveList(list);
    }

    public static int factorial(int n) {
        if(n == 0 || n == 1) return 1;
        else return n * factorial(n - 1);
    }

    public static int fibonaci(int n) {
        /* 토끼 한쌍이 매년 토끼 한쌍을 낳는다. 토끼는 불로불사! */
        /* 복잡도 2^n -->  두개씩 늘어나서! */
        if(n < 2) return n;
        else return fibonaci(n - 2) + fibonaci(n - 1);
    }

    public static int fibonaciByMemorization(int n, int[] arr) {
        /* Memorization */
        arr[0] = 0; arr[1] = 1;
        if(arr[n] > -1d) {
            return arr[n];
        } else {
            return fibonaciByMemorization(n - 1, arr) + fibonaciByMemorization(n - 2, arr);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonaci(3));
        // 1, 1, 2, 3, 5, 8, 13 ...
        System.out.println(fibonaci(5));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        System.out.println(recursiveList(list));
        int[] arr = new int[5 + 1];

        System.out.println("Memorization : " + fibonaciByMemorization(5,arr));
    }
}
