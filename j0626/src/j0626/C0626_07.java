package j0626;
import java.util.*;
public class C0626_07 {
	public static void main(String[] args) {
		Map<String,String> zipMap = new HashMap<>();
/*		서울 02	인천 032	대전 042	대구 053	
		부산 051	광주 062	울산 052	제주 064 */
		zipMap.put("서울", "02");	zipMap.put("인천", "032");
		zipMap.put("대전", "042");	zipMap.put("대구", "053");
		zipMap.put("부산", "051");	zipMap.put("광주", "062");
		zipMap.put("울산", "052");	zipMap.put("제주", "064");
		System.out.println(zipMap);	
		// entry 갯수
		int size = zipMap.size();
		System.out.println(size);
		// 객체 찾기
		// 부산은 zip코드가 뭘까요 ? 출력해보세요 
		String busan = zipMap.get("부산");
		System.out.println("부산의 지역번호는 : "+busan);
		// key들로 set 만들기 
		Set<String> keySet = zipMap.keySet();
		// key를 요소로 가지는 set 생성
		// set 은 중복없고, 순서없다. 
		System.out.println(keySet);
		// iterator로 값 읽기
		Iterator<String> keyItr = keySet.iterator();
		while(keyItr.hasNext()) {
			String k = keyItr.next();
			String v = zipMap.get(k);
			System.out.println("키: "+ k + ", 값: "+v);
		}
		// 부산 삭제하기 
		// zipMap.remove("부산");
		System.out.println(zipMap);
		System.out.println(	zipMap.containsKey("부산") ); // true
		System.out.println(	zipMap.containsKey("경주") ); // false
		// while  true로 지역이름을 
		// 입력하면 지역번호를 알려주는 프로그램을 만들어주세요
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("지역이름을 입력해주세요(종료 0) ");
			String loc = scan.next();
			if(loc.equals("0")) break;
			if(zipMap.containsKey(loc)) {
				System.out.println(loc+"의 지역번호는 : " + zipMap.get(loc));
			}else {
				System.out.println("입력하신 지역의 정보가 없습니다. ");
			}
			
			
		}
		
		
		
		
		
	}

}
