package j0625;
import java.util.*;
public class C0625_07 {
	public static void main(String[] args) {
		/* Queue 인터페이스 
		   - FIFO (First in First Out) 
		   - 구현한 대표적인 클래스는 linkedlist 
		   LinkedList는 list인터페이스를 구현한 list컬랙션이기도함
		   Queue는 LinkedList객체를 Queue인터페이스타입으로 변환해서 사용
		*/
		List<Integer> list = new LinkedList<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		// offer() 객체 넣기 
		System.out.println(queue.peek()); // 아무것도 없을때 : null 반환
		queue.offer(1);
		System.out.println(queue);
		queue.offer(2);
		System.out.println(queue);
		queue.offer(3);
		System.out.println(queue);
		queue.add(4);  // 맨뒤요소를 삽입할때 add 사용할 수 있다 
		System.out.println(queue);
		System.out.println("크기 : "+queue.size());
		// peek - 가장 앞에 있는 애를 반환함 
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println("-------------------------");
		// 해당큐의 맨앞에있는(제일먼저 저장된) 요소를 반환하고 큐에서 제거 
		queue.poll(); // 1을 제거함 
		System.out.println(queue);
		queue.poll(); // 2를 제거
		System.out.println(queue);
		System.out.println(queue.poll());// 3을 제거하면서 3을 출력 
		System.out.println(queue);
		queue.remove(); // 맨앞에 있는 요소를 제거함. 
		System.out.println(queue);
		
		
	}

}
