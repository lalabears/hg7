package j0620;
import java.util.*;
public class C0620_12 {
	public static void main(String[] args) {
//		 1. 문자열을 담을 수 있는 해시셋 만든다.
		Set<String> set = new HashSet<String>();
//		   2. 과일이름 5개를 넣는다
		set.add("딸기");		set.add("포도");
		set.add("수박");		set.add("사과");		set.add("망고");
//		   3. 해시셋의 크기를 출력해본다
		System.out.println(set.size());
//		   4. 같은과일이름을 한번더 추가해본다.
		set.add("사과");
		System.out.println(set.add("사과"));  // false 중복. 추가실패
//		   5. 해시셋의 크기를 출력해본다.
		System.out.println(set.size());
//		   6. 이터레이터를 사용해서 객체를 출력해본다. 
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println(); 
//		   7. 과일 한개를 삭제해본다. 
		set.remove("수박");
//		   8. 없는 과일명으로 한개 삭제해본다. 
		set.remove("귤");
		System.out.println(set.remove("바나나")); // false 삭제실패 :없어서
//		   9. [] 있게 출력해본다  
		System.out.println(set); //[포도, 망고, 사과, 딸기]

		
	
	}

}
