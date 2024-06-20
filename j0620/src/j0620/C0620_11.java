package j0620;
import java.util.*;
public class C0620_11 {
	public static void main(String[] args) {
		/*  set 인터페이스는 중복되지 않는 요소의 집합이다. 
		        순서를 유지하지 않는다. 주로 고유한 값을 저장할때 사용
		    
		    HashSet - 해시테이블기반 set구현클래스. 
		              요소의 순서를 유지하지 않으며 빠른검색, 삽입, 삭제를 제공
		    LinkedHashSet - HashSet과 유사. 
		                    요소의 삽입 순서를 유지하는 Set 구현클래스 
		                    요소의 순서를 유지하면서 HashSet성능 제공
		    TreeSet - 이진검색트리기반의 Set 구현클래스
		              요소를 정렬된 순서로 저장, 검색, 삽입, 삭제 성능이 우수함 
		*/
		
		HashSet num1 = new HashSet();
		HashSet<Number> num2 = new HashSet<>();
		HashSet<Number> num3 = new HashSet<>(50); // 초기용량지정가능 
		Set<Number> num4 = new HashSet<Number>(); 
		// num3의 모든 값을 가진 hashset생성 
		HashSet<Number> num5 = new HashSet<>(num3); 
		// 초기값을 지정해서 넣을 수 있다
		HashSet<Number> num6 = new HashSet<>(Arrays.asList(1,2,3)); 
		
		// Number 형 자료를 가지는 set 
		Set<Number> set = new HashSet<Number>();
		// add()를 사용해서 값을 추가할 수 있다. 
		set.add(10);
		set.add(3.14);
		set.add(9000);
		//  set.add("A"); 
		// 저장순서가 보장되어 있지 않기때문에 특정위치에 값을 추가할 수 없다. 
		
		// size() : 크기
		System.out.println("해시셋의 크기 : "+set.size());
//		해시셋의 크기  3
		
		// list - set 큰차이 : 순서가 잇고없고(set은 인덱스가없음), 중복이 있고없고 
		System.out.println(set.add(4.1)); // true : 4.1 추가 성공 
		System.out.println(set.size());   // 4 - 크기가 하나 증가 
		System.out.println(set.add(10));  // false : 10 추가 실패(중복허용X)
		System.out.println(set.size());   // 4 - 크기 유지
		// HashSet 내부에 존재하지 않는다면 그 값을 HashSet에 추가하고 true 반환
		// HashSet 내부에 존재한다면 false 반환 
		
		// HashSet내부에 값 1이 있다면 true, 없으면 false 
		System.out.println(set.contains(1));  // false
		// 출력 
		System.out.println(set); // [3.14, 4.1, 9000, 10]
		
		// 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자 Iterator을 사용해서 출력
		Iterator<Number> iter = set.iterator();
		// hasNext() : 가져올 객체가 있으면 true 없으면 false
		// next(): Iterator에서 하나의 객체를 가져올 수 있는 메서드 
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println(); // 3.14 4.1 9000 10 

		// remove(value) 와 clear()을 사용해서 HashSet의 값을 제거할 수 있다. 
		System.out.println(set);  // [3.14, 4.1, 9000, 10]
		set.remove(10);
		System.out.println(set); // [3.14, 4.1, 9000]
		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty()); // true



		
		
		
		
		

	}

}
