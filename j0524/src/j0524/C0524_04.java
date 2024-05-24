package j0524;

import java.util.Scanner;

public class C0524_04 {

	public static void main(String[] args) {
		// 반복문 for 
		/*
		  for ( 초기식;조건식;증감식 ){
		  		조건식이 참일때 실행되는 코드들 
		  }
		  
		 */
		
		for(int i = 0 ; i < 3 ; i++ ){
			System.out.println("for문 출력" + i);
		}
		Scanner scan = new Scanner(System.in);
		int n = 0;
		// 숫자를 5번 입력을받아 출력해보세요 
		System.out.println("-----------------");
		for(int i =0; i<5;i++) {
			System.out.println("입력해주세요");
			n = scan.nextInt();
			System.out.println(n);
		}
		// 랜덤한 숫자 (1-45사이)를 6번 출력해보세요 
		System.out.println("----------------");
		for(int i = 0;i<6;i++) {
			int randomnumber= (int)(Math.random()*45)+1;
			System.out.println(randomnumber);
		}
		// 1-20 사이의 숫자를 출력하세요
		// 짝수는 숫자 그대로 홀수는 *로 출력하기 (한줄로)
		// *2*4*6
		for(int i = 1; i<=20; i++) {
			if(i%2==0)	System.out.print(i);
			else System.out.print("*");
		}
		System.out.println();
		System.out.println("더하기를 몇번 반복할지 숫자를 입력해주세요: ");
		int count = scan.nextInt();
		int n1, n2; 
		
		// 입력받은 count만큼 입력받은 n1,n2의 덧셈을해서 결과를 출력하세요
		// count = 2 로 입력을 받는다면
		//  n1: 2, n2: 3 > 출력 : 5
		//  n1: 5, n2: 6 > 출력 : 11
		for(int i = 0 ; i < count ;i++) {
			System.out.println("덧셈을 "+ count +"번 반복합니다 지금은 "+(i+1)+"번째입니다" );
			System.out.println("첫번째 숫자를 입력하세요");
			n1 =scan.nextInt();
			System.out.println("두번째 숫자를 입력하세요");
			n2 =scan.nextInt();
			System.out.println(n1+n2);
			
		}
		
		

	}

}
