package j0523;

import java.util.Scanner;

public class C0523_10 {

	public static void main(String[] args) {
		// Math.random()은 0과 1사이의 실수를 발생시킨다. 
		/* 
		 1(최소값) 과 10(최대값) 사이의 랜덤한 숫자를 얻으려면 
		 0 <= math.random() < 1
		 * 10   * 10          *10
		 0 <=   10 * Math.random()   < 10  
		 0 <= (int)(Math.random()*10) <10 
		 +1         +1                 +1
		 1 <= (int)(Math.random()*10) + 1 < 11 
		
		 (int)( Math.random()* ( 최대값 - 최소값 + 1 ) ) + 최소값 
		*/
		int r = 0 ; 
		// 1부터 10까지 랜덤 정수값
		r = (int)(Math.random()*10) + 1; 
		// 1부터 100까지 랜덤 정수값
		r = (int)(Math.random()*100)+1;
		// 0부터 9까지 랜덤 정수값
		r = (int)(Math.random()*9);
		// 1부터 50까지 랜덤 정수값
		r = (int)(Math.random()*50)+1 ;
		// 1부터 45까지 랜덤 정수값
		r= (int)(Math.random()*45)+1;
		// 0부터 9999까지 랜덤 정수값
		r = (int)(Math.random()*9999);
		// 1부터 20까지 랜덤 정수값
		r = (int)(Math.random()*20)+1; 
		System.out.println(r);
		// 1-9 숫자 생성시키기 
		// (int)( Math.random()* ( 최대값 - 최소값 + 1 ) ) + 최소값 
		// > 가능하다면  2-8 ( 2,3,4,5,6,7,8 ) 까지의 숫자를 랜덤하게 하나 생성 후. 
		// 숫자를 총 3번 입력받아 정답을 맞추는 프로그램을 만들어보세요 
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*7)+2;  // 2-8 사이의 수 
		System.out.println("첫번째숫자(2-8)");
		int n = scan.nextInt();
		// 정답오답인지 오답인지 출력
		if(n==random) System.out.println("정답");
		else System.out.println("오답");
		
		System.out.println("두번째숫자(2-8)");
		int n1 = scan.nextInt();
		if(n1==random) System.out.println("정답");
		else System.out.println("오답");
		// 정답인지 오답인지 출력
		System.out.println("세번째숫자(2-8)");
		int n2 = scan.nextInt();
		if(n2 == random) System.out.println("정답");
		else System.out.println("오답");
		// 정답인지 오답인지 출력 
		
		// 정답은 00 이엇습니다
		System.out.println("정답은 : "+random );
		
	
	}

}
