package j0523;

import java.util.Scanner;

public class C0523_06 {

	public static void main(String[] args) {
		// 주민등록 번호를 입력받아 
		// 남성이면 남성, 여성이면 여성, 
		// 그 외는 잘못입력하셨습니다
		// 라고 출력을 해보세요 
		// 둘리 :  830422-1185600
		//        040601-4118560
		//        01234567
		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록 번호를 입력하세요(830422-1185600): ");
		String jumin = scan.next();
		char gender = jumin.charAt(7);
		switch(gender) {
		case '1': case '3':
			System.out.println("남성");
			break;
		case '2': case '4':
			System.out.println("여성");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		
		// 숫자로 하고싶다면 ? 
		int gen = gender - '0'; 
		switch(gen) {
		case 1: case 3:
			System.out.println("남성");
			break;
		case 2: case 4:
			System.out.println("여성");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		

	}

}
