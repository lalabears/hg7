package j0613;
public class Subject {
	// 1. 변수선언
	private int score;
	private String title; 
	// 2. 생성자 
	Subject(){} // 기본생성자 
	Subject(String title){ // 매개변수가 한개인 생성자 
		this.title = title;
	} 
	Subject(String t, int s){ // 매개변수가 한개인 생성자 
		// this.title = t;	this.score = s;
		setTitle(t);
		setScore(s);
	} 
	// 메서드 
	void setTitle(String name) {
		this.title = name;
	}
	// void는 반환값이 없는 경우 사용함 
	void setScore(int jumsu) {
// 3. 점수는 0~100사이의 점수만 입력받아 저장할 수 있어야함
// 범위를 벗어난 값이 매개변수로 입력되면 점수가 잘못입력되엇다고 출력하기
		if( jumsu < 0 || jumsu > 100 ) {
			System.out.println("잘못입력하셨습니다.");
		}else {
			this.score = jumsu; 
		}
	}
	char getGrade() {
		if(this.score >=90 ) return 'A';
		else if(this.score>=80) return 'B';
		else if(this.score>=70) return 'C';
		else if(this.score>=60) return 'D';
		else return 'F';
	}
	boolean equalSubject(String sub) {
		if(this.title.equals(sub)) return true;
		else return false;
	}
	void compScore(int s) {
		if(this.score > s ) System.out.println("객체의 점수가큽니다");
		else if(this.score == s ) System.out.println("두 점수가 같습니다");
		else System.out.println("입력하신 점수가 더 큽니다 ");
	}	

}
