package j0405;

import java.util.Scanner;

public class C0405_03 {

	public static void main(String[] args) {
		//char
		System.out.println( 'a' == 'a'); // 97 == 97 
		/*
		char을 입력을 받고싶으면, 
		String type 으로 받아서 (nextLine())
		str.charAt(0) 로 사용
		*/
		
		
		// String 
		System.out.println("a".equals("A"));
		
		
		
		// 130 이상만 탑승이 가능합니다. 
		// int, scanner, nextint()
		// if , >= 
		int height = 145;
		if (height >= 130) {
			System.out.println("탑승이 가능합니다");
		}
		
		// 130 이상이고, 10살 이상이면 놀이기구 탑승가능 
		// int, scanner, nextint()
		// if , >= , &&
		int age = 10; 
		if ( height >= 130 && age >= 10) {
			System.out.println("탑승이 가능합니다");
		}
		// 날씨를 입력받아서 (비, 눈, 맑음) -> string, scanner , nextline()
		// 날씨가 비나 눈이면 [우산을 챙겨주세요] -> if, || , equals
		// 아니면 [선크림을 발라주세요] 를 출력해보세요 -> system.out.print()
		// weather =	"비", "눈", "맑음"
		Scanner scan = new Scanner(System.in);
		System.out.print("날씨를 입력해주세요 (비, 눈, 맑음)");
		// 변수 선언 및 입력 받기 
		String weather = scan.nextLine();
		// 문자열이 같은지 비교 
//		0 == 1, 1!=4
//		'a' == 'A'
		//String 문자열 같은 경우에 같은지를 비교하려면 
//		"abc".equals("dsf");
		// 조건문 사용하기 
		if (weather.equals("비") || weather.equals("눈")) {
			System.out.println("우산을 챙겨주세요");
		}else {
			System.out.println("선크림을 발라주세요");
		}
		
		
		
		
 		
		

	}

}
