package j0628;
import java.util.*;
public class C0628_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemControl mc = new MemControl();
		Map<String, Object> map = new HashMap<String, Object>();
		List<Member> list = new ArrayList<Member>();
		int count = 0; // 등록하는 사람의 숫자를 카운트해주는 변수
		loop: while(true) {
			System.out.println("1. 회원정보 입력");
			System.out.println("2. 회원정보 출력");
			System.out.println("0. 종료");
			System.out.println("------------------");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				map = mc.memInput(list, count);
				count = (int)map.get("cnt");
				list = (List<Member>)map.get("list");
				break;
			case 2:
				mc.memPrint(list);
				break;
			case 0: 
				System.out.println("프로그램을 종료합니다");
				break loop;
			}
		}
	}

}
