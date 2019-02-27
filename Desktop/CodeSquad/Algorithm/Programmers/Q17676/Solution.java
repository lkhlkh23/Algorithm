package Q17676;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
	 	문제 : 후보키
	 	url : https://programmers.co.kr/learn/courses/30/lessons/42890
	 	재풀이 : X
	*/

    public static int solution(String[] lines) {
        int answer = 0;
        int index = 0;
        List<Traffic> traffic = new ArrayList<>();
        for (String line : lines) {
            int time = getTime(splitTime(line.split(" ")[1]));
            traffic.add(new Solution().new Traffic(index++, getStartTime(time, line.split(" ")[2]), time));
        }

        System.out.println(traffic.toString());

        int max = 0;
        for (int i = 0; i < traffic.size(); i++) {
            answer = 0;
            for (int j = 0; j < traffic.size(); j++) {
                if(traffic.get(j).isInclude(traffic.get(i).start)) {
                    answer++;
                }
            }
            max = Math.max(max, answer);
        }

        return max;
    }

    public static int getTime(int[] arr) {
        return arr[0] * 60 * 60 * 1000 + arr[1] * 60 * 1000 + arr[2] * 1000 + arr[3];
    }

    public static int[] splitTime(String time) {
        int[] times = new int[4];
        String[] splited = time.split(":");

        times[0] = Integer.parseInt(splited[0]);
        times[1] = Integer.parseInt(splited[1]);
        times[2] = Integer.parseInt(splited[2].split("\\.")[0]);
        times[3] = Integer.parseInt(splited[2].split("\\.")[1]);

        return times;
    }

    public static int getStartTime(int complete, String process) {
        return complete - Integer.parseInt(process.substring(process.indexOf(".") + 1, process.indexOf("s"))) * 1000 + 1;
    }

    public class Traffic {
        public int index;
        public int start;
        public int end;

        public Traffic(int index, int start, int end) {
            this.index = index;
            this.start = start;
            this.end = end;
        }

        public boolean isInclude(int begin) {
            if(start < begin && begin < end) return true;
            if(begin < start && start < begin + 1000) return true;
            if(start < begin && begin + 1000 < end) return true;
            if(begin < start && end < begin + 1000) return true;

            return false;
        }

        @Override
        public String toString() {
            return "Traffic{" +
                    "index=" + index +
                    ", start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    public static void main(String[] args) {
        String[] lines = {
                "2016-09-15 20:59:57.421 0.351s",
                "2016-09-15 20:59:58.233 1.181s",
                "2016-09-15 20:59:58.299 0.8s",
                "2016-09-15 20:59:58.688 1.041s",
                "2016-09-15 20:59:59.591 1.412s",
                "2016-09-15 21:00:00.464 1.466s",
                "2016-09-15 21:00:00.741 1.581s",
                "2016-09-15 21:00:00.748 2.31s",
                "2016-09-15 21:00:00.966 0.381s",
                "2016-09-15 21:00:02.066 2.62s"
        };
        System.out.println(solution(lines));
    }
}
