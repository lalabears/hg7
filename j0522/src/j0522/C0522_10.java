package j0522;

import java.util.Scanner;

public class C0522_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자 세개를 입력받아 가장 큰 수를 출력해보세요 
		int n1=5,n2=10,n3=2;
		int result = 10; 
		System.out.println("첫번째점수를입력해주세요");
		n1 = scan.nextInt();
		System.out.println("두번째점수를입력해주세요");
		n2 = scan.nextInt();
		System.out.println("세번째점수를입력해주세요");
		n3 = scan.nextInt();
		// 점수 세개를 입력받아서 
		// 과락이 존재함 과목 중 하나라도 40점 이하면 불합격
		// 세과목의 평균이 60점이하면 불합격
		// 합격 
		double avg = (n1+n2+n3)/3 ;
		if ( n1 <40 || n2 <40 || n3 < 40 || avg < 60 ) {
			System.out.println("불합격");
		}else {
			System.out.println("합격");
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		// 1. n1이 n2보다크고 n3보다크면 result는 n1 
		if (n1 >= n2 && n1 >= n3 ) result = n1; 
		// 2. n2가 n1보다크고 n3보다 크면 result는 n2
		if ( n2> n1 &&  n2 >= n3 ) result = n2 ;
		// 3. n3이 n1보다 크고 n2보다크면 result는 n3 
		if (n3>n1 && n3>n2) result = n3; 
		
		System.out.println("가장 큰 수는 : " + result);
	}

}
