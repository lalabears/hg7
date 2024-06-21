package j0621;
import java.util.*;
public class C0621_10 {
	public static void main(String[] args) {
		/* set - 중복을 허용하지 않고 저장순서를 유지하지 않는 컬렉션 
		   set : 인터페이스 
		   hashset: 구현클래스 
		          : set 특성을 그대로 물러받아 중복된 값을 허용하지 않고 
		            저장순서를 유지하지 않는다. */
		Set<String> set = new HashSet<String>();
		// set 에 추가 
		set.add("Java");		set.add("HTML");
		set.add("SQL");		    set.add("JavaScript");
		set.add("Python");      set.add("Java");
		System.out.println(set);  // 중복을 허용하지 않기때문에 두번째 Java없음
		// [Java, JavaScript, HTML, SQL, Python]
		System.out.println(set.size());  // size() 크기 
		// set 에 있는지 없는지 검사해서 출력해준다. 
		System.out.println(set.contains("SQL"));  // true
		System.out.println(set.contains("C++"));  // false 
		// 요소제거 :remove()
		set.remove("SQL");
		System.out.println(set); //[Java, JavaScript, HTML, Python]
		
		// 인덱스가 존재하지 않기때문에 인덱스로는 값을 가져올 수 없다
		for(String s : set) {
			System.out.println(s);
		}
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
		System.out.println();
		
		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());
		

		
		

	}

}
