package j0523;

import java.util.Scanner;

public class C0523_11 {

	public static void main(String[] args) {
		/*
		0 < = (int)( Math.random()*9) < 9 
		       0 1 2 3 4 5 6 7 8
		       
		0 < = (int)( Math.random()) < 1
		0  <= (int)( Math.random() *10)  < 10  => 0~9 까지 
		0  <= (int)(Math.random()*100) < 100 => 99 까지
		1~45
		0 + 1< =(int)(Math.random()*45) +1 < 45+1
		
		*/
		// (int)( Math.random()* ( 최대값 - 최소값 + 1 ) ) + 최소값 
        // char ch1 = 65;    char ch2 = 90; // Z
		// String str = ""+ch1+ch2;
	
		int r1 = (int)(Math.random()*26)+65;  // 65~90사이 랜덤숫자 
		int r2 = (int)(Math.random()*26)+65;
		int r3 = (int)(Math.random()*26)+65;
		int r4 = (int)(Math.random()*26)+65;
		// 4개를 발생을 시켜서 (A~Z사이의)
		// 4자리 문자열을 만들어 보세요 AVGK	
		// 65 -90 사이의 랜덤한 숫자 발생 
		// 4번 문자로 저장후 문자열로 저장  
		char c1 = (char)(r1);
		char c2 = (char)(r2);
		char c3 = (char)(r3);
		char c4 = (char)(r4);
		String str = ""+c1+c2+c3+c4; 
		System.out.println(str);
		
		
		
		// 주사위 던지기 프로그램
		// 내가 던진 주사위가 (숫자입력받기)
		// 컴퓨터가 던진 주사위 보다
		// 큰 수라면 사용자 승리, 컴퓨터가 더 큰수면 컴퓨터승리 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("주사위숫자를 입력해주세요");
		int user = scan.nextInt();
		int dice = (int)(Math.random()*6)+1;
		// 1 - 6 사이의 랜덤한 숫자 생성 
		if( user - dice > 0 ) {
			System.out.println(dice +"로 당신이 승리하셨습니다.");
		}else if( user - dice < 0 ) {
			System.out.println(dice +"로 당신의 패배입니다. ");
		}else {
			System.out.println("비겼네요 ");
		}
		
		

	}

}
