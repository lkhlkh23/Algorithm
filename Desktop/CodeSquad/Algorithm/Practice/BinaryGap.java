package Practice;

public class BinaryGap {
    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int prevIndex = 0;
        int nextIndex = 0;
        int max = 0;
        while((nextIndex = binary.indexOf("1", prevIndex + 1)) > 0) {
            max = Math.max(max, nextIndex - prevIndex - 1);
            prevIndex = nextIndex;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}
