package j0523;

import java.util.Scanner;

public class C0523_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str="";
		// if: 점수를 입력받아 90점이상 A, 80점이상 B, 70점이상 C, 60점이상 D, 그외 F
		// 삼항식으로 입력받은 점수가90점이상이면 A 그외면 그외라고 출력 
		System.out.println("점수를 입력해주세요 ");
		int score = scan.nextInt();
		if (score>=90) System.out.println("A");
		else if(score>=80) System.out.println("B");
		else if(score>=70) System.out.println("C");
		else if(score>=60) System.out.println("D");
		else System.out.println("F");
		
		String grade = (score>=90) ? "A" : 
			           (score>=80) ? "B" : 
			           (score>=70) ? "C" :
			           (score>=60) ? "D" : "F" ;
		
		
		System.out.println("사랑이 영어로 무엇일까요 ? ");
		// love를 입력받으면 정답입니다. 그 외에는 오답입니다를 출력해보세요 
		str = scan.next();
		if( str.equalsIgnoreCase("love") ) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		
		
		
		
		
		// 문자를 두글자 이상 입력받아서 ex: 9a12 라고 입력받는다면
		// 첫번째 글자는 숫자입니다 두번째 글자는 영문자입니다 
		// 라고 앞에 두 글자만 문자인지 숫자인지 출력해보세요
		// 982 > 첫번째글자는 숫자입니다. 두번째글자는 숫자입니다. 
		// abc > 첫번째글자는 영문자입니다. 두번째글자는 영문자입니다. 
		
		System.out.println("두글자이상의 영문자와숫자를 입력해주세요 ");
		str = scan.next();         // "9a12"
		char c1 = str.charAt(0);   // '9' 
		char c2 = str.charAt(1);   // 'a'
		
		if ( '0'<=c1 && c1<='9' ) {
			System.out.println("첫번째 글자는 숫자입니다.");
		} else if ( ('a'<=c1 && c1<='z') || ('A'<=c1 && c1<='Z') ){
			System.out.println("첫번째 글자는 영문자입니다.");
		}
		
		if ( '0'<=c2 && c2<='9' ) {
			System.out.println("두번째 글자는 숫자입니다.");
		}else if ( ('a'<=c2 && c2<='z') || ('A'<=c2 && c2<='Z') ){
			System.out.println("두번째 글자는 영문자입니다.");
		}
		
		
		
		// 알파벳 x나 X를 입력하면은 프로그램을 종료합니다 라고 출력해보기
		System.out.println("프로그램을 종료하고싶으시면 x를 입력하세요 ");
		str = scan.next(); // "x"
		char ch = str.charAt(0); 
		if ( ch == 'X' || ch == 'x') 
			System.out.println("프로그램을 종료합니다");
		
		
	}

}
