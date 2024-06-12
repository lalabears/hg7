package stuPkg;
import java.util.Scanner;
public class StuCal {
	// 멤버변수들, static (클래스멤버) - 모든객체들이 같은값을가지는 공유하는 
	static Scanner scan = new Scanner(System.in);
	// iv 인스턴스변수 
	Student[] s = new Student[10];
	int kor, eng, math, rank;
	int count = 0 ; // 등록된 학생수는 세어주는 변수 
	String name, sName; 
	
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

	void scoreInput() {
		// 2. 입력  
		System.out.println((count+1)+"번째 학생입력");
		System.out.println("학생의 이름을 입력해주세요(0.취소)");
		name = scan.next();
		if(name.equals("0")) return; // 메서드의 종료는 return
		System.out.println("국어");
		kor = scan.nextInt();
		System.out.println("영어");
		eng = scan.nextInt();
		System.out.println("수학");
		math = scan.nextInt();
		// 객체 배열에 객체를 생성해주어야 함. 
		s[count] = new Student(name, kor, eng, math);
		count++; // 학생 한명의 성적이 입력되어서 count를 1 증가시킴 
	}
	
	void scorePrint() {
		// 1. 출력 
		System.out.println("-------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("-------------------------------------------------");
		for(int i = 0 ; i < count ; i++) {
			s[i].printStuInfo();
			/*System.out.println(s[i].getStuNo()+"\t"+
					s[i].getName());*/
		}
		
	}
	
	void scoreModify() {
		// 4. 수정
		int ck = 0 ; // ck=0 학생 없음, ck = 1 학생있음 
		int no = -1; // 몇번째 배열에 학생이 있는지 저장하기위한변수 
		System.out.println("성적수정할 학생이름: ");
		sName = scan.next();
		for(int i = 0 ; i < count ; i ++) {
			if(s[i].getName().equals(sName)) {
				ck = 1;  no = i; 
			}
		}
		if(ck == 0 ) { //학생이 없다면 
			System.out.println("학생이 존재하지 않습니다");
			return; // 메서드 종료 
		}
		// 학생이 존재한다면. 
		System.out.println(s[no].getName()+"님의 성적을 수정합니다.");
		System.out.println("1.국어 2.영어 3.수학 0.취소");
		choice  = scan.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("현재국어점수: "+s[no].getKor());
			System.out.println("수정할 점수를 입력해주세요 ");
			kor = scan.nextInt(); 
			s[no].setKor(kor);
			break;
		case 0: 
			return; // 메서드 종료 
		}
		// 총점 업데이트
		s[no].reTotal();
		// 평균업데이트
		s[no].reAvg();
		System.out.println("성적수정이 완료되었습니다. ");
		
	}
	
	void scoreRank() {
		// 5. 등수
		for(int i = 0 ; i <count ; i++) {
			rank = 1; 
			for(int j = 0; j<count; j++) {
				
				if(s[i].getAvg() < s[j].getAvg()) {
					rank++;
				} //if
				
			}// for - j
			
			s[i].setRank(rank);
			
		}// for - i
		
		System.out.println("등수처리가 완료되었습니다! ");
	}
	
	void searchPrint() {
		// 3. 검색 -> 검색할 이름을 입력을 받아 객체배열에서 찾아봄 >없으면 없다고 반환 
		int ck = 0 ; // ck=0 학생 없음, ck = 1 학생있음 
		System.out.println("검색할 학생이름: ");
		sName = scan.next();
		System.out.println("-------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("-------------------------------------------------");
		for(int i = 0 ; i < count ; i ++) {
			if(s[i].getName().equals(sName)) {
				ck = 1; 
				s[i].printStuInfo(); 
			}
		}
		if(ck==0) {
			System.out.println("학생이 존재하지 않습니다. ");
		}// if
	}// searchPrint()
	
	
	
}
