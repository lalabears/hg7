package j0621;
import java.util.*;
public class C0621_01 {
	public static void main(String[] args) {
		/* 배열이란 ? 동일한타입의 연관된 데이터를 메모리에 연속적으로 저장해
		  하나의 변수에 묶어 관리하기 위한 자료구조 
		*/
		int[] arr = { 9,5,3,1,2,4,6,7,0,8 };
		// Arrays 클래스는 java.util 패키지의 일부. 배열을 다루기위한 메서드 제공
		System.out.println(Arrays.toString(arr)); // 1차원 배열 출력 
		// 2차원이상배열 출력은 Arrays.deepToString() 매서드 사용 
		
		// 오름차순으로 정렬 가능하게 해줌. 
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

		int[] arr1 = new int[10];
		Arrays.fill(arr1, 7);  // 특정 값으로 채우게 해주는 메서드 
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = {0,1,2,3,4,5,6,7,8,9};
		int[] arr3 = {0,1,2,3,4,5,6,7,8,9};
		// arr2, arr3 값은 주소값이 들어있기때문에 같은지를 비교하면 false
		System.out.println(arr2 == arr3);//false
		// 배열의 내용이 같은지를 비교하기위해서는 
		System.out.println(Arrays.equals(arr2, arr3)); //true
		
		// 배열을 list로 변환
		Integer[] num = {1,2,3,4,5};
		List<Integer> arrNum = Arrays.asList(num);
		System.out.println(arrNum);
		
		/* 리스트란 ? 배열과 같이 객체를 일렬로 늘어놓은 구조를 가짐 
		   객체를 인덱스로 관리하기때문에 객체를 저장하면 자동으로 인덱스가 부여됨 
		   인덱스 순서로 객체를 검색, 추가, 삭제하는 기능을 제공함. 
		   - 순서가 있고 중복을 허용함.
		   - 인덱스로 관리하기때문에 인덱스로 접근이가능함
		   - 크기가 가변적임 
		   List : 인터페이스
		   ArrayList : 구현한 클래스 
		   ArrayList<타입> 객체명 = new ArrayList<타입>(초기저장용량) ;
		   
		*/
		// 리스트 선언 및 생성
		List<Number> list = new ArrayList<Number>(); 
		// 선언과 동시에 값 할당 
		List<Number> tmp = Arrays.asList(new Integer[] {10,20,30});
		

		//--------------------------- 번외   ---------------------//
		//  tmp.add(50);  // 오류 발생
		/* Arrays.asList()의 결과는 ArrayList 클래스가 아니라
		   Arrays안에 있는 inner 클래스를 사용하는것이다. 
		   때문에 ArrayList와는 다르기때문에 ArrayList에 있는 add 메서드 사용불가
		*/
		Integer[] n1 = new Integer[] {10,20,30}; 
		List<Number> n1List = new ArrayList<Number>();
		n1List.addAll(Arrays.asList(n1));
		n1List.add(50);
		System.out.println(n1List); // [10, 20, 30, 50]
		// -------------------------------------------------------//
		// 리스트에 값 추가. add(값)
	    list.add(1);		list.add(1.1); 
		list.add(2);		list.add(2.2); 
		list.add(0,5); // 0번째 인덱스에 값 5를 넣어라. 
		System.out.println(list);  //  [5, 1, 1.1, 2, 2.2]
		
		list.addAll(Arrays.asList(4,5,6));

		System.out.println(list); // [5, 1, 1.1, 2, 2.2, 4, 5, 6]
		list.addAll(3, tmp);
		System.out.println(list); // [5, 1, 1.1, 10, 20, 30, 2, 2.2, 4, 5, 6]

		// 주어진 인덱스에 객체를 저장 
		list.set(0, 6);
		System.out.println(list); // [6, 1, 1.1, 10, 20, 30, 2, 2.2, 4, 5, 6]
		
		// 객체의 위치를 반환해주는 indexOf
		System.out.println(list.indexOf(6));     // 0 
		System.out.println(list.lastIndexOf(6)); // 10
		
		// contains(객체) 리스트에 객체가 있는지 없는지 찾아줌 
		System.out.println(list.contains(1.1)); // true
		
		// remove(인덱스) - 인덱스 위치에 있는 값 삭제 
		list.remove(1); // 1번 인덱스 위치에 있는 값을 삭제해라 
		System.out.println(list); // [6, 1.1, 10, 20, 30, 2, 2.2, 4, 5, 6]
		// remove(객체)
		list.remove(2.2); // 객체를 찾아서 삭제
		System.out.println(list); // [6, 1.1, 10, 20, 30, 2, 4, 5, 6]
		list.remove(Integer.valueOf(20));
		System.out.println(list); // [6, 1.1, 10, 30, 2, 4, 5, 6]
		
		// list의 크기는 size()
		System.out.println(list.size()); // 현재 리스트의 크기 8
		
		// 리스트의 출력 
		System.out.println(list); // []를 포함한 결과를 출력해준다. 
		// 간단 for문사용 
		for(Object i : list) {
			System.out.print( i + " ");
			System.out.println(i.getClass()); 
			// 객체의 타입을 알고자할때 getClass()메서드
		}
		System.out.println(); // 줄바꿈
		// 리스트 인덱스 위치에 접근하는 get(인덱스) 
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println( ); // 줄바꿈
		// iterator 사용 
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println(); //줄바꿈 
		

		
		
		
		
		

		
		

	}

}
