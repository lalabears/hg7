package j0403;

import java.util.Scanner;

public class C0403_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 해보세요 
		// 1.
		// 입력: 문자열1개
		// 출력: 제 이름은 홍길동 입니다. 
		System.out.print("이름을 입력해주세요 : ");
		String name ; 
		name = scan.nextLine();
		System.out.printf("제 이름은 %s 입니다. \n",name);
		
		// 2.
		// 입력 : 숫자1개  (ex. 4)
		// 출력 : 저는 4월을 가장 좋아합니다
		System.out.print("숫자를 입력해주세요 : ");
		int month = scan.nextInt();
		System.out.printf("저는 %d월을 가장 좋아합니다 \n", month);
		
		
		// 3. 
		// 입력 : 숫자 2개 (10 3)
		// 출력 : 
		//  10 + 3 = 13
		//  10 - 3 = 7
		//  10 * 3 = 30
		//  10 / 3 = 3.3
		
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int n1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int n2 = scan.nextInt();
		
//		System.out.println(n1 +","+ n2);
		System.out.printf("%d + %d = %d \n",n1,n2,n1+n2);
		System.out.println(n1+" - " +n2+" = "+(n1-n2));
		System.out.printf("%d * %d = %d \n",n1,n2,n1*n2);
		System.out.printf("%d / %d = %.1f \n",n1,n2,(double)n1/n2);
		
		
		
		
		
		
		

	}

}
