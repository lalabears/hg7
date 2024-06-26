package j0626;
import java.util.*;
public class C0626_09 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("강백호", 30);		map.put("홍길동", 80);
		map.put("고길동", 90);		map.put("서태웅", 20);
		map.put("유관순", 100);		map.put("김구", 90);
		// 1. 맵의 크기 출력하기
		System.out.println(map.size());
		// 2. 맵 그냥 출력하기 
		System.out.println(map);
		// 3. 홍길동 점수 출력하기 
		System.out.println(map.get("홍길동"));
		// 4. 참가자 명단 출력해보기 < 단순해도 상관없음 [] 있어도 상관없음		
		Set<String> keysets = map.keySet();
		System.out.println(keysets);
		// 5. iterator을 사용해서 강백호 : 30 ~ 김구 : 90 출력해보기
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String k = it.next();
			int v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println("--------------------------");
		// 번외: 간단for문
		for(String keys : keysets) {
			System.out.println(keys+" : "+map.get(keys));
		}
		// 6. 전체 참가지의 총점, 평균 출력하기
		int sum = 0 ; 
		it = map.keySet().iterator();
		while(it.hasNext()) {
			String k = it.next();
			int v = map.get(k);
			sum += v; 	
		}
		int sum2 = 0 ;
		for(String keys : keysets) {
			sum2 += map.get(keys);
		}
		System.out.printf("총점: %d, 평균 %.2f \n",sum, (double)sum/map.size());   // 410
		System.out.printf("총점: %d, 평균 %.2f \n",sum2, (double)sum2/map.size());  // 410

// 총점: 410, 평균 68.33 
// 총점: 410, 평균 68.33 

		
		
	}

}
