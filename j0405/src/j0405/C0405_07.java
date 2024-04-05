package j0405;

import java.util.Scanner;

public class C0405_07 {

	public static void main(String[] args) {
		// 해보세요 
		// 숫자를 하나 입력받아서  -> int, scan.nextint()
		// 100 보다 큰 수 이면서 짝수이면 [짝수], 
		// 100 보다 큰수 이면서 홀수 이면 [홀수]
		// 100 보다 작은수면 [100보다 작음]을 출력해보세요
		
		Scanner scan = new Scanner(System.in);
//		int num; 
//		System.out.println("숫자를입력해주세요 : ");
//		num = scan.nextInt();
		int num = 10001; 
		if(num >= 100) {
			// 100 보다 크면.. 
			if( num % 2 == 0) {
				//짝수이면...
				System.out.println("짝수");
			}else {
				// 홀수이면.. 
				System.out.println("홀수");
			}
			
		}else {
			// 100 보다 작으면..
			System.out.println("100보다 작음");
		}
		
		
		
		// 심화
		// 수식 + , - , * , / 중 하나를 입력받고
		// 숫자 두개를 입력받아서 
		// + 인 경우 n1 + n2 = (n1+n2) 출력 
		// - 인 경우 n1 - n2 = (n1-n2) 출력 
		// * 인 경우 n1 * n2 = (n1*n2) 출력 
		// / 인 경우 n1 / n2 = (n1/n2) 출력 
		
		System.out.print("수식을 입력하세요(+,-,*,/)");
		String cal = scan.nextLine();//수식입력받기
		System.out.print("첫번째 숫자를 입력하세요 >>");
		int n1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요 >>");
		int n2 = scan.nextInt();
		
		if(cal.charAt(0)=='+') {
			System.out.printf("%d+%d=%d \n", n1,n2,n1+n2);
		}else if(cal.equals("-")) {
			System.out.printf("%d-%d=%d \n", n1,n2,n1-n2);
		}else if(cal.equals("*")) {
			System.out.printf("%d*%d=%d \n", n1,n2,n1*n2);
		}else if(cal.equals("/")) {
			System.out.printf("%d/%d=%.2f \n", n1,n2,n1/(double)n2);
		}else {
			System.out.println("수식을 잘못입력하셨습니다");
		}
		
		

	}

}
