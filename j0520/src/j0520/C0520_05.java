package j0520;

public class C0520_05 {

	public static void main(String[] args) {
		// 오버플로우 
		// 정수형 오버플로우는 정수값이 증가하면서 허용된 범위보다 커져서 
		// 의도하지 않게 음수가 출력이 되는것. 
		byte b = 127 ; 
		byte c ; 
		//c = b+1; // byte의  최대값이 127이기 때문에 오류가 발생을한다. 
		
		int num = 2147483647; // int의 범위가 -2147483648 ~ 2147483647
		System.out.println( num );
		System.out.println( num + 1 ); 
		//2147483648 이 출력되야하나 오버플로우 현상으로 -2147483648 출력
		
		int n1 = 5000000;
		int n2 = 5000000; 
		System.out.println( n1 * n2 ); // -1004630016
		
		int num1 = -2147483648;
		System.out.println( num1 );  
		System.out.println( num1 - 1 );
		//-2147483649 가 출력되야하나 2147483647 이 출력됨 
		
		
		
	}

}
