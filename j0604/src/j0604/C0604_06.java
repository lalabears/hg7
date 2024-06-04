package j0604;

import java.util.Scanner;

public class C0604_06 {
	/*  클래스 메서드 (static method) 
	    객체생성 없이 클래스이름.메서드명() 으로 호출
	    주로 인스턴스변수나 인스턴스메서드랑 상관없는 작업을함.
	    메서드 내 인스턴스변수는 사용할 수 없음 (클래스변수사용가능)
	*/
	int a;              // 인스턴스 변수 
	static int b = 10;  // 클래스 변수 
	// 인스턴스 변수 사용불가 > static을 붙여 클래스 변수로 선언  
	// 클래스 메서드에서 사용이 가능해짐 
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("학번을 입력해주세요");
		int stuNo = scan.nextInt();
		String name= nameInput();  // 같은 클래스 내에 있다면 클래스명 생략가능
		// 국어점수도 클래스 메서드(korInput())를 만들어서 입력을 받아주세요 
		int kor = korInput();
		// 인스턴스 메서드는 객체를 생성해야지만 사용가능. 인스턴스변수, 인스턴스 메서드
		C0604_06 c = new C0604_06(); 
		int eng = c.engInput(); 
		// 수학점수를 인스턴스 메서드를 사용해서 가져와보세요 
		int math = c.mathInput();
		// 총점을 구하는  클래스 매서드(매개변수 국,영,수) 
		int total = total(kor,eng,math);
		// 평균을 구하는 인스턴스 메서드 (매개변수 총점) 
		double avg = c.avg(total);
		System.out.println(stuNo+name+total+avg);
	}
	static int total(int kor, int eng, int math) {
		return kor+eng+math; 
	}
	double avg(int total) {
		return total/3.0;
	}
	
	
	
	
	// static이 붙어 있으면 클래스 메서드 
	static String nameInput() {
		String name = "홍길동"; // 지역변수  
		System.out.println("이름을 입력해주세요");
		name = scan.next();
		return name;
	}
	// 클래스 메서드 
	static int korInput() { 
		System.out.println("국어점수를 입력해주세요");
		int kor = scan.nextInt();
		return kor;
	}
	
	//인스턴스 메서드 
	int engInput() {
		System.out.println("영어점수를 입력해주세요");
		int eng = scan.nextInt();
		return eng;
	}
	int mathInput() {
		System.out.println("수학점수를 입력해주세요");
		int math = scan.nextInt();
		return math;
	}
	
	

}
