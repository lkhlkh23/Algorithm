package Q0038_Not;

import java.util.*;
class Solution {
    /* 체육복
     *    url : https://programmers.co.kr/learn/courses/30/lessons/42862?language=java */
    public static int solution(int n, int[] lost, int[] reserve) {
        /* 테스트 시, 조건하나가 맞지않아서 못 풀고 있음!! */
        List<String> lostList = new ArrayList<>();
        for(int num : lost)
            lostList.add(num + "");

        List<String> reserveList = new ArrayList<>();
        for(int num : reserve)
            reserveList.add(num + "");

        int answer = 0;

        List<String> allList = new ArrayList<>();
        for(int i = 0; i < n; i++)
            allList.add(i + 1 + "");

        /* 당연히 체육복을 2벌 가져온 학생의 체육복이 도난을 당했다면, 여벌의 체육복을 빌려줄 수 없습니다. */
        for(int i = 0; i < lostList.size(); i++) {
            String num = lostList.get(i);
            if(reserveList.contains(num)) {
                reserveList.remove(num);
                lostList.remove(num);
            }
        }

        for(int i = 0; i < allList.size(); i++) {
            String num = allList.get(i);
            if(lostList.contains(num)) {
                /* 학생들의 번호는 체격 순으로 매겨져 있기 때문에 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려주려고 합니다. */
                if(reserveList.contains((Integer.parseInt(num) - 1) + "")) {
                    lostList.remove(num);
                    reserveList.remove((Integer.parseInt(num) - 1) + "");
                    answer++;
                } else if (reserveList.contains((Integer.parseInt(num) + 1) +"")) {
                    lostList.remove(num);
                    reserveList.remove((Integer.parseInt(num) + 1) + "");
                    answer++;
                }
            } else {
                answer++;
            }
        }
        return answer;
    }
}