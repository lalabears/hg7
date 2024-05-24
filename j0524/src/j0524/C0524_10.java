package j0524;

import java.util.Scanner;

public class C0524_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int input = 0; 
		int n1=0,n2=0,sum=0;
		loop: while(true) {
			System.out.println("1. + ");
			System.out.println("2. - ");
			System.out.println("3. * ");
			System.out.println("4. / ");
			System.out.println("원하시는 것을 선택해주세요(종료 0):");
			input = scan.nextInt();
			
			switch(input) {
			case 1:
				System.out.println("더하기");
				System.out.println("숫자를 입력해주세요 >> ");
				n1 = scan.nextInt();
				n2 = scan.nextInt();
				System.out.printf("%d+%d=%d\n",n1,n2,n1+n2);
				break;
			case 2:
				System.out.println("빼기");
				System.out.printf("%d-%d=%d\n",n1,n2,n1-n2);
				break;
			case 3:
				System.out.println("곱하기");
				System.out.printf("%d*%d=%d\n",n1,n2,n1*n2);
				break;
			case 4:
				System.out.println("나누기");
				System.out.printf("%d/%d=%.2f\n",n1,n2,n1/(float)n2);
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				break loop;
			}
			
		}
		

	}

}
