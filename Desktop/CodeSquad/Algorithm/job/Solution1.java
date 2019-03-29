package job;

import java.util.*;

public class Solution1 {

    public int solution(int n) {
        int answer = 0;
        List<Integer> primes = obtainPrime();
        for(int prime : primes)
            answer += findTwoSum(primes, n - prime, prime);

        return answer;
    }

    // 소수리스트, 2개의 소수합, 1개의 소수합
    public int findTwoSum(List<Integer> primes, int num, int standard) {
        int index = primes.indexOf(new Integer(standard));
        int cnt = 0;
        for(int i = 0; i < index; i++) // 3, 13, 17 ||||| 5, 11, 17
            for(int j = i; j < index; j++) // 기준 소수보다 작은 수들만으로 합을 이루기 위한 방법 --> 중복적인 수를 만들지 않기 위해서!, 중복수가 존재한다면 set 활용해야함!
                if(i != j && primes.get(i) + primes.get(j) == num)
                    cnt++;

        return cnt;
    }

    // 소수를 가지고 있는 리스트를 반환하는 메소드
    public List<Integer> obtainPrime() {
        boolean[] primes = new boolean[1000]; // false : 소수, true : 소수X
        List<Integer> primeNumber = new ArrayList<>(); // 순차적으로 삽입을 하기 떄문에 ArrayList가 적합. 만약에 중간삽입이 많은 경우였다면 LinkedList
        primes[0] = primes[1] = true; // 0, 1은 소수가 아니기 때문에 true
        for(int i = 2; i < primes.length; i++) { // 아리스토네스의 체 방식을 활용!
            if(!primes[i]) {
                primeNumber.add(i);
                for(int j = 2; j * i < primes.length; j++) {
                    primes[j * i] = true;
                }
            }
        }

        return primeNumber;
    }


    public static void main(String[] args) {
        //System.out.println(findTwoSum(obtainPrime(), 4, 29)); // 0
        //System.out.println(findTwoSum(obtainPrime(), 10, 23)); // 1
        //System.out.println(findTwoSum(obtainPrime(), 16, 17)); // 2


    }
}