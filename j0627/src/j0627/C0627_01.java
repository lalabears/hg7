package j0627;
import java.util.*;
public class C0627_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> words = new HashMap<String, String>();
		words.put("사과", "apple");
		words.put("가방", "bag");
		words.put("사진", "picture");
		words.put("개", "dog");
		words.put("책", "book");	
		System.out.println(words.get("개"));
		System.out.println(words.get("사진기"));  // null
		for(String key : words.keySet()) {
			System.out.print(key+" ");    // key값
			System.out.println(words.get(key)); // value
		}
		System.out.println(words.containsKey("책") ); // boolean
		System.out.println(words.containsValue("apple"));
		System.out.println(words.get("사진")); // picture
		words.replace("사진", "photo");
		System.out.println(words.get("사진")); // photo
		
		// 맞추는 건 제외시키고, 다 맞출때까지 무한히 도전하게 만들기? 
		int cnt=0;
		int n = words.size();
		List<String> cor = new ArrayList<String>(); // 맞춘 키 저장용
		while(true) {
			//-- map itr 시작
			Iterator<String> keys = words.keySet().iterator();
			while(keys.hasNext()) {
				String k = keys.next(); // key 값 
				System.out.println(k+"를 영어로 하면? ");
				String ans = scan.next(); 
				if(ans.equals(words.get(k))) {
					System.out.println("정답!!");
					cor.add(k);
					cnt++;
				}else {
					System.out.println("오답!!");
					System.out.println("힌트: 단어의 총길이: "+ words.get(k).length());
					System.out.println("힌트: 단어시작 알파벳: "+ words.get(k).charAt(0));
				}
			}// while-key
			//--- map itr 끝
			for(String i : cor) {
				words.remove(i);
			}
			if(cnt==n) {
				System.out.println("모두 맞추셨습니다!! 수고하셨습니다 ");
				break; // 정답을 모두 맞췃을때만 종료 
			}
		}// while-true
		
		System.out.println("프로그램이 종료되었습니다 . 총 정답개수: " + cnt);
		
		

	}

}
