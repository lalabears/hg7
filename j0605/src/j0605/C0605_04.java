package j0605;
import java.util.Calendar;
import java.util.Scanner;
public class C0605_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자 두개를 입력받아. 그 사칙연산의 결과를 r변수에 담아 출력해보세요 
		// 출력은 main에서 . 사칙연산은 각각 개별의 메서드로 만들어서. 
		int[] n = new int[3];  // 2 -> 5  10/2/4/5/6
		int[] r = new int[4];
		// 입력 :
		for(int i = 0 ; i < n.length ; i ++) {
			System.out.println((i+1)+"번 숫자를 입력해주세요 : ");
			n[i] = scan.nextInt();
		}
		// 메서드 호출   배열은 값이 아니라 주소를 주고받는다
		add(n, r);  
		sub(n, r);
		mul(n, r);
		div(n, r);
		// 출력 : 
		System.out.println("덧셈결과: " + r[0]);
		System.out.println("뺄셈결과: " + r[1]);
		System.out.println("곱셈결과: " + r[2]);
		System.out.println("나눗셈결과: "+ r[3]);
	} // 
	
	static void add(int[] n, int[] r) {
		// 덧셈을 해주는 메서드 
		int result = n[0]; // 2 5 7
		for (int i = 1 ; i <n.length ; i++) {
			result = result +n[i];
		}
		r[0] = result;
	}
	static void sub(int[] n, int[] r) {
		int result = n[0];  // 2 5 7
		for (int i = 1 ; i <n.length ; i++) {
			result = result - n[i];
		}
		r[1] = result;
	}
	static void mul(int[] n, int[] r) {
		int result = n[0]; //2 5 7
		for (int i = 1 ; i <n.length ; i++) {
			result = result * n[i];
		}
		r[2] = result;
	}
	static void div(int[] n, int[] r) {
		int result = n[0];
		for (int i = 1 ; i < n.length ; i++) {
			result = result / n[i];
		}
		r[3] = result;
	}
	
	
	
	
	
	
	/*
	// 클래스메서드 -> 객체생성이 필요없음 
	static void calculate(int[] n, int[] r) {
		r[0] = add(n);  // 메서드의 리턴타입은 int
		r[1] = sub(n);
		r[2] = mul(n);
		r[3] = div(n);
	}
	static int add(int[] n) {
		// 덧셈을 해주는 메서드 
		int result = n[0]; // 2 5 7
		for (int i = 1 ; i <n.length ; i++) {
			result = result +n[i];
		}
		return result;
	}
	static int sub(int[] n) {
		int result = n[0];  // 2 5 7
		for (int i = 1 ; i <n.length ; i++) {
			result = result - n[i];
		}
		return result;
	}
	static int mul(int[] n) {
		int result = n[0]; //2 5 7
		for (int i = 1 ; i <n.length ; i++) {
			result = result * n[i];
		}
		return result;
	}
	static int div(int[] n) {
		int result = n[0];
		for (int i = 1 ; i < n.length ; i++) {
			result = result / n[i];
		}
		return result;
	}
*/
} // class 
