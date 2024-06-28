package j0628;
import java.util.*;
public class MemControl {
	Scanner scan = new Scanner(System.in);
	// 회원등록하는 매서드 
	public Map<String, Object> memInput(List<Member> list, int count) {
//         리턴타입              매서드명 매개변수타입1 매개변수명1, 매개변수타입2 변수명2
		Map<String, Object> map = new HashMap<String, Object>();
		while(true) {
			System.out.println("회원정보 입력");
			System.out.println((count+1)+"번 회원 이름 입력(종료0): ");
			String name = scan.next();
			if(name.equals("0")) break; 
			System.out.println("아이디 입력");
			String id = scan.next();
			System.out.println("비밀번호 입력");
			String pw = scan.next();
			list.add( new Member(name, id, pw) );
			count++; 
		}
		map.put("cnt", count); // int type
		map.put("list", list); // List type
		map.put("currentPageNo", 10);
		map.put("adminInfo", "hiddnmessage");
		return map;
	}
	// 등록된 회원정보를 출력하는 매서드
	public void memPrint(List<Member> list) {
		System.out.println("[회원 정보]");
		System.out.println("이름\t아이디\t비밀번호\t");
		for(Member m : list) {
			System.out.printf("%s\t%s\t%s\n", m.getName(), m.getId(), m.getPw());
		}
		
	}

}
