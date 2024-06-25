package j0625;
import java.util.*;
public class C0625_06 {
	public static void main(String[] args) {
		/* Stack 스택. 
		   list컬랙션 클래스의 Vector클래스를 상속받은 클래스 
		   - LIFO (last in first out) 구조 먼저 들어온 데이터가 나중에 나감
		   - 단방향 입출력 구조 : 데이터가 들어오는 방향과 나가는 방향이 같다
		   - 데이터를 하나씩만 넣고 뺄 수 있다. 
		*/
		Stack<Integer> stackInt = new Stack();
		// 값 추가 push() 
		stackInt.push(1);
		System.out.println(stackInt);
		stackInt.push(2);
		System.out.println(stackInt);
		stackInt.push(3);
		System.out.println(stackInt);
		stackInt.push(4);
		System.out.println(stackInt);
		// 1 - 2 - 3 - 4 순서로 값을 추가함 
		System.out.println("크기 : "+stackInt.size());
		// peek : 해당 스택에 상단에있는 (마지막에 저장된) 요소를 반환
		System.out.println(stackInt.peek()); // 4 
		System.out.println("-------------------");
		// 값 제거 : pop() 마지막요소 제거, 반환, 반환과 동시에 제거 
		stackInt.pop();  // 가장위에있는 4가 삭제 
		System.out.println(stackInt);
		stackInt.pop();  // 가장위에있는 3이 삭제 
		System.out.println(stackInt);
		System.out.println(stackInt.pop()); // 2출력, 동시에 값도삭제
		System.out.println(stackInt);
		// 4 - 3 - 2 의 순서로 값을 제거함. 
		System.out.println("-------------------");
		stackInt.push(2);
		stackInt.push(3);
		stackInt.push(1);  // 1 - 2 - 3 - 1 순서
		System.out.println(stackInt);
		
		// search() 스택에서 검색해서 해당위치를 반환.
		// 제일 위에 있는 위치가 1부터 시작함 
		System.out.println(stackInt.search(2)); // 3 
		System.out.println(stackInt.search(1)); // 1 
		System.out.println(stackInt.search(5)); // -1
		
		stackInt.clear(); // 스택에 있는 값 모두 제거 
		System.out.println(stackInt);
		System.out.println(stackInt.isEmpty());
		
		
	}

}
