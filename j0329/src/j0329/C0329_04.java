package j0329;

public class C0329_04 {

	public static void main(String[] args) {
		// 형변환 
		float f = 1.6f; // 소수점 있음
		int i;
		i = (int)f; // 강제적으로 int타입으로 변환
		
		System.out.println(f);
		System.out.println(i);
		
		// String > double > float > long > int > char, byte, short
		
		char ch = 'A'; // 65
		int n = ch ;
		System.out.println(n);
		
		int n2 = 97;
		char ch2 = (char)n2;
		System.out.println(ch2);
		
		// 문자 숫자간 변환
		//
		int k = 5; // 숫자
		char n1='5'; // 숫자처럼 보이지만 문자
		// '0' : 10진수로 48
		//  '1' : 49, '2' :50 .... 
		System.out.println(k);
		System.out.println(n1);
		
		int n3 = n1 - '0'; 
		//       '5' - '0' -> 53-48 => 5
		// '문자형태의숫자' - '0' 을 해주면 숫자로 사용할 수 있다
		
		// 숫자 -> 문자
		int n4 = 5;
		char n5 = (char)(n4 + '0');
		//                   +  48
		System.out.println(n5);
		
		
		// 문자열로 변환 
		int n6 = 5;
		String n7 = ""+n6; 
		//앞이나 뒤에 ""을 더해주면된다
		
		// 문자열을 숫자로 변환 
		String n8 = "5";
		String n9 = "3.14"; 
		
		int n10 = Integer.parseInt(n8);
		double n11 = Double.parseDouble(n9);
		
		int q = 5;
		double w = 3.14; 
		System.out.println(q+1);
		System.out.println(n8+1); // 51 6
		System.out.println(n10+1);
		System.out.println(Integer.parseInt(n8)+1);
		
		
		System.out.println("a"+"b"+"c"+1); //abc1
		
		// 문자열 선언
		String str = "abcd"; 
		
		int num1 = 7;
		int num2 = 7;
		
		String num3 = "7"; // 문자열 선언및 초기화
		
		System.out.println(num1+num2); // int + int
		System.out.println(num1+num2+num3); // (int+int) + ""
		System.out.println(num3+num1+num2); // ("" + int) + int
		// 숫자를 문자로 바꾸기: ""+ 숫자
		
		String name = "홍길동";
		String str1 ;
		int age;
		
		
		
		
		
		
		
		

	}

}
