package Q49191;

class Solution {
    /*
	 	문제 : 타일 장식물
	 	url : https://programmers.co.kr/learn/courses/30/lessons/43104
	 	재풀이 : X
	*/

    public long solution(int N) {
        long[] fibonacci = new long[N + 1];
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        return round(N, fibonacci);
    }

    public long round(int N, long[] fibonacci) {
        return fibonacci[N] * 4 + fibonacci[N - 1] * 2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(5));
    }

}