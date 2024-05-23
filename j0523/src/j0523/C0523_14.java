package j0523;
import java.util.Scanner;
public class C0523_14 {
	public static void main(String[] args) {
		/* 숫자 하나를 입력받아 ( switch를사용해서  )
		1일때는 :  1-10까지의 숫자를 출력해주기 
		2일때는 :  안녕하세요 5번 출력해주기
		3일때는 :  1-20사이의 짝수 출력해주기
		4일때는 :  1-100사이의 랜덤한숫자 5개 출력해주기 
		나머지 숫자가 입력되면 잘못입력하셧습니다 
		*/
		Scanner scan = new Scanner (System.in);
		System.out.println("숫자를 입력해주세요");
		int n = scan.nextInt();
		if(n == 1) {
			for(int i = 0 ; i <10 ; i++ ) 
				System.out.println(i+1);
		}
		else if( n ==2 ) {
			for(int i = 0 ; i < 5 ; i ++) {
				System.out.println((i+1)+"안녕하세요");
			}
		}
		else if (n==3) {
			for (int i = 1 ; i <=20 ; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}
		else if( n==4 ) {
			for (int i = 0 ; i < 5 ; i ++) {
				System.out.println((int)(Math.random()*100)+1);
			}
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
		switch(n) {
		case 1: // 1-10까지의 숫자를 출력해주기 
			for(int i = 0 ; i <10 ; i++ ) 
				System.out.println(i+1);
			break;
		case 2: // 안녕하세요 5번 출력해주기
			for(int i = 0 ; i < 5 ; i ++) {
				System.out.println((i+1)+"안녕하세요");
			}
			break; 
		case 3: // 1-20사이의 짝수 출력해주기
			for (int i = 1 ; i <=20 ; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
			break;
		case 4: // 1-100사이의 랜덤한숫자 5개 출력해주기 
			for (int i = 0 ; i < 5 ; i ++) {
				System.out.println((int)(Math.random()*100)+1);
			}
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		} // switch 

	}// main

}// class
