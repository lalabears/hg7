package j0605;
import java.util.Scanner;
public class C0605_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 객체생성 
		Cal c = new Cal();
//		System.out.println("첫번째숫자");
//		c.num1 = scan.nextInt();
//		System.out.println("두번째숫자");
//		c.num2 = scan.nextInt();
		c.num1 = 5; 
		System.out.println(c.num1);  // 객체변수출력		
		myFunc1(c.num1);   //메서드 호출
		int r = myFunc2(c.num1); // 메서드 호출
		System.out.println(c.num1); // 메서트 호출 후 객체변수 출력
		System.out.println(r); // 메서드2 결과 출력 
		
		// c.num1 = 5 
		System.out.println("객체 c의 주소" +  c); // 객체 c의 주소
		myFunc3(c);
		System.out.println(c.num1);
		
		Cal d = new Cal();
		System.out.println("첫번째숫자");
		d.num1 = scan.nextInt();
		System.out.println("두번째숫자");
		d.num2 = scan.nextInt();
		// calculate라는 메서드를 만들어서 
		// addResult,subResult,mulResult,divResult의 결과 값을 넣어보세요 

		System.out.println("d의 주소 : "+ d);
		// calculate함수 호출 
		calculate(d);  // calculate 함수에 객체의 주소 d를 전달 
		System.out.println(d.addResult);
		System.out.println(d.subResult);
		System.out.println(d.mulResult);
		System.out.println(d.divResult);
		
	} // main
	static void calculate(Cal c) {
		System.out.println("c의 주소 : "+ c);
		c.addResult = c.num1 + c.num2;
		c.subResult = c.num1 - c.num2;
		c.mulResult = c.num1 * c.num2;
		c.divResult = (double)c.num1 / c.num2;
	}
	
	static void myFunc1(int n) {
		n = 100; 
		System.out.println("n " + n );
	}
	static int myFunc2(int n) {
		n = 100;
		return n;
	}
	static void myFunc3(Cal a) {
		System.out.println("객체 a의 주소" + a);
		a.num1 = 10 ; 
		System.out.println("a.num1 "+ a.num1);
	}
	
	

} // class
