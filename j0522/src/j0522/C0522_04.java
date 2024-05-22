package j0522;

import java.util.Scanner;

public class C0522_04 {
	public static void main(String[] args) {
		// nextline으로 2자리 숫자를 입력받아서 
		// 27 을 입력받는다면 2 와 7의 4칙연산을 출력해주세요
		// 2+7 = 9  2-7 = -5  2*7 = 14  2/7 = 0.2 (소수점1자리까지)
		Scanner scan = new Scanner(System.in);
		// 1. 변수 선언 (입력받기포함)
		String str=""; 
		int n1 = 2, n2 = 7 ; 
		System.out.println("숫자를입력해주세요");
		str = scan.nextLine(); // "27"
		// 2. 계산 (연산)
		// 문자열 > 문자 
		//char c1 = str.charAt(0);  // '2'
		char c2 = str.charAt(1);   // '7'
		// 문자 > 숫자
		n1 = str.charAt(0) - '0';  // 2
		n2 = c2 - '0'; // 7
		
		// 3. 출력 
		System.out.printf("%d + %d = %d \n",n1,n2,n1+n2);
		System.out.printf("%d - %d = %d \n",n1,n2,n1-n2);
		System.out.printf("%d * %d = %d \n",n1,n2,n1*n2);
		System.out.printf("%d / %d = %d \n",n1,n2,n1/n2);
		System.out.printf("%d / %d = %.1f \n",n1,n2,(double)n1/n2);

	}
}
