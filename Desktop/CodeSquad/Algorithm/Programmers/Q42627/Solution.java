package Q42627;

import java.util.*;

class Solution {
    /*
	 	문제 : 디스크 컨트롤러
	 	url : https://programmers.co.kr/learn/courses/30/lessons/42627
	 	재풀이 : X
	*/

    public int solution(int[][] jobs) {
        Queue<Disk> queue = new PriorityQueue<>(Collections.reverseOrder((o1, o2) -> (o2.processTime - o1.processTime)));
        List<Disk> disks = new ArrayList<>();
        int totalTime = 0;
        for (int i = 0; i < jobs.length; i++)
            disks.add(new Disk(jobs[i][0], jobs[i][1]));

        /* 모든 요청에 대해 처음 요청한 시간을 기준으로 셋팅 */
        Collections.sort(disks, Collections.reverseOrder((o1, o2) -> (o2.requestTime - o1.requestTime)));
        int settingTime = disks.get(0).requestTime;
        for (Disk disk : disks) {
            disk.requestTime -= settingTime;
            totalTime += (disk.processTime + disk.requestTime);
        }

        int index = 0;
        int time = 0;
        int sum = 0;
        int job = 0;
        for (int i = 0; i <= totalTime; i++) {
            while(index < disks.size() && i == disks.get(index).requestTime)
                queue.add(disks.get(index++));

            /*
                결국은 이전꺼 처리시간 + 본인처리시간 - 본인요청시간 이 최소인것부터 작업해야하는데,
                이전꺼 처리시간은 모두가 동일하므로 뒤에 부분만 비교하면된다!  --> 우선순위큐
            */
            if(job == 0 && !queue.isEmpty()) {
                Disk disk = queue.poll();
                job = disk.processTime; // 본인처리시간
                sum += (disk.processTime - disk.requestTime + time); // 본인처시간 - 본인요청시간 + 이전꺼 처리시간
            }

            if(job > 0) job--;

            time++;

        }

        return (sum) / jobs.length;
    }

    public class Disk {
        public int requestTime;
        public int processTime;

        public Disk(int requestTime, int processTime) {
            this.requestTime = requestTime;
            this.processTime = processTime;
        }

        @Override
        public String toString() {
            return "Disk{" +
                    "requestTime=" + requestTime +
                    ", processTime=" + processTime +
                    '}';
        }
    }

    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        System.out.println(new Solution().solution(jobs));

        int[][] jobs2 = {{1000, 2}, {0, 2}, {1000, 2}};
        System.out.println(new Solution().solution(jobs2));
    }

}