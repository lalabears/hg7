package j0520;
import java.util.Scanner;
public class C0520_11 {
	public static void main(String[] args) {
		// 숫자 한개를 입력 받아 (8)을 입력받으면 
		// 구구단을 출력해보세요 ( * 3까지만 ) 
		// 8 * 1 = 8 
		// 8 * 2 = 16
		// 8 * 3 = 24
		Scanner scan = new Scanner(System.in); //입력을 위해서 스캐너를 사용해야함.  
		System.out.println("숫자를 입력해주세요 ");
		int n = scan.nextInt(); 
		System.out.printf("%3d  *%3d  =%3d \n" , n, 1, n*1);
		System.out.printf("%3d  *%3d  =%3d \n" , n, 2, n*2);
		System.out.printf("%3d  *%3d  =%3d \n" , n, 3, n*3);
		
		System.out.println(n+" * "+4+" = "+(n*4));
		
		// 숫자 두개를 입력 받아서 사칙연산을 출력해보세요 
		// n1, n2  [ n1이 5, n2가 3 이면 ]
		// 5 + 3 = 8
		// 5 - 3 = 2
		// 5 * 3 = 15
		// 5 / 3 = 1 ( 5 / 3 = 1.67 로 출력해보세요 ) 
		System.out.println("첫번째 숫자를 입력해주세요 ");
		int n1 = scan.nextInt(); 
		System.out.println("두번째 숫자를 입력해주세요 ");
		int n2 = scan.nextInt();
		
		System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
		System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
		System.out.println(n1 + " / " + n2 + " = " + ((float)n1/n2));
		
		System.out.printf("%d + %d = %d \n",n1,n2, n1+n2 );
		System.out.printf("%d - %d = %d \n",n1,n2, n1-n2 );
		System.out.printf("%d * %d = %d \n",n1,n2, n1*n2 );
		System.out.printf("%d / %d = %d \n",n1,n2, n1/n2 );
		System.out.printf("%d / %d = %.2f \n",n1,n2, (double)n1/n2 );
		

		// 국어 영어 수학 점수를 입력받아서 100 99 99 를입력한다고 한다면.
		// [홍길동님의 평균은 99.3 입니다] 로 출력해보세요
		String name = "홍길동"; 
		System.out.println("국어점수를입력해주세요");
		int kor = scan.nextInt();
		System.out.println("영어점수를입력해주세요");
		int eng = scan.nextInt();
		System.out.println("수학점수를입력해주세요");
		int math = scan.nextInt();
		
		double avg = (kor+eng+math)/3.0; 
		
		System.out.printf("%s님의 평균은 %.1f 입니다",name, avg );
		System.out.printf("%s님의 평균은 %.1f 입니다",name, (kor+eng+math)/3.0 );
		
		
		/*
		// 변수 kor 100 eng 100 math 99 이라고 선언 후 
		int kor1 = 100, eng1 = 100, math1 = 99; 
		int total1 = kor1+eng1+math1; 
		double avg1 = (double)total1/3;
		System.out.printf("[합계 : %d, 평균 : %.2f] \n", total1, avg1 );
				
		
		
		*/

	}

}
