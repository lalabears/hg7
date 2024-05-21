package j0521;

import java.util.Scanner;

public class C0521_09 {
	
	public static void main(String[] args) {
		
		// 산술 연산자 + - * / 
		
		int n1 = 8, n2 = 3; 
		System.out.println(" +  연산자에 의한 결과 " + ( n1 + n2 )  );
		System.out.println(" -  연산자에 의한 결과 " + ( n1 - n2 )  );
		System.out.println(" *  연산자에 의한 결과 " + ( n1 * n2 )  );
		System.out.println(" /  연산자에 의한 결과 " + ( n1 / n2 )  );
		System.out.println(" /  연산자에 의한 결과 " + ( n1 / (double)n2 )  );
		
		// printf로 표현 해보기
		int n3 = 10, n4 = 4;  
		System.out.printf("%d + %d = %d \n", n3,n4,n3+n4);
		System.out.printf("%d - %d = %d \n", n3,n4,n3-n4);
		System.out.printf("%d * %d = %d \n", n3,n4,n3*n4);
		System.out.printf("%d / %d = %.1f \n", n3,n4,(float)n3/(float)n4);
		
		
		// 산술 변환 : 연산전 피연산자의 타입을 일치시킴 
		// 1. 두 피연산자의 타입을 같게 일치시킴(보다 큰 타입으로)
		// 2. 피연산자가 int보다 작을 경우 int로 변함 (byte, short, char)
		// byte -128~127, char 0~6만, short -3만~3만
		System.out.println('a'-'A'); // 32
		//                 97 - 65 = 32
		System.out.println('9'-'3'); // 6 
		//                 57 - 51 = 6 
		
		char a = 'a';
		char d = 'd';
		char zero ='0';
		char seven ='7';
		System.out.printf("%c - %c = %d %n", d, a ,d-a);
		System.out.printf("%c - %c = %d %n", seven, zero ,seven-zero);
		System.out.printf("%c = %d %n", a, (int)a);
		System.out.printf("%c = %d %n", d, (int)d);
		System.out.printf("%c = %d %n", zero, (int)zero);
		System.out.printf("%c = %d %n", seven, (int)seven);
		int an = a + 1; //  97 + 1
		char anc = (char)an; // 'b'
		System.out.printf("%c = %d %n", anc, an); // b = 98
		anc++;
		anc++;
		System.out.println(anc);
		
		
		// % 나머지 연산자 : 피연산자로 나누고 남은 나머지를 반환한다. 
		int number1 = 80; 
		int number2 = 6; 
		System.out.printf("%d를 %d로 나눈 값은 : %.2f \n", 
				number1, number2, (double)number1/ number2);
		System.out.printf("%d를 %d로 나눈 몫 값은 : %d \n", 
				number1, number2, number1 / number2);
		System.out.printf("%d를 %d로 나눈 나머지 값은 : %d \n", 
				number1, number2, number1 % number2);
		
		// 숫자 두개를 입력받아서. nextInt()
		// 두 숫자의 나누기 값, 몫 값, 나머지 값을 출력해보세요 
		Scanner scan = new Scanner(System.in);
		// 1. 변수 선언하기 + 입력받기. 
		int no1, no2;
		double r1; 
		int r2,r3; 
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		no1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		no2 = scan.nextInt();
		// 2. 계산 하기 
		r1  = (double)no1/no2 ; // 나누기
		r2  =  no1/no2 ; // 몫
		r3  =  no1%no2 ; // 나머지
		// 3. 출력하기 
		// 나누기: 13.34 , 몫 : 13 , 나머지 : 2 
		System.out.printf("나누기 : %.2f, 몫 : %d , 나머지 : %d \n", r1,r2,r3);
		// 나누기 : 3.33, 몫 : 3 , 나머지 : 1 
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
