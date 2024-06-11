package stupkg;
import java.util.Scanner;
public class StuCal {
	// cv 로 선언 
	static Scanner scan = new Scanner(System.in);
	static String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	// iv로 선언 
	// 객체배열 선언 및 생성 
	Student[] s = new Student[10] ;
	String name,sName;
	int kor, eng, math, total, rank;
	double avg; 
	int count, choice ; 
	// 1. 화면 출력 메서드 
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
	
	// 2. 성적 입력 메서드 
	void scoreInput() {
		System.out.println("성적입력입니다 ");
		System.out.printf("%d번째 학생의 이름을 입력해주세요(0.이전페이지이동) \n",
				count+1);
		name = scan.next();
		if(name.equals("0")) {
			System.out.println("이전페이지로 이동합니다");
			return; 
		}
		System.out.println("국어점수를 입력해주세요 ");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력해주세요 ");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력해주세요 ");
		math = scan.nextInt();
		// 객체 배열 : s
		// new Student(매개변수) 생성자를 사용해서 객체 생성 
		s[count] = new Student(name,kor,eng,math);
		System.out.printf("%d명 입력이 완료되었습니다\n",count+1);
		count++; // 학생 1명 입력 완료후 증가 	
	} // scoreInput
	// 3. 학생성적 출력 메서드 
	void scorePrint() {
		System.out.println("학생성적 출력 ");
		System.out.println("-------------------------------------------------");
		for(int i = 0; i < title.length; i ++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println(); 
		System.out.println("-------------------------------------------------");
		for(int i = 0 ; i<count ; i++) {
			s[i].printStuInfo();
		}
	} // scorePrint()
	void searchPrint() {
		int flag = 0 ; // 학생이 존재하면1, 없으면 0  
		System.out.println("학생 검색 출력");
		System.out.println("검색할 학생의 이름을 입력해주세요 ");
		sName = scan.next();
		System.out.println("-------------------------------------------------");
		for(int i = 0; i < title.length; i ++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println(); 
		System.out.println("-------------------------------------------------");
		for(int i = 0 ; i < count ; i ++) {
			if(s[i].getName().equals(sName) ) {
				s[i].printStuInfo(); // 학생정보출력
				flag = 1; 
			}
		}
		if(flag == 0 ) {
			System.out.println("학생이 존재하지 않습니다. ");
		}
	} // searchPrint()
	void scoreModify() {
		int   flag = 0,      no=0; 
		// 학생의 유무 변수, 학생이 몇번째배열에 있는지 저장하는 변수 
		System.out.println("학생 성적 수정");
		System.out.println("성적을 수정할 학생의 이름을 입력해주세요 ");
		sName = scan.next();
		for(int i = 0 ; i< count ; i ++) {
			if(s[i].getName().equals(sName)) {
				System.out.printf("%s학생이 검색되었습니다!!\n",s[i].getName());
				no = i; // i번째 학생이 존재하기때문에 no에 i값을 넣음 
				flag = 1; // 학생이 존재하기때문에 flag에 1을 넣음 
			}
		}
		if(flag == 0 ) {
			System.out.println("해당학생이 존재하지 않습니다. 다시 검색해주세요 ");
			return; // 메서드 종료 
		}
		System.out.printf("%s의 학생 성적 수정\n", s[no].getName());
		System.out.println("1. 국어점수");
		System.out.println("2. 영어점수");
		System.out.println("3. 수학점수");
		System.out.println("0. 수정취소");
		System.out.println("------------------------");
		System.out.println("수정할 과목을 선택해주세요 ");
		choice = scan.nextInt();
		switch(choice) {
		case 1: // 1. 국어점수
			System.out.printf("현재 국어점수 : %d \n",s[no].getKor());
			System.out.println("수정할 점수를 입력해주세요 ");
			kor = scan.nextInt();
			s[no].setKor(kor);
			// 총점, 평균도 업데이트 해야함. 
			break;
		case 2: // 2. 영어점수
			System.out.printf("현재 영어점수 : %d \n",s[no].getEng());
			System.out.println("수정할 점수를 입력해주세요 ");
			eng = scan.nextInt();
			s[no].setEng(eng);
			// 총점, 평균도 업데이트 해야함. 
			break;
		case 3: // 3. 수학점수
			System.out.printf("현재 수학점수 : %d \n",s[no].getMath());
			System.out.println("수정할 점수를 입력해주세요 ");
			math = scan.nextInt();
			s[no].setMath(math);
			// 총점, 평균도 업데이트 해야함. 
			break;
		case 0:
			System.out.println("수정이 취소되었습니다.");
			return;  // 수정 메서드 종료 
		} // switch
		s[no].reTotal();
		s[no].reAvg();
		System.out.println("점수 수정이 완료되었습니다. !!");
	} // scoreModify
	
	void scoreRank() {
		System.out.println("등수 처리");
		int rank ; 
		for(int i = 0; i < count ; i++ ) {
			rank = 1 ; 
			for(int j = 0 ; j < count ; j++) {
				if(s[i].getTotal() < s[j].getTotal()) {
					rank++;
				} // if
			}// for - j 
			s[i].setRank(rank);
		}// for -i 
		System.out.println("등수 처리가 완료되었습니다 ! ");
		
	} // scoreRank

} // StuCal
