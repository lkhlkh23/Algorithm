package Q17687;

import java.util.*;

class Solution {
    /*
	 	문제 : n진법
	 	url : https://programmers.co.kr/learn/courses/30/lessons/17676
	 	재풀이 : X
	*/

    public static String[] solution(String[] files) {
        String[] answer = new String[files.length];
        List<File> list = new ArrayList<>();
        for(int i = 0; i < files.length; i++) {
            list.add(splitFileName(files[i], i));
        }

        Collections.sort(list, (o1, o2) -> o1.head.compareTo(o2.head) > 0 ? 1 : o1.head.compareTo(o2.head) < 0 ?
                -1 : o1.number - o2.number > 0 ? 1 : o1.number - o2.number < 0 ? -1 : o1.index - o2.index > 0 ? 1 : -1);

        System.out.println(list.toString());
        int index = 0;
        for(File file : list) {
            answer[index++] = files[file.index];
        }
        return answer;
    }

    public static File splitFileName(String str, int index) {
        //  img12.png //
        int index1 = 0;
        int index2 = 0;

        char[] arr = str.toLowerCase().toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if((index2 > 0 && !(arr[i] >= '0' && arr[i] <= '9')) || (index2 == 6)) {
                break;
            } else if(arr[i] >= 'a' && arr[i] <= 'z') {
                index1++;
            } else if(arr[i] >= '0' && arr[i] <= '9' && index < 6) {
                index2++;
            }
        }
        return new Solution().new File(index, str.substring(0, index1), Integer.parseInt(str.substring(index1, index1 + index2)));
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

        @Override
        public String toString() {
            return "File [index=" + index + ", head=" + head + ", number=" + number +  " + ]";
        }
    }

    public static void main(String[] args) {
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        solution(files);
    }
}
