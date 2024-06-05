package j0605;

import java.util.Scanner;

public class C0605_11 {

	public static void main(String[] args) {
	// Cal2, Stu 클래스 사용 	
		Cal2 c = new Cal2(10,5);
		System.out.println(c.addResult);
		System.out.println(c.subResult);
		System.out.println(c.mulResult);
		System.out.println(c.divResult);
		
		Cal2 c2 = new Cal2();
		System.out.println(c2.addResult);
		System.out.println(c2.subResult);
		System.out.println(c2.mulResult);
		System.out.println(c2.divResult);
		// Stu 클래스를 만들어서 자동으로 평균, 합계까지 초기화 해 보세요 
		// 입력:  이름,국,영,수
		
		Stu s = new Stu("홍길동",100,100,100);
		s.printAttr();
		// 홍길동 100 100 100 300 100.00
		Stu s1 = new Stu();
		s1.name = "유관순";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 100; 
		
		Scanner scan =new Scanner(System.in);
		// 학생 5명을 담는 배열을 생성해서 
		// 각각의 정보를 입력받아서 객체를 생성해서 
		// printAttr 메서드를 통해서 5명의 정보를 출력해보세요 
		// 객체 배열 생성 
		int[] num = new int[5];  // num 배열의 주소값
		Stu[] students = new Stu[5]; // students 배열의 주소값
		
		String name;
		int kor, eng, math; 
		for(int i = 0 ; i<students.length;i++) {
			// 객체를 생성 
			// Stu s = new Stu("홍길동",100,100,100);
			System.out.println((i+1)+"이름을입력해주세요");
			name = scan.next();
			System.out.println("국어점수를입력해주세요");
			kor = scan.nextInt();
			System.out.println("영어점수를입력해주세요");
			eng = scan.nextInt();
			System.out.println("수학점수를입력해주세요");
			math = scan.nextInt();
			// 객체를 생성 
			students[i] = new Stu(name,kor,eng,math);
		}
		
		// 출력 
		for(int i = 0 ; i<students.length;i++) {
			students[i].printAttr();
		}
		
		
		
		
		
	}

}
