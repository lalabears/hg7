package stuPkg;
import java.util.*;
public class StuMain {
	public static void main(String[] args) {
		// 객체선언    및    생성 
		int stuCnt = 1; 
		StuControl sc = new StuControl();
		loop: while(true) {
			int choice = sc.screenPrint();
			switch(choice) {
			case 1: // 학생입력
			//	sc.scoreInput(); // void일때 
				stuCnt = sc.scoreInput(stuCnt);
				break;
			case 2: // 성적 출력
				sc.scorePrint();
				break;
			case 3: // 성적 수정
				sc.scoreModify();
				break;
			case 4: // 학생 정보 삭제 
				sc.scoreDelete();
				break;
			case 5: // 등수처리
				sc.scoreRank();
				break;
			case 6: // 검색 출력 
				sc.searchPrint();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다");
				break loop;
			}
		}

	}

}
