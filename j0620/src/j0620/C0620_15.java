package j0620;
import java.util.*;
public class C0620_15 {
	public static void main(String[] args) {
//		1. 학생이름, 점수   로 이루어진 해시맵 만들기 
//	       key   ,  value
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("이순신", 90);		map.put("유관순", 100);
		map.put("홍길동", 85);		map.put("강백호", 20);
		map.put("서태웅", 45);		map.put("채치수", 99);
//	    2. 맵의 크기출력하기.
		System.out.println(map.size());  //6 
//	    3. 이름으로 점수 출력하기. 홍길동의 점수를 출력해주세요
		System.out.println(map.get("홍길동")); // 85
//	    4. 객체를 출력해보기 
		System.out.println(map); // { 강백호=20, 홍길동=85, 서태웅=45, 이순신=90, 채치수=99, 유관순=100}
//	    5. 객체를 이름 : 점수 로 한개한개 출력해보기 
		for(String name : map.keySet()) {
			System.out.println(name+" : "+ map.get(name));
		}
//	    6. 홍길동 객체 삭제해보기 
		map.remove("홍길동");
//	    7. 전체 객체 출력해보기 
		System.out.println(map);
//		8. 키 출력하기
		System.out.println(map.keySet());


	}

}
