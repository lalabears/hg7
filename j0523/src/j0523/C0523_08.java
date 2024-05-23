package j0523;

import java.util.Scanner;

public class C0523_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 계산기를 만들어보세요
		// 숫자 두개와 연산 한개를 입력받아 
		// 두 숫자의 연산을 출력해보세요 
		// ex) 8, 5, + 를 입력받으면 8 + 5 = 13 을 출력
		// 8, 5, / 를 입력받으면 8 / 5 = 1.60 을 출력
		System.out.println("첫번째숫자를 입력해주세요");
		int n1 = scan.nextInt();
		System.out.println("두번째숫자를 입력해주세요");
		int n2 = scan.nextInt();
		scan.nextLine(); // enter key 값넣는 용
		System.out.println("사칙연산자를 입력해주세요(+-*/)");
		String cal = scan.nextLine();
		switch(cal) {
		case "+":
			System.out.printf("%d+%d=%d \n",n1,n2,n1+n2);
			break;
		case "-":
			System.out.printf("%d-%d=%d \n",n1,n2,n1-n2);
			break;
		case "*":
			System.out.printf("%d*%d=%d \n",n1,n2,n1*n2);
			break;
		case "/":
			System.out.printf("%d/%d=%.2f \n",n1,n2,n1/(float)n2);
			break;
		default:
			System.out.println("연산자를 잘못입력하셧습니다.");
		}
		
		// ++ 하고싶은 분들만하세요
		// 문자열로 8-5 를 입력받아  8 - 5 = 3 을 출력
		
		String str="8-5";
		int n3 = str.charAt(0)-'0'; //8
		int n4 = str.charAt(2)-'0'; //5
		char c1 = str.charAt(1); //5
		
		// 문자열로 8/5 를 입력받으면 8 / 5 = 1.60 을 출력
		
		int score = 91;
		if(score >= 90) System.out.println("A");
		
		switch(score) {
		case 100: case 99: case 98: case 97: case 96:
		case 95: case 94: case 93: case 92: case 91: case 90:
			System.out.println("A");
		
		}

	}

}
