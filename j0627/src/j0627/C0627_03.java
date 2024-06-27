package j0627;
import java.util.*;
public class C0627_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String,String> user = new HashMap<>();
		user.put("aaa","1111");
		user.put("bbb","2222");
		user.put("ccc","3333");
		user.put("ddd","4444");
		user.put("admin","1234");
		while(true) {
			System.out.println("아이디,비밀번호로 입력 : ");
			String str = scan.nextLine();
			String[] strArr = str.split(",");
			String id = strArr[0].trim();
			String pw = strArr[1].trim();
			if( ! user.containsKey(id) ) {
				System.out.println("존재하지 않는 아이디입니다");
				continue;
			}
			if( user.get(id).equals(pw)) {
				System.out.println("로그인되었습니다");
				break;
			}else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}
			
		}



	}

}
