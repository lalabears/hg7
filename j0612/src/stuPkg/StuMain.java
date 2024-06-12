package stuPkg;
import java.util.Scanner;
import j0612.Parent;
public class StuMain {
	public static void main(String[] args) {
		// 
		StuCal stucal = new StuCal(); // 모든메서드들이 잇을예정
		Scanner scan = new Scanner(System.in);
		int choice = 0 ; 
		loop:while(true) {
			choice = stucal.screenPrint();
			switch(choice) {
			case 1: // 입력
				stucal.scoreInput();
				break;
			case 2: // 출력
				stucal.scorePrint();
				break;
			case 3: // 수정
				stucal.scoreModify();
				break;
			case 4: // 등수처리
				stucal.scoreRank();
				break;
			case 5:// 검색출력
				stucal.searchPrint();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop; 
			}// switch
		} // while 
		
		
		
		
		
	}
	
	
	/*
	public static void main(String[] args) {
		// 패키지명.클래스명  참조변수명 ; 
		j0612.Parent p = new j0612.Parent(); 
		// import를 사용해면 패키지명을 생략할 수 있음.
		Parent p1 = new Parent(); 
		p.x = 100; 
		System.out.println(p.x);
	
	}
	*/

}
