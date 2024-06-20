package j0620;
import java.util.*;
public class C0620_14 {
	public static void main(String[] args) {
		/* Map 인터페이스는 키와 값이 쌍으로 이루어진 데이터의 집합 
		       키는 중복되지 않지만 값은 중복을 허용한다. 
		       키를 통해서 값을 효율적으로 검색할 수 있다. 
		  -HashMap : 해시테이블기반 Map 구현클래스. 
		             키의 순서를 유지하지 않으며, 빠른검색, 삽입, 삭제를 제공
		  -LinkedHashMap : HashMap과 유사하지만 키의 삽입순서를 유지하는 Map 구현클래스
		  -TreeMap : 이진검색트리기반의 Map구현 클래스.키 정렬순서로 저장.
		*/
		
		//    키       값
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "사과");
		map.put(200, "바나나");
		map.put(300, "포도");
		map.put(400, "포도"); // 키가 다르고 값이 같음   - 오케이
		map.put(200, "수박"); // 키가 같고 값이 다름    - 낫오케이
		System.out.println(map);
		// {400=포도, 100=사과, 200=수박, 300=포도}
		
		// 해시맵에 값을 추가하려면 put(key, value) 메서드를 사용해야한다. 
		// 해시맵 선언 시 설정해준 타입과 같은 타입의 key 같은타입의 value를 넣어야함. 
		// 만약 입력되는 키값이 이미 내부에 존재한다면 기본의 값은 새로운 값으로 대치됨. 
		
		// 맵은 키 중복은안됨.!!!
		System.out.println("맵의 크기 : "+map.size());//맵의 크기 : 4
		// 맵의 요소는 키 값으로 가져올 수 있다. 
		System.out.println(map.get(200)); // 수박
		// 키값들만 가져온다. - keyset()
		System.out.println(map.keySet()); // [400, 100, 200, 300]
		for(Integer key : map.keySet()) {
			System.out.println("key : "+ key + " value : "+ map.get(key) );
		}
//		key : 400 value : 포도	key : 100 value : 사과		
//		key : 200 value : 수박	key : 300 value : 포도
		
		// 키로 값을 삭제함
		map.remove(400);
		System.out.println(map); // {100=사과, 200=수박, 300=포도}
		map.clear();  // 모든 값 제거 
		System.out.println(map.isEmpty());


		

		
	}

}
