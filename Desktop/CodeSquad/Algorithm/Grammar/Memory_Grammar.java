package Grammar;

public class Memory_Grammar {
	public static void main(String[] args) {
		/*
		 프로그램은 실행되면서 저장할 데이터가 있으면 메모리의 일정 공간을 할당받아서 사용하게 된다. 
		 그런데 이 데이터가 더 이상 사용할 필요가 없는것이면, 사용항 메모리를 반납해야주어야한다. 
 		 JVM의 Garbage Collector이 사용하지 않는 메모리를 알아서 회수해주는것이다.(GC(Garbage Collection))

		JVM의 메모리 영역은 크게 Heap Area과 Non-Heap Area으로 나눌수 있다.

		1. Heap Area
 		힙 영역(Heap Area)은 동적으로 할당하여 사용할 수 있는 메모리 영역으로서, 주로 실행중에 생성되는 객체들이 저장된다. 
 		이 힙 영역(Heap Area)이 GC(Garbage Collection)의 대상이 되는 메모리 영역이다. 
 		즉, Garbage Collector에 의해서 이 힙영역중에 사용하지 않는 메모리가 회수되는것이다. 
 		힙 영역(Heap Area)을 세분화하면 일반적으로 세 영역으로 나눌 수 있다.
		 1.1. Young(New) Object Space 
		  : 새로 생성한 객체를 저장하능 영역이다. 이 부분은 다시 세 부분으로 나누어진다.
 			새로 생성한 모든 객체들이 가는 Eden 영역과 Old Object Space가기전에 거치는 SS1(Survivor Space 1)
 			, SS2(Survivor Space 2) 영역이 있다. 
 			이 Young 영역의 GC를 Minor GC(Scavenge GC)라 부른다. 객체가 생성되면 Eden 영역에 있다가, 
 			Minor GC가 발생하면 살아있는것들은 S1으로 보내고, 나머지는 제거해버린다. 
 		    그리고 다음번 Minor GC가 발생하면 S1 영역의 객체중 살아있는것은 SS2로 복사(실제적으로 레퍼런스 주소만 변경)한후
 		    Eden, S1 영역을 초기화(Clear) 해버린다. 이렇게 Minor GC를 실행하다가 오래된 객체를 
 		    Old Object Space로 옮기는것이다.
		 1.2. Old Object Space 
		  : Young(New) 영역에서 살아남은 객체가 이동되어 저장되는 영역이다.
 			이 Old 영영의 GC를 Full GC라 부른다. 일반적으로 사용되는 Full GC 알고리즘은 사용하는 객체들의 
 			레퍼런스(reference)를 찾아 연결되지 않는 객체를 표시(Mark)한 다음, 작업이 끝난후 표시한 객체를 모두 
 			삭제를 하는 방법이다. Full GC는 속도가 매우 느리고, 실행되는 동안에 순간적으로 프로그램이 멈춰버리기 때문에 
 			어플리케이션(Application)의 성능에 큰 영향을 준다. 그래서 여러가지 GC 알고리즘을 지원한다.
	     1.3. Permanet Space 
	      : 클래스와 메소드등의 메타정보를 저장하는 영역이다. 
	        (논리적인 Heap 영역으로서, -Xms, -Xmx에서 말하는 Heap 영역에서는 제외된다.)

		2. Non-Heap Area
 		Non-Heap 영역은 Heap 이외의 영역을 말한다.
		 2.1. Method Area : 메소드와 클래스 변수를 저장하기 위한 영역이다.
		 2.2. Stack Area : 메소드 호출 시 메소드의 매개변수, 지역변수, 임시변수등을 저장하기 위한 스택 구조의 영역이다.
		 2.3. 기타 : JVM이 현재 수행할 명령어의 주소를 저장하는 PC 레지스터, native 메소드의 매개변수, 지역변수 등을 저장 native 메소드 스택등이 있다.
	    */
		/* 참조 : https://blog.naver.com/pions01/103487422 */
		 int mb = 1024*1024;
         
	     //Getting the runtime reference from system
	     Runtime runtime = Runtime.getRuntime();
	         
	     System.out.println("##### Heap utilization statistics [MB] #####");
	         
	     //Print used memory
	     System.out.println("Used Memory:"
	            + (runtime.totalMemory() - runtime.freeMemory()) / mb);
	 
	     //Print free memory
	     System.out.println("Free Memory:"
	            + runtime.freeMemory() / mb);
	         
	     //Print total available memory
	     System.out.println("Total Memory:" + runtime.totalMemory() / mb);
	 
	     //Print Maximum available memory
	     System.out.println("Max Memory:" + runtime.maxMemory() / mb);
	}
}
