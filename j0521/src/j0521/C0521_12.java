package j0521;

import java.util.Scanner;

public class C0521_12 {

	public static void main(String[] args) {
		// 삼항연산자 : 자바에서 유일하게 피연산자를 세개 가지는 조건 연산자.
		// 조건식 ? 반환값1 : 반환값2 
		// 물음표 앞에 조건식 결과에따라 참이면 반환값1 거짓이면 반환값2 를 반환함 
		
		int val = ( 3 > 5 ) ? 10 : 20 ; 
		//          false 
		System.out.println(val);  // 20 
		int val2 = ( 3 < 5 ) ? 10 : 20 ; 
		System.out.println(val2);  // 10
		
		int x =13, y = 25; 
		int result = ( x > y ) ? x : y ; 
		//              x 가 더 크면 x 
		//              y 가 더 크면 y 값을 반환함 
		// 즉 두 수 중 더 큰값을 반환하는 조건식 
		System.out.println(result);
		//    조건식 ? 참 : 거짓  
		// Q. 홀수 짝수를 반환해 주는 조건식을 만들어 보세요 
		int n = 16 ; 
		String res1 = ( n%2==0 ) ? "짝수" : "홀수" ; 
		System.out.println(res1);
		// Q. a와 b의 크기를 비교해서 a가 b보다크면 a-b, b가 a보다크면 b-a를 
		// 반환하는 삼항식을 만들어보세요 
		int a = 30, b = 80;
		int res2 = ( a > b ) ?  a-b : b-a  ; 
		System.out.println(res2);
		// Q. 숫자를 입력받아 nextInt() 양수이면 양수 음수이면음수 
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 ");
		int number = scan.nextInt();
		String res3 = (number >= 0 ) ? "양수":"음수";
		System.out.println(number+"는 " + res3 + "입니다.");
		
		// Q. 삼항식을 사용해서 입력받은 문자가 영문자면 영문자입니다. 
		// 아니면 영문자가아닙니다. 
		
		
		
	}

}
