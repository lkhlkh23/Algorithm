package Grammar;

public class Deque_Grammar {

	public static void main(String[] args) {
		/* 2018.08.19 */
		/*
			인터페이스이기 때문에 구현된 클래스를 이용 
			 1) Implementing Class
			  - ArrayDeque : Deque 인터페이스를 구현한 Resizable-Array. 
			                 external synchronization이 되어있지 않아서 thread-safe하지 않음
			  - ConcurrentLinkedDeque : Linked node로 이루어진 Concurrent deque
		 	   * Concurrent - : multiple thread 환경에서 Element(node)를 삽입, 제거, 접근을 병렬적으로 
		 	                    처리할 수 있도록 하는 컬렉션들
			  - LinkedBlockingDeque : Linkded node로 이루어진 Deque. Integer.MAX_VALUE의 크기까지만 생성 가능
              - LinkedList : List와 Deque를 구현한 Doubly-Linked List

		    Deque 관련 Method
			 1) 추가하기 
              - add(E e) 
			  - addFirst(E e) 
			  - addLast(E e) 
			  - put(E e)
			  - putFirst(E e)
			  - putLast(E e)
			  - offer(E e)
			  - offerFirst(E e)
			  - offerLast(E e)
			  - push : Deque의 앞 부분에 Element를 삽입.
			 2) 삭제하기 
			  - poll()
			  - pollFirst()
			  - pollLast()
			  - pop()
			 3) 값을 제거하지 않고 확인만 하기
			  - peek
			  - peekFirst
			  - peekLast
		 */

	}

}
