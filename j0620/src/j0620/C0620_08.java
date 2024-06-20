package j0620;
import java.util.*;
public class C0620_08 {
	public static void main(String[] args) {
		/* 컬렉션 프레임워크  
		   :데이터 구조를 다루기 위한 표준화된 클래스와 인터페이스의 집합. 
		   데이터를 효율적으로 저장하고, 검색하고, 수정할 수 있는 방법을 제공해줌 
		List, Set, Map 인터페이스로 구성되어있음. 
		*/
		/* List 인터페이스는 순서가 있는 데이터 집합. 중복된 요소 허용
		   배열과 유사하지만 크기가 동적으로 변경될 수 있음 
		   ArrayList, LinkedList, Vector 등의 구현클래스가 있음	   
		   1. ArrayList - 배열기반의 List구현 클래스. 
		      요소의 인덱스를 통해 빠르게접근할 수 있음. 중간에 요소를 삽입하거나
		      삭제할때는 성능이 저하될 수 있음. 
		   2. LinkedList - 연결기반의 List구현클래스.
		      요소의 삽입과 삭제가 빠르지만 인덱스를 통한 접근속도가 느릴 수 있음. 
		*/
		// 배열 - 크기가 고정되 어있음. 인덱스로 데이터를관리함. 크기변경불가 
		int[] arrN = {1,2,3,4,5};
		System.out.println("배열의 크기 : " + arrN.length );
		arrN[0] = 10;   // 인덱스로 데이터 수정
		arrN[3] = 55; 
		// 배열 출력 
		System.out.println(Arrays.toString(arrN));
		for(int i = 0 ; i<arrN.length ; i++) {
			System.out.print(arrN[i]+" "); // 배열의 i번째 인덱스 출력
		}
		System.out.println();
		// ArrayList 객체생성 - 기본저장용량은 10을 가짐. 
		ArrayList a = new ArrayList(); 
		// 저장용량 50 
		ArrayList a1 = new ArrayList(50); 
		// 다형성 
		List list = new ArrayList(); 
		// ArrayList는 모든 종류의 객체를 저장할 수 있음. 
		// 객체가 저장될때 자동으로 object 타입으로 변환되어서 저장됨. 
		// 저장할때 object로 변환하고 찾아올때 다시 원래타입으로 변환해야하므로
		// 성능에는 좋지못함. 
		// 일반적으로 단일 종류의 객체를 저장하기때문에 어떤값을 넣어줄지 미리 정한다.
		ArrayList<Integer> a3 = new ArrayList<>(); 
		
		int n1 = 10 ;    // 기본자료형 - 8 개 
		// short, int, double, long, float, boolean, byte, char 
		Integer n2 = new Integer(10); 
		Double n3 = new Double(11); 
		
		// integer 즉, 정수만 담을수 있는 리스트 
		List<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(1.123); > 컴파일 에러 발생 
		// 리스트의 크기 : size()
		System.out.println("리스트의 크기 : "+ numbers.size()); // 0
		// 리스트에 자료 추가하기 : add()
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);
		System.out.println("리스트의 크기 : "+ numbers.size()); // 5
		// 새로운 데이터를 index를 추가해서 넣는다 
		numbers.add(0, 17); // 맨 앞에 값 추가하기 
		// numbers.add(인덱스번호, 넣을값 );
		numbers.add(1, 20); 
		// 리스트 출력하기 
		System.out.println("리스트 출력 : " + numbers);
		// 대괄호가 있는 리스트를 출력해줌  [17, 20, 11, 12, 13, 14, 15]
		System.out.println("리스트의 크기 : "+ numbers.size()); // 7

		// for 문을 사용해서 출력하기 
		for (int i = 0 ; i < numbers.size() ; i++) {
			System.out.print(numbers.get(i)+ " ");
		}
		System.out.println();
		
		// 리스트의 요소를 가지고 올때는 get(인덱스)를 사용한다.  
		
		// set(index, 값) - 인덱스 데이터의 값 변경 
		numbers.set(0, 100); // 0번째 방에 있는 값을 100으로 변경해라 
		System.out.println(numbers); // [100, 20, 11, 12, 13, 14, 15]

		// remove메서드를 사용하면 요소를 제거할 수 있다. 
		numbers.remove(1); // 1번방의 요소를 삭제해죠 
		System.out.println(numbers.size()+ " : " +numbers); 
		//  6 : [100, 11, 12, 13, 14, 15]
		// 11을 삭제하고싶을 경우에는 ? 
		numbers.remove(new Integer(11)); 
		System.out.println(numbers.size()+ " : " +numbers); 
		//  5 : [100, 12, 13, 14, 15]
		numbers.remove(Integer.valueOf(14));
		System.out.println(numbers.size()+ " : " +numbers); 
		// 4 : [100, 12, 13, 15]
		// remove()에 매개변수로 Object객체를 전달하면 
		// ArrayList에서 해당 객체를 찾아서 있으면 삭제한다. 
		// 같은 값이 존재한다면 첫번째값만 삭제한다. 
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		System.out.println(numbers.size()+ " : " +numbers); 
		//  7 : [100, 12, 13, 15, 10, 10, 10]
		numbers.remove(Integer.valueOf(10));
		System.out.println(numbers.size()+ " : " +numbers); 
		//  6 : [100, 12, 13, 15, 10, 10]
		
		// Collections.sort() 메서드를 이용하면 정렬을 해준다. 
		Collections.sort(numbers);
		System.out.println(numbers);
        // [10, 10, 12, 13, 15, 100]
		
		List<Integer> aNum = new ArrayList<Integer>();
		aNum.add(1);		aNum.add(2);		aNum.add(3);
		
		numbers.addAll(aNum);  // 끝에 리스트 추가함 
		System.out.println(numbers.size()+ " : " +numbers); 
	    //	9 : [10, 10, 12, 13, 15, 100, 1, 2, 3]
		
		numbers.addAll(1, aNum); // 1번방부터 리스트를 다 넣음
		System.out.println(numbers.size()+ " : " +numbers); 
		// 12 : [10, 1, 2, 3, 10, 12, 13, 15, 100, 1, 2, 3]
		
		// 인티저 배열생성 
		Integer[] listA = {7,8,9};
		// asList를 사용해서 초기값을 한번에 넣어줄 수 도 있습니다. 
		List<Integer> arr1 = Arrays.asList(listA);
		List<Integer> arr2 = Arrays.asList(100,200,300);
		System.out.println(arr1); // [7, 8, 9]
		System.out.println(arr2); // [100, 200, 300]

		
		// contains(값) : 리스트에 100이 있으면 true, 없으면 false 
		System.out.println(numbers.contains(100));
		
		// indexOf(값) 해당 값을 가지고 있는 요소의 위치를 반환
		int n = numbers.indexOf(15); 
		System.out.println(n);  //잇으면 위치 : 7
		System.out.println(numbers.indexOf(500)); // 없으면 -1 
		
		// 전체삭제
		numbers.clear();
		System.out.println(numbers); // []
		System.out.println(numbers.isEmpty()); 
		// 배열이 비엇는지 아무것도 없으면 true 반환

		
		
		
		
		
	}

}
