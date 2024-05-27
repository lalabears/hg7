package j0527;
import java.util.Scanner;
public class C0527_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 무한반복 : while(true) 사용하면됨 , switch문을 사용해서 
		while(true) {
			System.out.println("[사칙연산 프로그램]");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("원하는 번호를입력해주세요(종료:0)");
			int choice = scan.nextInt();
			if (choice == 0 ) break;  // 0을 입력하면 무한루프종료
			System.out.println("연산할 첫번째 숫자를 입력해주세요");
			int n1 = scan.nextInt();
			System.out.println("연산할 두번째 숫자를 입력해주세요");
			int n2 = scan.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("더하기연산");
				System.out.printf("%d+%d=%d\n",n1,n2,n1+n2);
				break;
			case 2: 
				System.out.println("빼기연산");
				System.out.printf("%d-%d=%d\n",n1,n2,n1-n2);
				break;
			case 3: 
				System.out.println("곱하기연산");
				System.out.printf("%d*%d=%d\n",n1,n2,n1*n2);
				break;
			case 4: 
				System.out.println("나누기연산");
				System.out.printf("%d*%d=%.2f\n",n1,n2,n1/(double)n2);
				break;
			default:
				System.out.println("숫자를 잘못입력하셨습니다. 다시선택해주세요");
			}
		
		}
		
	}

}
