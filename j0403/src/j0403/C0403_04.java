package j0403;

import java.util.Scanner;

public class C0403_04 {

	public static void main(String[] args) {
		
		// 숫자 두개를 입력받아서 나누기값, 몫값, 나머지 값을 구하세요 
		
		// 1. 변수 선언
		//  1-1. 입력 : n1, n2 (100, 3)
		// 숫자 입력 받기 : scan.nextInt()
		Scanner scan = new Scanner(System.in);
		int n1=10 , n2=10; 
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		n1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		n2 = scan.nextInt();
		
		
		double re1 = (double)n1/n2; // 나누기값
		int re2 = n1/n2; // 몫
		int re3 = n1%n2; // 나머지
		
		
		// 2. 출력
		// 출력 : 나누기 값 : 33.333
		//       몫값 : 33
		//       나머지 값 : 1 
		System.out.printf("%d / %d 나누기값 : %.3f \n",n1,n2,re1);
		System.out.printf("%d / %d 몫값 : %d \n",n1,n2,re2);
		System.out.printf("%d / %d 나머지값 : %d \n",n1,n2,re3);
		
		scan.nextLine()	; // enter
		
		// scan.nextLine()으로 입력받아 
		// 숫자로 변환 후 사용 Integer.parseInt()
		String num1 = scan.nextLine();
		String num2 = scan.nextLine();
		
		int num3 , num4; 
		
		num3 = Integer.parseInt(num1);
		num4 = Integer.parseInt(num2);
		
		System.out.println(num1+num2);
		System.out.println(num3+num4);
		
		

	}

}
