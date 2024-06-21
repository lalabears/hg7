package j0621;
import java.util.*;
public class C0621_12 {
	public static void main(String[] args) {
		Map<String, Object> m1 =  new HashMap<String, Object>();
		m1.put("name", "홍길동");
		m1.put("age", 22);
		m1.put("isMale", true);
		m1.put("pet", new Dog("뿌꾸",3));
		m1.put("111", 1111);

/*		for(String k : m1.keySet()) {
			System.out.println(k+ " : " + m1.get(k));
		}*/
		Map m2 =  new HashMap();
		// Map<Object, Object> m2 =  new HashMap<>();
		m2.put("pw", 1234);
		m2.put(1111, 1234);
		m2.put(true, "mmmm");
		
		
		// key : 아이디 value : 비밀번호 를 담는 
		// 해시맵을 만들어서, 5명의 값을 map에 넣어주세요 
		Map<String, String> map = new HashMap<String, String>();
		map.put("admin", "1234");
		map.put("aaa", "1111");		map.put("bbb", "2222");
		map.put("ccc", "3333");		map.put("ddd", "2222");
		//  출력도 해보세요 aaa : 1111 
/*		for(String id : map.keySet()) {
			System.out.println(id+ " : " + map.get(id));
		}*/
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			// 아이디와 비밀번호를 입력받아서 
			System.out.println("아이디");
			String id=scan.next();
			System.out.println("비밀번호");
			String pw=scan.next();
			
			if(map.containsKey(id)) {  // 아이디가 존재하면
				if(map.get(id).equals(pw)) { // 비밀번호가 일치하면
					System.out.println("로그인되었습니다");
					break;
				}else { // 비밀번호가 일치하지 않으면 
					System.out.println("비밀번호가 일치하지 않습니다");
				}
				
			}else { // 아이디가 존재하지 않으면 
				System.out.println("존재하지 않는 아이디입니다");
				System.out.println("다시입력해주세요");
			}
			
			// 아이디가 일치하지 않으면 없는아이디입니다 > 다시 아이디입력 
			// 아이디가 일치하면,
			//  비밀번호를 검사해서 비밀번호가 일치하면 while문종료
			//  비밀번호가 일치하지 않으면 비밀번호가 일치하지 않습니다 후 
			//  다시 아이디, 비밀번호를 입력받는다 
			
			
			
			
			
			
		}
		
		
		
		
		

	}

}
