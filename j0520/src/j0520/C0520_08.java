package j0520;
import java.util.Scanner;
public class C0520_08 {

	public static void main(String[] args) {
		// scanner 
		// scanner + control + spacebar (스캐너 자동완성)
		// import java.util.Scanner;  가 자동으로 생성됨
		
		Scanner scan = new Scanner(System.in);
		// system.in 은 화면으로부터 입력을 받는다는 의미
		
		
		String str = "abc"; //new String("문자열");
		System.out.println(str); // 출력
		
	
		
		
		// next(), nextLine() > 문자열 
		String str1 = scan.nextLine(); // 입력이가능. 
		// 입력받은 문자열을 str1이라는 변수에 저장해라 
		System.out.println(str1); // 입력받은값을 출력해라 
		int number = scan.nextInt(); // 정수형을 입력받아 변수에 저장한다. 
		System.out.println(number);
		System.out.println("숫자하나를 입력해주세요 >> ");
		int n1 = scan.nextInt(); 
		System.out.println( n1 + 20 ) ;
		
		
		/*
		System.out.println("숫자를 입력해주세요 : "); 
		String str2 = scan.nextLine();
		int n2 = Integer.parseInt(str2);
		System.out.println("입력하신 숫자에 20을 더한값은 : " + (n2+20));
		*/
		
		
	}

}
