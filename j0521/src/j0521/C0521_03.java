package j0521;
import java.util.Scanner;
public class C0521_03 {

	public static void main(String[] args) {
		// scanner : 입력 받고자 한다면
		// 1. scanner 입력하고 ctrl + spacebar > 스캐너를 임포트해줘야함. 
		Scanner scan = new Scanner(System.in); 
		
		// next(), nextLine() 문자열 
		// nextInt() 정수
		// nextDouble() 실수 
		//scan.nextLine(); // 입력이 가능해짐 
		String str; 
		str = scan.nextLine(); 
		System.out.println("입력하신 값은 : "+ str);
		int number ; 
		number = scan.nextInt();
		System.out.println("입력하신 숫자는 : "+ number);
		double num ; 
		num = scan.nextDouble(); // 만약에 정수형숫자를 넣으면 > 자동으로 형변환되서 실수로저장
		System.out.println("입력하신 실수는 : "+ num);

	}
}
