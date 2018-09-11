package Grammar;

import java.util.*;

public class Queue_Grammar {

	public static void main(String[] args) {
		/* 2018.08.16 */
		/*
		 1. 개요
		  선입선출'(First-In, First-Out)의 대기열 규칙 
          하지만 JAVA에서 제공하는 'PriorityQueue'는 우선순위를 결정하여 들어온 순서와 상관없이 그 우선순위가 
          높은 엘리먼트가 나가게 된다. 
		*/
		// 1. 우선순위 큐 생성 
		Queue<Prisoner> pq = new PriorityQueue<>();
		Queue_Grammar qgm = new Queue_Grammar();
		
		// 2. 우선순위 큐 초기화 
		pq.offer(qgm.new Prisoner("LEE_6", 6)); // 중첩클래스 
		pq.offer(qgm.new Prisoner("CHOI_4", 4)); // 중첩클래스 
		pq.offer(qgm.new Prisoner("KANG_5", 5)); // 중첩클래스
		pq.offer(qgm.new Prisoner("KIM_3", 3)); // 중첩클래스 
		
		// 3. 우선순위 큐 출력 (오름차순) 
		int size = pq.size();
		for(int i = 0; i < size; i++) {
			System.out.print(pq.remove().name + "\t");
		}
		System.out.println("");
		System.out.println("");
		
		// 4. 우선순위 큐 출력 (내림차순)
		pq.offer(qgm.new Prisoner("LEE_6", 6)); // 중첩클래스 
		pq.offer(qgm.new Prisoner("CHOI_4", 4)); // 중첩클래스 
		pq.offer(qgm.new Prisoner("KANG_5", 5)); // 중첩클래스
		pq.offer(qgm.new Prisoner("KIM_3", 3)); // 중첩클래스 
		
		PriorityQueue<Prisoner> pqr = new PriorityQueue<>(pq.size(), Collections.reverseOrder());
		pqr.addAll(pq);
		
		while(!pqr.isEmpty()) {
			System.out.print(pqr.remove().name + "\t");
		}

	}
	
	public class Prisoner implements Comparable<Prisoner>{
		String name;
		int year;

		Prisoner(String name, int year) {
			this.name = name;
			this.year = year;
		}
		
		@Override
		public int compareTo(Prisoner p) {
			if(this.year > p.year) {
				return 1;
			} else if(this.year < p.year) {
				return -1;
			}
			return 0;
		}
		
		
	}

}
