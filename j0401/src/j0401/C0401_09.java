package j0401;

import java.util.Scanner;

public class C0401_09 {

	public static void main(String[] args) {
		
		// 원의 반지름을 입력받아서 Scanner scan = new Scanner(System.in);
		// 원의 넓이 와 원의 둘레를 출력하세요
		// 넓이 : pi * r * r , 둘레 : 2 * pi * r
		// 변수 r(입력받고) pi=3.14
		Scanner scan = new Scanner(System.in);
		// 1. 변수를 정수로 입력. nextInt()
		int r ; // 반지름 
		double pi = 3.14; // 실수 선언 
		System.out.print("반지름을 입력해주세요 >> "); 
		r = scan.nextInt(); // 정수로 입력을 받음.. 
		
		double res1 , res2;
		res1 = pi * r * r ; // 넓이
		res2 = 2* pi * r ; //둘레 
		System.out.printf("넓이 : %.2f , 둘레 : %.2f \n",res1, 2* pi * r  );
		
		scan.nextLine(); //
		
		// 2. 변수를 nextLine() : 문자열 -> Integer.parseInt()를 사용해서 숫자로 변환 후 출력  
		
		String sr = scan.nextLine();
		int r1 = Integer.parseInt(sr);

		System.out.printf("넓이 : %.2f , 둘레 : %.2f \n",pi * r1 * r1, 2* pi * r1  );

		
	}

}
