package j0626;
import java.util.*;
public class C0626_08 {
	public static void main(String[] args) {
		// 사전 만들기 
		Map<String, String> dic = new HashMap<String, String>();
		dic.put("고양이", "cat");		 dic.put("강아지", "dog");
		dic.put("집", "house");		 dic.put("사과", "apple");
		dic.put("자동차", "car");		 dic.put("전화기", "phone");
		dic.put("물", "water");		 dic.put("공기", "air");
		dic.put("어린이", "children"); dic.put("책", "book");
		
		// 고양이를 영어로 입력해주세요 > 정답입니다 오답입니다 로 출력되게 
		// 총 정답수 출력 00개 정답 입니다  
		boolean a =	dic.get("고양이").equals("CAT");
		boolean b =	dic.get("고양이").equalsIgnoreCase("CAT");
		System.out.println(b);	
		Scanner scan = new Scanner(System.in);
		Set<String> kor = dic.keySet();
		Iterator<String> key = kor.iterator();
		int cnt=0;
		while(key.hasNext()) {
			String k = key.next();
			String v = dic.get(k);
			System.out.println(k+"는 영어로 ? ");
			String word = scan.next();
			if(v.equalsIgnoreCase(word)) {
				System.out.println("정답");
				cnt++;
			}else {
				System.out.println("오답");
				System.out.println("정답은 : "+ v);
			}
		}
		System.out.println("총 10개 중에 "+cnt+"개 맞추셧습니다");
		
		
	}

}
