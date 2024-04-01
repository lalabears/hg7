package j0401;

import java.util.Scanner;

public class C0401_07 {

	public static void main(String[] args) {
		// 1. 숫자 1개를 입력받아서
		// 구구단 (*5) 출력해주세요 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 >> ");
		int n = scan.nextInt();
		
		System.out.printf(" %d * %d = %d \n",n, 1, (n*1));
		System.out.printf(" %d * %d = %d \n",n, 2, (n*2));
		System.out.printf(" %d * %d = %d \n",n, 3, (n*3));
		System.out.printf(" %d * %d = %d \n",n, 4, (n*4));
		System.out.printf(" %d * %d = %d \n",n, 5, (n*5));
		// n = scan.nextInt();
		// 8 * 1 = 8
		// 8 * 2 = 16 .... 
		// 8 * 5 = 40 
		
		
		// 2. 숫자 2개를 입력받아 사칙연산을 출력해보세요 
		// n1 = 5, n2 =2
		// 5 + 2 = 7
		// 5 - 2 = 3
		// 5 * 2 = 10 
		// 5 / 2 = 2.5  정수/정수 = 정수 
		// 형변환 (double)n1/n2 실수/정수 = 실수
		
		int n1, n2 ; 
		System.out.print("첫번째 숫자를 입력하세요 >> ");
		n1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요 >> ");
		n2 = scan.nextInt();
		
		System.out.printf(" %d + %d = %d \n",n1, n2, (n1+n2));
		System.out.printf(" %d - %d = %d \n",n1, n2, (n1-n2));
		System.out.printf(" %d * %d = %d \n",n1, n2, (n1*n2));
		System.out.printf(" %d / %d = %.2f \n",n1, n2, (n1/(double)n2));
		
		

	}

}
