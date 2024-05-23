package j0523;

import java.util.Scanner;

public class C0523_07 {
	public static void main(String[] args) {
		// 핸드폰번호를 입력받아 통신회사를 출력해보세요 
		// 011 017 sk
		// 016 018 ktf
		// 019 lg
		// 나머지는 해당사항없음으로 출력 
		// 01099999999
		// 012
		Scanner scan = new Scanner (System.in);
		System.out.println("핸드폰 번호를 입력해주세요 ");
		String phone = scan.next();
		char num = phone.charAt(2);
		switch(num) {
		case '1': case '7':
			System.out.println("SK");
			break;
		case '6': case '8':
			System.out.println("KTF");
			break;
		case '9':
			System.out.println("LG");
			break;
		default:
			System.out.println("해당사항없음");
		
		
		}
		
	}

}
