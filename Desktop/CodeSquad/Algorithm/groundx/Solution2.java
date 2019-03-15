package groundx;

public class Solution2 {
    public static long solution(int w, int h) {
        // int * int 사칙연산의 결과는 int 이기 때문에 Long으로 변환 //
        long height = Long.valueOf(h);
        long width = Long.valueOf(w);

        long cnt = (long)Math.ceil(((double)height / width));
        for(double i = 2; i <= width; i++) {
            long sub = ((long)Math.ceil((double)(height * i) / width) - (long)Math.floor((double)(height * (i - 1)) / width));
            cnt += sub;
        }
        return width * height - cnt;
    }

    public static void main(String[] args) {
        long a = ((long)(Integer.MAX_VALUE)) * (Integer.MAX_VALUE - 1);
        System.out.println(a);

    }
}
