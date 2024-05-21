package j0521;

import java.util.Scanner;

public class C0521_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		// 1. 문자열을 입력받아서 첫번째글자와 세번째 글자를 출력해주세요
		// hello 를 입력하면 h와 l이 출력이되어야함. 
		
		System.out.println("문자열을 입력해주세요");
		String str = scan.nextLine();
		System.out.printf("1번째 : %c 3번째 : %c", str.charAt(0), str.charAt(2));

		// 2. nextLine으로 숫자 하나를 입력받아 구구단을 출력해보세요 
		System.out.println("숫자 한개를 입력해주세요(한자리만)");
		String num = scan.nextLine();
		// 문자열을 숫자로 바꾸는 방법 
		int n = Integer.parseInt(num); 
		// charAt 사용하는 방법 
		char c = num.charAt(0);
		int cn = c - '0'; 
		System.out.printf("%d*%d=%d\n",n,1,n*1);
		System.out.printf("%d*%d=%d\n",n,2,n*2);
		System.out.printf("%d*%d=%d\n",n,3,n*3);
		System.out.printf("%d*%d=%d\n",n,4,n*4);
		System.out.printf("%d*%d=%d\n",n,5,n*5);
		System.out.printf("%d*%d=%d\n",n,6,n*6);
		System.out.printf("%d*%d=%d\n",n,7,n*7);
		System.out.printf("%d*%d=%d\n",n,8,n*8);
		System.out.printf("%d*%d=%d\n",n,9,n*9);
		
		//  next나 nextline 숫자 두개를 입력받아서 (한글자숫자만) 
		// 두 수의 사칙연산을 출력해보세요 
		// 7 + 2 = 9, 7 - 2 = 5 , 7 * 2 = 14, 7 / 2 = 3.50
		// 변수 선언 
		String a, b; 
		
		// 입력받기 
		System.out.println("첫번째 숫자를 입력해주세요(한자리만)");
		a = scan.nextLine();
		System.out.println("두번째 숫자를 입력해주세요(한자리만)");
		b = scan.nextLine();	
		
		// 계산 
		// 방법1 
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		// 방법2 
		int a2 = a.charAt(0) - '0' ;
		int b2 = b.charAt(0) - '0' ;
		
		System.out.printf("%d + %d = %d \n",a1,b1,a1+b1);
		System.out.printf("%d - %d = %d \n",a1,b1,a1-b1);
		System.out.printf("%d * %d = %d \n",a1,b1,a1*b1);
		System.out.printf("%d / %d = %d \n",a1,b1,a1/b1);
		System.out.printf("%d / %d = %.2f \n",a1,b1,(float)a1/b1);
		
	}

}
