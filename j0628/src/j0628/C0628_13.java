package j0628;
import java.util.*;
public class C0628_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0; 
		StuControl sc = new StuControl();
		Map<String, Object> map = new HashMap<String,Object>();
		List<Student> list = new ArrayList<Student>();
		loop: while(true) {
			System.out.println("[학생 성적 프로그램]");
			System.out.println("1. 학생 입력");
			System.out.println("2. 학생 출력");
			System.out.println("7. 검색한 학생정보만 저장하기");
			System.out.println("8. 학생정보 파일에서 가져오기");
			System.out.println("9. 학생정보 파일에 저장하기");
			System.out.println("0. 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 선택해주세요 ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				map = sc.stuInput(list, count);
				count = (int)map.get("count"); 
				list = (List<Student>)map.get("list");
				break;
			case 2:
				sc.stuPrint(list);
				break;
			case 8:
				try {
					list = sc.stuRead();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 9: // 파일에 저장
				try {
					sc.stuSave(list);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
			
		}//while

	}// main
}// class
