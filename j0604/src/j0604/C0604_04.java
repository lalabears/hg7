package j0604;

import java.util.Scanner;

public class C0604_04 {

	public static void main(String[] args) {
	// Score 클래스 사용 
		Scanner scan = new Scanner(System.in);
		// 객체 생성해서 테스트해보기 
		Score stu1 = new Score(); 
		stu1.name ="홍길동";
		stu1.total = 69;
		stu1.printStu();
		System.out.println(stu1.pass());
		// 3명의 학생의 이름과 점수(js, db) 를    > 배열이 필요 
		// 입력받아 합격인지 불합격인지 출력
		int[] a = new int[3];
		Score[] stus = new Score[3]; // 객체를 담을 배열 선언 및 생성
		for(int i = 0 ; i< stus.length;i++ ) {
			stus[i] = new Score(); // 객체 생성 
			stus[i].name = scan.next();
			stus[i].js = scan.nextInt();
			stus[i].db = scan.nextInt();
		}
		for(int i = 0 ; i< stus.length;i++ ) {
			System.out.println(stus[i].name + "님 "+ stus[i].pass());
		}
		
		
		
		
		
		
		

	}

}
