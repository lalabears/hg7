package j0527;

import java.util.Scanner;

public class C0527_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 한글자 알파벳을 입력을 받아 랜덤하게 생성된 알파벳과 비교해서 
		// 정답이 나올때까지 맞추는프로그램을 만들어보세요 
		// 만약 랜덤생성 알파벳이 a 이고 입력한 값이 a면 정답! 
		// 출력하고 while문종료
		// 소문자 97 - 122      대문자 65 - 90 
		// 32의 차이가 존재함 
		// 1. 랜덤한 소문자를 발생시킴. 
		int n =(int)(Math.random()*(122-97+1))+97; //97; 
		char ch = (char)n;   // 소문자 
		char chA = (char)(n-32); // 대문자 
		System.out.println(ch);
		System.out.println(chA);
		// 2. 무한히 입력받아 랜덤문자를 맞추기 
		while(true) {
			System.out.println("알파벳을 입력해주세요");
			String str = scan.next();
			char ch1 = str.charAt(0);
			if( ch1 == ch || ch1 == chA ) {
				System.out.println("정답입니다!!");
				break; 
			}
		}
			
		// 랜덤이 a면, a, A 로 입력했을때 정답이라고 나오게해보기 

	}

}
