package j0524;
import java.util.Scanner;
public class C0524_02 {
	public static void main(String[] args) {
		// 조건문(if, switch)을 사용해서 
		/* 글자한개를 입력받아 
		숫자면 숫자 , 영문자이면 영문자라고 출력하는데  > if문
		만약 영문자이고 모음이면 모음 자음이면 자음이라고 출력해보기 -> switch문
		0을 입력 > 숫자입니다
		a를 입력 > 영문자이며 모음입니다 (aeiou)
		B를 입력 > 영문자이며 자음입니다 
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력해주세요(한글자)");
		String str = scan.next();  // "a"
		char ch = str.charAt(0); // string > char   'a'   
		
		if ( '0' <= ch && ch <='9') {
			System.out.println("숫자입니다");
		}else if ( ('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z') ) {
			     // 소문자               이거나       대문자
			// 영문자 
			System.out.print("영문자이며 ");
			switch(ch) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
			case 'A': case 'E': case 'I': case 'O': case 'U':
				System.out.println("모음입니다");
				break;
			default:
				System.out.println("자음입니다");
			}
			
			
			
		}
		
		
		
	}

}
