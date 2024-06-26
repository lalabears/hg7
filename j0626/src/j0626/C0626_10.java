package j0626;
import java.util.*;
public class C0626_10 {
	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<String, Integer>();
		// 입력
//		map.put("강백호", 30);		map.put("홍길동", 80);
//		map.put("고길동", 90);		map.put("서태웅", 20);
//		map.put("유관순", 100);		map.put("김구", 90);
		
		// 출력
//		for (String key : map.keySet()) {
//			System.out.println(key+ " : " + map.get(key));
//		}
		
//		String str = "   1000   ";
//		int a = Integer.parseInt(str.trim());
//		System.out.println(a);
//		//str.trim() > 문자열의 공백지우기 
//		System.out.println(str.trim());
		
		Map<String, Integer> map = stuInput();
		stuPrint(map);
	} // main
	
	static Map<String, Integer>  stuInput() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		stuInput(map);
		return map;
	}
	static void stuInput(Map<String, Integer> map) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("이름,점수로 입력해주세요(종료:0)");
			// 강백호,90    홍길동,80  유관순,100 
			String str = scan.nextLine();
			if(str.equals("0")) break;
			// map에 값 넣기 
			String[] vals = str.split(",");
			// 홍길동, 90
			// vals[0] : 홍길동  vals[1] : " 90 "
			map.put(vals[0], Integer.parseInt(vals[1].trim()));
		}
	}
	static void stuPrint(Map<String, Integer> map) {
		for (String key : map.keySet()) {
			System.out.println(key+ " : " + map.get(key));
		}
	}

}
