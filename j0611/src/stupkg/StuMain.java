package stupkg;
import java.util.Scanner;
public class StuMain {
	public static void main(String[] args) {
		StuCal stucal = new StuCal();
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
		
	}// main
}// class
