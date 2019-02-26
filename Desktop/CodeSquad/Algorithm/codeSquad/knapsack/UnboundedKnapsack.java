package codeSquad.knapsack;

import java.util.ArrayList;
import java.util.List;

public class UnboundedKnapsack {

    /**
     *
     * @param m          : 챙길 수 있는 최대 짐의 무게
     * @param load       : 짐의 정보(짐의 무게, 짐의 가치)
     * @param index      : 몇 번째 짐인지 표시
     * @param optimizes  : 최적화된 값 (보석의 index, 각 무게별 최적의 값)
     * @param result     : 가져야하는 짐의 인덱스 번호를 저장하는 배열
     */
    public static void knapsack(int m, int[][] load, int index, int[][] optimizes, int[][] result) {
        if(index > load.length) return;
        for (int i = 1; i < optimizes[index].length; i++) {
            optimizes[index][i] = optimizes[index - 1][i];
            result[index][i] = result[index - 1][i];
            if(i >= load[index - 1][0]) {
                int value = optimizes[index - 1][i - load[index - 1][0]] + load[index - 1][1];
                if(value > optimizes[index][i]) {
                    optimizes[index][i] = value;
                    result[index][i] = index;
                }
            }
        }
        knapsack(m, load, index + 1, optimizes, result);
    }

    public static List<Integer> getBagIndex(int m, int[][] result) {
        List<Integer> list = new ArrayList<>();
        int index = result[result.length - 1][result[0].length - 1];
        while (m > 0) {
            list.add(index);
            m -= index;
            index = m;
        }

        return list;
    }

    public static void printArr(int[][] optimizes) {
        for (int i = 0; i < optimizes[0].length; i++) {
            System.out.print(String.format("%2d\t", i));
        }
        System.out.println("\n-----------------------------------------------------------------------");

        for (int[] optimize : optimizes) {
            for (int num : optimize) {
                System.out.print(String.format("%2d\t", num));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m = 5;
        int[][] load = {
                {1, 5}, {2, 7}, {3, 8}, {4, 9}
        };

        int[][] optimizes = new int[load.length + 1][m + 1];
        int[][] result = new int[load.length + 1][m + 1];

        knapsack(m, load, 1, optimizes, result);

        printArr(optimizes);

        System.out.println();

        printArr(result);
    }
}
