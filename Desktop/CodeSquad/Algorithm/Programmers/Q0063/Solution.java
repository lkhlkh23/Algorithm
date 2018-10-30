package Q0063;

class Solution {
    /* 카펫
     *    url : https://programmers.co.kr/learn/courses/30/lessons/42842?language=java */
    public static int[] solution(int brown, int red) {
        int[] answer = new int[2];
        for(int i = (brown + red) / 3; i > 0; i--) {
            if((brown + red) % i == 0) {
                int a = i;
                int b = (brown + red) / a;
                if(a >= b) {
                    for(int x = a - 2; x > 0; x-=2) {
                        for(int y = b - 2; y > 0; y-=2) {
                            if(x * y == red) {
                                answer[0] = a;
                                answer[1] = b;
                                return answer;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        //int[] arr = solution(24,24);
        //System.out.println(arr[0] + " ," + arr[1]);

        int[] arr2 = solution(24,24);
        System.out.println(arr2[0] + " ," + arr2[1]);
    }
}