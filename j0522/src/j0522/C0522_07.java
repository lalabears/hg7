package j0522;

import java.util.Scanner;

public class C0522_07 {

	public static void main(String[] args) {
		// 조건문 (if)
		/*
		   조건식을 만족할때만 { } 을 수행 0~1번 수행됨 
		   즉, 조건식이 참일때만 수행 
		   if ( 조건식 )
		   {
		   		조건식을 만족할때 실행되는 코드들 
		   } 
		    -조건식의 연산결과는 참 or 거짓이 와야함. 
		    -여러문장을 하나로 묶기위해 { } 블럭을 지정함. 
		    -코드의 가독성을 위해 한칸 들여쓰기를 권함. 
		    -실행코드가 한줄일때는 중괄호 {} 생략이 가능함. 
		*/
		if( 5 > 3 ) 	System.out.println("출력1 ");
		//   참   
		if( 5 < 3 ) {
		//   거짓 	
			System.out.println("출력2 ");
		}
		int a = 3 ; 
		if(a != 3) {
			System.out.println("출력3");
			System.out.println("a의 값은 3입니다. ");
		}
		boolean b = false; 
		if(b) {
			System.out.println("출력4");
		}
		if(!b) {
			System.out.println("출력5");
		}
		
		int score = 60;
		if( score >= 60 ) { 
			System.out.println("합격");
		}
		// Scanner scan = new Scanner(System.in);
		// Q. 숫자를 입력받아 0과같으면 0 입니다를 출력 
		// 1. 변수선언하기 입력받기 
		int n1 = 10;
		System.out.println("숫자를 입력해주세요 ");
		// n1 = scan.nextInt();
		// 2. 연산 
		// 만약에 삼항식을 사용한다면 
		String r1 = ( n1 == 0 ) ? "0입니다":"0이아닙니다";
		// if문을 사용한다면. 
		String r2="";
		if(n1 == 0 ) {
			System.out.println("0입니다");
			r2 = "0입니다";
		}
		if(n1!=0) {
			System.out.println("0이아닙니다");
			r2 = "0이아닙니다";
		}
		// 3. 출력하기
		System.out.println(r1);
		System.out.println(r2);
		// Q. 문자를 입력받아 영소문자면 영소문자입니다를 출력 
		String str1 ="" ; // 문자열을 입력받기위한변수
		char ch1=' '; // 문자를 저장하기위한 변수 
		System.out.println("문자를 입력해주세요 ");
		// str1 = scan.next();  // "A"
		str1 = "a";
		ch1 = str1.charAt(0);    // 'A' 
		if( ('a' <= ch1) && (ch1 <='z') ) {
			System.out.println("영소문자입니다.");
		}
		/*  if - else 문
		  if (조건식) {
		  	 조건식이 true일때 실행되는 코드들 
		  } else {
		  	 조건식이 false 일때 실행되는 코드들 
		  }
		 if문과 마찬가지로 한줄일때는 {} 생략이 가능함. 
		*/
		if ( 5 < 3 ) System.out.println("출력A");
		else 	System.out.println("출력B");
		int i = 5, j = 0; 
		j = ( i > 5 ) ?  10 : 20; // 삼항연산자
		System.out.println(j);
		if(i>5) j = 10; 
		else 	j = 20; 
		
		System.out.println(j);
		
		score = 80; 
		if(score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		// 입력할때 사용하는 scanner 
		// scanner + ctrl + spacebar 
		// 위에   import java.util.Scanner; 생성됨.
		Scanner scan = new Scanner(System.in);
		// 숫자를 입력받아 0보다 크면 양수, 0보다 작으면 음수 라고 출력해보세요
		int num = 10; 
		System.out.println("숫자를 입력해주세요 ");
		// num = scan.nextInt();
		if(num > 0 ) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
		// 문자를 입력받아 숫자이면 숫자, 아니면 숫자가 아닙니다를 출력해보세요 
		String str2 ="1";
		System.out.println("숫자를 입력해주세요 ");
		//str2 = scan.next();        // "1"  "a"
		char ch2 = str2.charAt(0); // '1'  'a'
		if( ( '0'<= ch2)  && ( ch2 <='9') ) {
			// 48                     57   
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
		
		int chn = ch2 - '0';
		if( ( 0 <= chn)  && ( chn <= 9) ) {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
		
		// 숫자가 아닌경우 오류가생길 수 있다. 
		int chn2 = Integer.parseInt(str2); 
		if( ( 0 <= chn2)  && ( chn2 <= 9) ) {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
 		/*  if문, if-else문 , if- else if - else문
		 
		 if( 조건식1 ) {
		 	조건식1이 참일때 실행되는 코드들
		 }else if(조건식2){
		 	조건식1이 거짓이고 조건식2가 참일때 실행되는 코드들
		 }else if(조건식n){
		 	조건식1, 조건식2가 거짓이고 조건식n이 참일때 실행되는 코드들
		 }else{
		 	모든 조건식이 거짓일때 실행되는 코드들 
		 }
		*/
		if( 5 < 3 )
		{
			System.out.println("출력 i ");
		}
		else if ( 5 == 3 ) {
			System.out.println("출력 j ");
		} else {
			System.out.println("출력 k ");
		}
		
		score = 5; 
		if ( score >= 60 ) System.out.println("합격");
		else if (score >= 50) System.out.println("재응시");
		else System.out.println("불합격");
		
		// 숫자를 입력을 받아서 0이면0 양수면양수 음수면음수가 출력이 되게해보세요 
		System.out.println("숫자를 입력해주세요 ");
		num = scan.nextInt();
		String res ="";
		if(num == 0) {
			res = "0입니다";
		}else if(num > 0 ) {
			res = "양수";
		}else {
			res ="음수";
		}
		System.out.println(res);
		

	}

}
