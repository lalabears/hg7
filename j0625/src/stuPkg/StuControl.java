package stuPkg;
import java.util.*;
public class StuControl {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<Student>();
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	// 화면 출력
	int screenPrint() {
		System.out.println("-------------------- ");
		System.out.println(" [ 성적처리 프로그램 ]");
		System.out.println(" 1. 성적 입력 ");
		System.out.println(" 2. 성적 출력 ");
		System.out.println(" 3. 성적 수정 ");
		System.out.println(" 4. 학생 삭제 ");
		System.out.println(" 5. 등수 처리 ");
		System.out.println(" 6. 학생 성적 검색 ");
		System.out.println(" 0. 프로그램 종료 ");
		System.out.println("-------------------- ");
		System.out.println("원하는 번호를 입력하세요 ");
		int choice = scan.nextInt();
		return choice; 
	}
	// 학생입력
	void scoreInput() {
		System.out.println();
		System.out.println("[학생 성적 입력]");
		System.out.println("학생의 이름을 입력해주세요 (0.이전)\n");
		String name = scan.next();
		if(name.equals("0")) return; // 메서드종료 
		System.out.println("국어점수: ");
		int kor = scan.nextInt();
		System.out.println("영어점수: ");
		int eng = scan.nextInt();
		System.out.println("수학점수: ");
		int math = scan.nextInt();
		// 학생정보를 리스트에 저장함. 
		list.add( new Student( name, kor, eng, math ));
		System.out.println("학생의 정보가 입력되었습니다. \n");
		System.out.println();	
	}
	/*
	int scoreInput(int stuCnt) {
		while(true) {
			System.out.println();
			System.out.println("[학생 성적 입력]");
			System.out.printf("%d번째 학생의 이름을 입력해주세요 (0.이전)\n",stuCnt);
			String name = scan.next();
			if(name.equals("0")) break; // while문 종료 
			System.out.println("국어점수: ");
			int kor = scan.nextInt();
			System.out.println("영어점수: ");
			int eng = scan.nextInt();
			System.out.println("수학점수: ");
			int math = scan.nextInt();
			// 학생정보를 리스트에 저장함. 
			list.add( new Student( name, kor, eng, math ));
			System.out.printf("%d번째 학생의 정보가 입력되었습니다. \n",stuCnt);
			System.out.println();
			stuCnt++;
		}
		return stuCnt;
	}*/
	// 성적 출력
	void scorePrint() {	
		System.out.println();
		System.out.println("[학생 성적 출력]");
		// 타이틀 출력
		printTitle();
		// list에 있는 값(학생정보) toString() 부분을 출력
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
	}
	// 성적 수정
	void scoreModify() { 
		System.out.println();
		System.out.println("[학생 성적 수정]");
		int flag = 0;  // 학생이없으면 0 있으면 1 
		int no = -1;  // list의 몇번째 위치에 있는 학생을 삭제할지에 대한
		System.out.println("수정를 원하는 학생의 이름을 입력해주세요 ");
		String name = scan.next();
		printTitle();
		for(int i = 0 ; i < list.size(); i++) {
			// i번째 리스트에 있는 학생의 정보중 이름이 내가 입력한name과 같다면 
			 if(list.get(i).getName().equals(name)) {
				System.out.println(list.get(i));
				flag = 1; // 존재하기때문에 1로변경 
				no = i;  // 동명이인 고려하지 않음 
			}
		}
		if(flag==1) { // 학생이 존재할때 
			System.out.println(name+"학생 성적 수정을 선택하셨습니다. ");
			System.out.println("[수정 과목 선택]");
			System.out.println("1. 국어 ");
			System.out.println("2. 영어 ");
			System.out.println("3. 수학 ");
			System.out.println("---------------------------------");
			System.out.println("원하는 번호를 선택하세요");
			int choice = scan.nextInt();
			int score=0;
			switch(choice){
			case 1: // 국어성적 수정
				System.out.println("[국어성적 수정]");
				System.out.println("------------------------------");
				System.out.println("현재 국어점수: " + list.get(no).getKor());
				System.out.println("변경할 점수를 입력해주세요 : ");
				score = scan.nextInt();
				list.get(no).setKor(score);
				System.out.println("국어점수가 변경되었습니다. ");
				break;
			case 2: // 영어성적 수정
				System.out.println("[영어성적 수정]");
				System.out.println("------------------------------");
				System.out.println("현재 영어점수: " + list.get(no).getEng());
				System.out.println("변경할 점수를 입력해주세요 : ");
				score = scan.nextInt();
				list.get(no).setEng(score);
				System.out.println("영어점수가 변경되었습니다. ");
				break;
			case 3: // 수학성적 수정
				System.out.println("[수학성적 수정]");
				System.out.println("------------------------------");
				System.out.println("현재 수학점수: " + list.get(no).getMath());
				System.out.println("변경할 점수를 입력해주세요 : ");
				score = scan.nextInt();
				list.get(no).setMath(score);
				System.out.println("수학점수가 변경되었습니다. ");
				break;
			}// switch
			
			// 평균, 총점 수정하기 
			list.get(no).setTotal( list.get(no).getKor()+ list.get(no).getEng()+ list.get(no).getMath());
			list.get(no).setAvg( list.get(no).getTotal()/ 3.0);
		}
		if(flag == 0) System.out.println("학생이 존재하지 않습니다. ");
	}
	// 학생 정보 삭제
	void scoreDelete() { 
		System.out.println();
		System.out.println("[학생 정보 삭제]");
		int flag = 0;  // 학생이없으면 0 있으면 1 
		int no = -1;  // list의 몇번째 위치에 있는 학생을 삭제할지에 대한
		System.out.println("삭제를 원하는 학생의 이름을 입력해주세요 ");
		String name = scan.next();
		printTitle();
		for(int i = 0 ; i < list.size(); i++) {
			// i번째 리스트에 있는 학생의 정보중 이름이 내가 입력한name과 같다면 
			 if(list.get(i).getName().equals(name)) {
				System.out.println(list.get(i));
				flag = 1; // 존재하기때문에 1로변경 
				no = i;  // 동명이인 고려하지 않음 
			}
		}
		System.out.println("정말로 삭제하시겠습니까? 1:네 2: 아니오");
		int choice = scan.nextInt();
		if(choice == 1) {
			list.remove(no);
			System.out.println(name+"학생의 정보가 삭제되었습니다. ");
		}else if(choice == 2){
			System.out.println("삭제를 취소하셨습니다. ");
			return; // 메서드 종료 
		}
		if(flag == 0) System.out.println("학생이 존재하지 않습니다. ");
	}
	// 등수처리
	void scoreRank() { 
		int rank = 1; 
		System.out.println();
		System.out.println("[학생 성적 등수 처리]");
		System.out.println("------------------------------------------------------");
		for(int i = 0 ; i < list.size(); i++) {
			rank = 1; 
			for(int j = 0; j < list.size(); j++) {
				if(list.get(i).getAvg() < list.get(j).getAvg()) {
					rank++;
				} //if
			}// for j
			list.get(i).setRank(rank);
			// s[i]
		}
		System.out.println("등수처리가 완료되었습니다. ");
		
	}
	// 검색 출력 
	void searchPrint() { 
		System.out.println();
		System.out.println("[학생 검색]");
		boolean flag = false;  // 학생이없으면 0 있으면 1 
		System.out.println("검색을 원하는 학생의 이름을 입력해주세요 ");
		String name = scan.next();
		printTitle();
		for(int i = 0 ; i < list.size(); i++) {
			// i번째 리스트에 있는 학생의 정보중 이름이 내가 입력한name과 같다면 
			// if(list.get(i).getName().equals(name)) {
			// i번째 리스트에 있는 학생의 정보중 이름이 내가 입력한name을 포함한다면
			if(list.get(i).getName().contains(name)) {
				System.out.println(list.get(i));
				flag = true; // 존재하기때문에 1로변경 
			}
		}
		if(flag == false) System.out.println("학생이 존재하지 않습니다. ");
		
	}
	private void printTitle() {
		System.out.println("------------------------------------------------------");
		for(int i = 0 ; i <title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");

	}
}
