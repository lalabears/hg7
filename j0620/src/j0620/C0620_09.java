package j0620;
import java.util.*;
public class C0620_09 {

	public static void main(String[] args) {
		String[] str = {"포도","사과","딸기","수박","바나나","사과"};
//		1. 리스트를 만들어서 위의 배열처럼 저장해보세요
		List<String> list = new ArrayList<String>();
		list.add("포도");list.add("사과");list.add("딸기");
		list.add("수박");list.add("바나나");list.add("사과");
		System.out.println(list);
	//	[포도, 사과, 딸기, 수박, 바나나, 사과]
		
//		2. 저장된 객체의 갯수 출력하기
		System.out.println("리스트의 크기 : "+list.size());

//		3. 딸기 출력하기 - 인덱스로 
		int n = list.indexOf("딸기");
		System.out.println(list.get(n));  // 딸기
		
//		4. [] 없이 전체 출력하기 
		for(int i = 0; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println(); // 포도 사과 딸기 수박 바나나 사과 

		for(String f : list) {  // 간단 for. for-each 사용햇던 그것.. 
			System.out.print(f+ " ");
		}
		System.out.println();   // 포도 사과 딸기 수박 바나나 사과 

//		5. 바나나를 망고로 바꾸기 
		list.set(4, "망고");
		System.out.println(list);// [포도, 사과, 딸기, 수박, 망고, 사과]
//		6. 딸기 삭제하기(딸기로)
		list.remove("딸기");
		System.out.println(list); // [포도, 사과, 수박, 망고, 사과]

//		7. 4번째 인덱스 값 삭제하기 
		list.remove(4);
		System.out.println(list); // [포도, 사과, 수박, 망고]

		
	}

}
