package j0329;

public class C0329_03 {

	public static void main(String[] args) {
		
		// 오버플로우 :
		// 정수에 저장할 수 있는 최대값을 넘는것을 의미
		// 최대값 + 1   -> 최소값
		// 최소값 - 1   -> 최대값 
		byte b = 127; // -128 ~ 127
		// b = 127+1; 
		
		int n = 2147483647; // -2147483648 ~ 2147483647

		System.out.println(n);
		System.out.println(n+1);
		
		int n1 = 1000000;
		int n2 = 2000000;
		System.out.println(n1*n2);
		
		
		
		
		/*
		int a = 10;
		int b = 2; 
		System.out.println(10+2); 
		System.out.println(10-2);
		System.out.println(10*2);
		System.out.println(10/2);
		
		System.out.println(a+b); 
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		a = 8;
		b = 3;
		System.out.println(8+3); 
		System.out.println(8-3);
		System.out.println(8*3);
		System.out.println(8/3);
		
		System.out.println(a+b); 
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		a = 100;
		b = 7;
		System.out.println(a+b); 
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		*/
		

	}

}
