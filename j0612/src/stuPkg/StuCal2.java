package stuPkg;
import java.util.Scanner;
public class StuCal2 {
	Scanner scan = new Scanner(System.in);	
	int choice; 
	int screenPrint() {
		System.out.println("-------------------- ");
		System.out.println(" [ 성적처리 프로그램 ]");
		System.out.println(" 1. 성적 입력 ");
		System.out.println(" 2. 성적 출력 ");
		System.out.println(" 3. 성적 수정 ");
		System.out.println(" 4. 등수 처리 ");
		System.out.println(" 5. 학생 성적 검색 ");
		System.out.println(" 0. 프로그램 종료 ");
		System.out.println("-------------------- ");
		System.out.println("원하는 번호를 입력하세요 ");
		choice = scan.nextInt();
		return choice; 
	} // screenPrint

	
	
}
