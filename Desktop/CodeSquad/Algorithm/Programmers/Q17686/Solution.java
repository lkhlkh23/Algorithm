package Q17686;

import java.util.Arrays;

class Solution {
    /*
	 	문제 : 파일명 정렬
	 	url : https://programmers.co.kr/learn/courses/30/lessons/17686
	 	재풀이 : X
	*/

    public static String[] solution(String[] files) {
        String[] answer = new String[files.length];
        File[] arr = new File[answer.length];
        for (int i = 0; i < files.length; i++)
            arr[i] = (splitFileName(files[i], i));

        // head 문자열 오름차순 정렬, number 숫자 오름차순 정렬, 파일순서 숫자 오름차순 정렬 //
        Arrays.sort(arr, (o1, o2) -> o1.head.compareTo(o2.head) != 0 ? o1.head.compareTo(o2.head)
                : (o1.number - o2.number != 0 ? o1.number - o2.number
                : (o1.index - o2.index > 0 ? 1 : -1)));

        for (int i = 0; i < arr.length; i++)
            answer[i] = files[arr[i].index];

        return answer;
    }

    public static File splitFileName(String str, int index) {
        int idx = 0;

        char[] arr = str.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            // tail은 정렬과 무관하기 때문에 break //
            if ((idx > 0 && !(arr[i] >= '0' && arr[i] <= '9')) || (idx == 6))
                break;

            if (arr[i] >= '0' && arr[i] <= '9' && idx < 6) idx++;
            else sb.append(arr[i]);
        }
        return new Solution().new File(index, sb.toString(),
                Integer.parseInt(str.substring(sb.toString().length(), sb.toString().length() + idx)));
    }

    public class File {
        public int index;
        public String head; // 숫자가 아닌 문자열로 구성
        public int number; // 숫자 구성 5자리까지의 모든 수

        public File(int index, String head, int number) {
            this.index = index;
            this.head = head;
            this.number = number;
        }
    }

}
