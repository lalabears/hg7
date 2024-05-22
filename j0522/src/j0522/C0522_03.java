package j0522;

import java.util.Scanner;

public class C0522_03 {

	public static void main(String[] args) {
		/*변수 : 이름, 국, 영, 총점, 평균  
		 
		 이름, 국어, 영어 점수를 입력받아 아래와 같이 출력하세요 
		 출력
		 ------------------------------------
		 이름	국어		영어	   총점		평균
		 ------------------------------------ 
		 홍길동   100     90     190     95.00
		*/
		// 입력은 이름, 국어, 영어 점수를 받는데 모두 문자열로 받는다. 
		Scanner scan = new Scanner(System.in);
		// 1. 변수선언 및 입력받기 
		String name = "홍길동", kor ="100", eng ="90"; 		
		int total = 190;		
		double avg = 95.00;
		System.out.println("이름을 입력해주세요 :");
		name = scan.nextLine();
		System.out.println("국어점수를 입력해주세요 :");
		kor = scan.nextLine();
		System.out.println("수학점수를 입력해주세요 :");
		eng = scan.nextLine(); 
		// 2. 계산하기 
		total = Integer.parseInt(kor) + Integer.parseInt(eng) ; 
		avg = total /2.0; 
		// 3. 출력하기 
		System.out.println("------------------------------------");
		System.out.println("이름\t국어\t영어\t총점\t평균");
		System.out.println("------------------------------------");
		System.out.printf("%s\t%s\t%s\t%d\t%.2f\n", name, kor, eng, total, avg);
		
		
		
		
	}

}
