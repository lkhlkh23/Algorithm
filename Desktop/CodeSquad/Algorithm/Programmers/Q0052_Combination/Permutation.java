package Q0052_Combination;

public class Permutation {
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void permutation(int[] arr, int depth) {
        if(depth == arr.length - 1) {
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        } else {
            for(int i = depth; i < arr.length; i++) {
                swap(arr, depth, i);
                permutation(arr, depth + 1);
                swap(arr, depth, i);
                // 하나의 배열을 가지고 계속 사용하기 때문에 원래 모습으로 돌리는 작업 수행
                // 원본 내용을 가지고 있는 임시테이블이 있으면 swap할 필요없음!
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        permutation(arr, 0);
    }
}
/* trie 글자수만큼 반복 --> 최대 노드는 26개 */