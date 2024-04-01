package j0401;

import java.util.Scanner;

public class C0401_03 {

	public static void main(String[] args) {
		// scanner + ctrl + spacebar
		Scanner scan = new Scanner(System.in); 
		
		///////////////////////////////////// 
		
//		scan.nextLine(); // 입력받기
		
		// 변수선언 
//		String a = "안녕하세요" ; 
//		System.out.println(a);
//		
		System.out.print("값을 입력하세요 >>");
		String a = scan.nextLine();
		System.out.println(a+10);
		// a : String type : 문자열 
		int n = Integer.parseInt(a); // 문자열 -> 숫자로 바꿔주는 함수
		System.out.println(n+10);
		
		System.out.print("정수를 입력하세요 >>");
		int number = scan.nextInt(); // 정수를 입력받아 number에 저장
		System.out.println(number+10);
		

	}

}
