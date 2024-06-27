package j0627;
import java.util.*;
public class C0627_02 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Map<String, String> words = inputData();
		quiz(words); 
	}
	static Map<String, String> inputData(){
		Map<String, String> map = new HashMap<String, String>();
		inputData(map);
		return map; 
	}
	static void inputData(Map<String, String> words) {
		// 한글/영어로 입력을 받아서 map을 채우세요 
		// 사과/apple   가방/bag   사진/picture   개/dog   책/book
		while(true) {
			System.out.println("한글/영어로 입력해주세요(종료0) ");
			String str = scan.nextLine(); 
			if(str.equals("0")) break;
			String[] strArr = str.split("/");
			words.put(strArr[0].trim(), strArr[1].trim());
		}
		
	}
	static void quiz(Map<String, String> words) {
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
