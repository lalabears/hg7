package j0522;

import java.util.Scanner;

public class C0522_12 {

	public static void main(String[] args) {
		/* 중첩 if문 : if문 안에 if문이 있는것. 
		if(조건식1){
			조건식1이 참일때 실행되는 코드들
			if(조건식2){
				+ 조건식 1은 참
				조건식2가 참일때 실행되는 코드들
			}else{
				+ 조건식 1은 참
				조건식2가 거짓일때 실행되는 코드들
			}
		}else{
			조건식1이 거짓일때 실행되는 코드들 
		}
		*/
//		 19세 이상이면 성인, 이하이면 청소년이라는 if-else문을 만들어보세요
		int age = 7; 
		if( age > 19 ) {
			// System.out.println("성인 입니다");
			if(age >= 40) {
				System.out.println("중장년입니다.");
			}else {
				System.out.println("청년입니다");
			}
		} 
		else {
			// System.out.println("청소년 입니다.");
			if(age < 14) {
				if(age < 8 ) System.out.println("미취학 아동입니다.");
				else System.out.println("어린이입니다");
			}else {
				System.out.println("청소년입니다.");
			}
		}
		// Q.  
		// 아이디랑 비밀번호를 입력받아서 
		// 아이디가 같으면, 비밀번호가 같은지를 비교해서 
		// 두개다 같으면 로그인되었습니다 라고 출력하고 
		// 아이디가 같지만 비밀번호가 틀렸을때는 비밀번호가 틀렸습니다 라고 출력
		// 아이디가 틀렸을때는 아이디가 일치하지 않습니다 라고 출력 
		//	문자열은 == 로 비교할 수 없다. 
		Scanner scan = new Scanner(System.in);
		// 1. 변수선언 (입력받기)
		String id = "admin";
		String pw = "1111";
		String nid, npw; 
		System.out.println("아이디를 입력해주세요 ");
		nid = scan.next();
		System.out.println("비밀번호를 입력해주세요 ");
		npw = scan.next();
		// 2. 연산 및 출력 
		if( nid.equals(id) ) {
			// 아이디가 일치하는 경우
			if (npw.equals(pw)) {
				System.out.println("로그인되었습니다");
			}else {
				System.out.println("비밀번호가 틀렸습니다 ");
			}
		} else {
			// 아이디가 일치하지 않는 경우 
			System.out.println("아이디가 일치하지 않습니다");
		}
		
		
		
		
		
		
		
	}

}
