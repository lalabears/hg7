package j0524;

import java.util.Scanner;

public class C0524_01 {

	public static void main(String[] args) {
		/*
		 조건문 : if문 switch문
		 if(조건식1) {
		 	조건식1이 참일때 실행
		 }else if(조건식2){
		 	조건식2가 참일때 실행
		 }else{
		 	조건식1, 조건식2가 모두 거짓일때 
		 }
		 >> else if, else 문은 필요할때만 사용 (생략가능)
		 >> 조건식1, 조건식2의 연산결과는 true, false만 가능함 
		 switch(조건값){
		 case 조건값1:
		    조건값 == 조건값1 일때 실행
		    break;
		 case 조건값2:
		    조건값 == 조건값2 일때 실행
		 default :
		    조건값이 어떠한 case 값에도 일치하지 않을때 실행
		 }
		 >> default 생략가능 
		 >> case 문에 break를 만나면 switch문을 빠져나온다. 
		    break가 없으면 순차적으로 다음 case문을 를 실행함. 
		 >> case문의 조건 값으로 올 수 있는 값 
		    정수(int, char), 상수, 문자열 
		*/
		int month = 6 ; 
		if( 3<= month && month <=5) System.out.println("spring");
		else if(6<= month && month<=8) System.out.println("summer");
		else if(month==9||month==10||month==11) System.out.println("fall");
		else System.out.println("winter");
		switch(month) {
		case 3: case 4: case 5: 
			System.out.println("spring");
			break;
		case 6: case 7: case 8:
			System.out.println("summer");
			break; 
		case 9: case 10: case 11:
			System.out.println("fall");
			break;
		default: 
			System.out.println("winter");
		}
		// switch문을 사용해서 월(변수 month사용)
		// 1월은 31일까지 있습니다.  2월을 28일까지 있습니다.
        // 6월은 30일까지 있습니다를 출력이되게 만들어보세요 
		int days = 0; 
		month = 12;
		switch(month) {
		case 2: 
			days = 28; 
			break;
		case 4: case 6: case 9: case 11:
			days =30;
			break;
		default:
			days =31;
			break;
		}
		System.out.println(month+"월은 "+days+"일까지 있습니다");
		
		// 사과의 상태와 가격을 입력을 받아 
		//입력:
		//사과의상태는 어떤가요 ?    : 신선 (보통, 안좋음)
		//사과의 가격은 얼마인가요 ?  : 1000 (4000)
		// 사과의 상태가 좋을때 만 구매 
		// 가격이 2000원이하일 경우는 10개 구매 그보다 비쌀경우 5개 구매			
	   //	출력은 
	   // (신선, 1500) : 신선한 사과 10개를 15000원어치 구매했습니다. 
	   // (신선, 3000) : 신선한 사과 5개를 15000원어치 구매했습니다 
		Scanner scan = new Scanner(System.in);
		System.out.println("사과의 상태는 어떤가요 ?");
		String cond = scan.next(); //입력받기
		System.out.println("사과의 가격은 얼마인가요 ?");
		int price = scan.nextInt(); // 입력받기 
		int n = 10; 
		// if문을 사용한 코드만들기 (switch로 하고싶으면 하셔도됩니다.)
		if( cond.equals("신선") ) {
			if( price <= 2000 ) {
				// 10개구매
				n = 10; 
			}else {
				// 5개 구매 
				n = 5; 
			}
			System.out.println(cond +"한 사과 "+ n +"개를 "
					+ ( n * price )+"원어치 구매했습니다" );
		} else {
			System.out.println("사과를 구매하지 않습니다.");
		}
		// 숫자 하나를 입력받아 (음수, 혹은 양수)
		// 만약 -1을 입력받으면  이 값은 홀수이며 음수입니다. 
		// 만약  2를 입력받으면  이 값은 짝수이며 양수입니다. 
		System.out.println("숫자를 입력해주세요 ");
		int num = scan.nextInt();
		if( num%2 == 1 || num%2 == -1) { // 홀수 
			System.out.print("이 값은 홀수이며 ");
			if(num>0) {
				System.out.println("양수입니다");
			}
			else {
				System.out.println("음수입니다");
			}
		} 
		else if(num==0) {
			System.out.println("0입니다");
		} 
		else {  // 짝수일때 
			System.out.print("이 값은 짝수이며 ");
			if(num>0) System.out.println("양수입니다");
			else System.out.println("음수입니다");
		}
		
		
		
		
		
	}

}
