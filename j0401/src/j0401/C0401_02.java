package j0401;

import java.util.Scanner;

public class C0401_02 {

	public static void main(String[] args) {
		// 입력 받기 
		// scanner + ctrl + spacebar 
		
		Scanner scan = new Scanner(System.in); // 외워라 
		
		System.out.print("입력하세요 >> ");
		String str = scan.nextLine(); // 문장으로 입력받기 
		
		
//		String b = "hi";
//		System.out.println(b);
		
		System.out.println("입력하신 문장은 : " + str);
		
		System.out.print("숫자를 입력하세요 >> ");
		
		int num = scan.nextInt();
		System.out.println("입력하신 숫자는 "+ num );
		System.out.println("입력하신 숫자에 2를 곱한 값은 " + (num*2) );
		
		System.out.print("실수(소수점숫자)를 입력하세요 >> ");
		double num2 = scan.nextDouble();
		System.out.println("입력하신 숫자는 "+ num2 );
		
		
		
		
		
		

	}

}
