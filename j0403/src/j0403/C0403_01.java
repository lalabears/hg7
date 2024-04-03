package j0403;

import java.util.Scanner;

public class C0403_01 {

	public static void main(String[] args) {
		
		// 기본 변수 총 8개가 있다.  
		// boolean, char, byte, short, int, long, float, double
		// String : 문자열 
		
		boolean b = true; //false; 논리
		char ch = '0';
		int number = 10; 
		long number1 = 10000000000000L;
		float number2 = 2.1234f;
		double number3 = 1345.12334656; // 1345.12334656d; 접미사 d가 생략이 가능하다 
		
		// 출력 
		// print 
		// println
		// printf : 형식지정이 가능 ex. 소수점 3자리까지 표현해라 . 
		//            %d : 정수, %f : 실수 , %s : 문자열
		
		System.out.println("줄바꿈이 있는 출력입니다.");
		System.out.print("줄바꿈이 없는 출력입니다.");
		System.out.printf("줄바꿈이 없는 출력입니다.");
		System.out.println();
		
		int year = 2024; 
		String month = "4월";
		int day = 3; 
		System.out.println("오늘은 " +2024+"년 "+"4월 "+3+"일 입니다.");
		System.out.println("오늘은 " +year+"년 "+month+" "+day+"일 입니다.");
		
		System.out.println("내일은 " +year+"년 "+month+" "+day+1+"일 입니다.");
		System.out.println("내일은 " +year+"년 "+month+" "+(day+1)+"일 입니다.");
		System.out.printf("내일은 %d년 %s %d일 입니다. \n",year, month,day+1 );
		
		// 입력 받기 
		// scanner + ctrl + spacebar 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력하세요 >> " );
		String str =  scan.nextLine(); // 문자열을 입력을 받고자 할 경우에는 nextLine(); 
		System.out.println("입력하신 문자열은 : "+str); 
		
		System.out.print("정수를 입력하세요 >> " );
		int n = scan.nextInt(); // 정수를 입력받기
		System.out.println("입력하신 숫자 * 10 은 : "+ (n*10));
		
		System.out.print("실수를 입력하세요 >> " );
		double n1 = scan.nextDouble();
		System.out.println("입력하신 숫자 * 100 은 : "+ (n1*100));
		System.out.printf("입력하신 숫자 * 100 은 : %.3f \n",n1*100);
		

	}

}
