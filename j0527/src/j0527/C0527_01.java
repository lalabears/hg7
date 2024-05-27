package j0527;

import java.util.Scanner;

public class C0527_01 {

	public static void main(String[] args) {
		/* 변수 : 총 8가지 기본형 
		논리형 : boolean
		문자형 : char 
		정수형 : byte short int long
		실수형 : float double
		
		크기: double > float > long > int > 나머지
		*/
		boolean b1 = true ; // true, false 만 올 수 있음. 
		char c1 = ' '; // 작은 따옴표 , 아무것도 입력하지 않으면 오류(공백필수)
		char c2 = 'A'; // 한글자만 올 수 있음
		char c3 = 97 ; // 숫자로 초기화되어도 유니코드에서 해당값을 읽어 캐릭터로 저장
		int n1 = 21; // 21억정도까지 표현 할 수 있는 기본 정수 
		long n2 = 10000000000l; // 크기가 큰 정수를 저장할 수 있음 접미사 l, L
		float n3 = 3.1234f; // 접미사 f, F를 붙여서 사용할 수 있는 실수 
		double n4 = 45.1234; // 접미사 d, D 가 생략이 가능한 실수 
		//+ 참조변수형 string 
		String str1 ="";//큰따옴표 사용. 빈공간으로사용이가능
		String str2 = "문자열을 입력할 수 있다."; 
		/* 조건문 if, switch 
		 if(조건식1){
		 	조건식1이 참일때 실행되는 코드 
		 }else if(조건식2){
		 	조건식2가참일때 실행되는 코드 (조건식1을 만족하지않음)
		 }else{
		 	조건식1, 조건식2가 거짓일때 실행되는 코드
		 }
		 - 여러개의 else-if를 사용할 수 있으며
		 - else-if, else문은 필요없다면 사용하지 않아도됨. 
		 - if문의 조건식의 결과는 항상 true / false 
		 
		 switch(조건값){
		 case 조건값1:
		 	조건값==조건값1일때 실행되는 코드들
		 	break;  
		 case 조건값2: case 조건값3:
		 	조건값 == 조건값2 이거나 조건값 == 조건값3 일때 실행되는 코드들
		 	break;
		 default:
		 	조건값이 어떠한 case와도 일치하지 않을때 실행 
		 }
		 - switch 문에서 break를 만나면 switch문 종료
		 - default (if문의 else에 해당. ) 어떤 케이스와도 일치하지 않을때 실행
		 - case문의 조건값으로는 정수, 상수, 문자열 이 올 수 있음. 
		*/
		// 문자를 입력받아 숫자인지 영소문자인지, 영대 문자인지 알아보는 프로그램. 
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 한글자를 입력해주세요 ");
		String str = scan.next();
		char ch = str.charAt(0);
		if ('0'<=ch && ch <='9') {
			System.out.println("숫자입니다");
		}else if('A'<= ch && ch <='Z') {
			System.out.println("대문자입니다");
		}else if('a' <= ch && ch <= 'z') {
			System.out.println("소문자입니다");
		}else {
			System.out.println("그 외의 문자입니다. ");
		}
		
		if(Character.isDigit(ch)) {
			System.out.println("숫자입니다");
		}else {
			System.out.println("숫자가아닙니다");
		}
		switch(ch) {
		case '0': case '1': case '2': case '3': case '4':
		case '5': case '6': case '7': case '8': case '9':
			System.out.println("숫자입니다");
			break;
		default:
			System.out.println("숫자가아닙니다");
		}
		// Math.round() :반올림   Math.ceil():올림   Math.floor() : 버림 
		double n = 192.5273;
		// 소수점 첫번째 자리에서 반올림, 올림, 버림 
		System.out.println("반올림 : " + Math.round(n));
		System.out.println("올림 : " + Math.ceil(n));
		System.out.println("버림 : " + Math.floor(n));
		// 10의자리에서 반올림 : 10의 자리를 소수점 첫째자리로 만든 후 반올림 > 원상복구 
		System.out.println(	(int)(Math.round(n/100.0)*100) ); // 200 
		// 소수점 둘째 자리에서 반올림
		// 소수점 둘째자리를 소수점 첫째자리로 만든다 > 원상복귀시킨다. 
		System.out.println(  Math.round( n * 10 ) / 10.0  );
		// 소수점 세째 자리에서 버림 
		// (int)를 사용해서 실수를 정수로 바꾸면서 소수점 업애기 
		// 소수점 세째자리를 소수점 첫자리로 만든 후 int로 형변환(소수점제거) 원상복귀
		System.out.println( (int)(n*100)/100.0   );
		// 0<= Math.random() <1 
		// 0에서부터 1 사이의 실수를 랜덤하게 발생시킴. 
		System.out.println(Math.random()); System.out.println(Math.random());
		System.out.println(Math.random()); System.out.println(Math.random());	
		double rand = Math.random();
		System.out.println(rand); System.out.println(rand); System.out.println(rand);
		// 1 - 10 사이의 랜덤한 정수 발생 
		// 1 <= (int)(Math.random()*10)+1 < 11
		System.out.println((int)(Math.random()*10)+1);
		// 1- 45 사이의 랜덤한 정수를 발생 
		System.out.println( (int)(Math.random()*45)+1   );
		// 1- 6 사이의 랜덤한 정수 발생 
		System.out.println( (int)(Math.random()*6) +1  );
		// 97 - 122 사이의 랜덤한 정수발생
		System.out.println( (int)(Math.random()*(122-97+1) )+97 );
		// (int)(Math.random()*(최대값-최소값+1)) + 최소값
		
		
		
		
		
		
		
		
		
		
	}

}
