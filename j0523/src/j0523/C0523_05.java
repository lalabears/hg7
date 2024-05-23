package j0523;

import java.util.Scanner;

public class C0523_05 {
	public static void main(String[] args) {
		// 문자를 입력받아 모음이면 (a, e, i , o, u)
		// [ a는 모음입니다 ] 라고 출력
		// 나머지는 [자음입니다] 라고 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력해주세요");
		String ch = scan.next();
		switch (ch) {
		case "a": case "e": case "i": case "o": case "u":
			System.out.println(ch+"는 모음입니다");
			break;
		default:
			System.out.println(ch+"는 자음입니다");
		}
		
		System.out.println("char 버전");
		char ch2 = ch.charAt(0);
		switch (ch2) {
		case 'a': case 'e': case 'i': case 'o': case 'u':
			System.out.println(ch+"는 모음입니다");
			break;
		default:
			System.out.println(ch+"는 자음입니다");
		}
		
		

	}

}
