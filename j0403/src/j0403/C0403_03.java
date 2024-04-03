package j0403;

public class C0403_03 {

	public static void main(String[] args) {
		
		// 형변환 : 변수 또는 상수의 타입을 다른 타입으로 변환하는 것  
		double d = 11.9874;
		int n = (int)d;  // 소수점이하를 버림
		System.out.println(d);
		System.out.println(n);
		          //(int)
		float f = 123;
		//        (float)123;
		System.out.println(f);
		
		
		// int n = 4.12f; // 값에 손실이 발생할 수 있어서 오류 
		int num1 = (int)4.12f;
		System.out.println(num1);
		
		// 산술 연산자 : + - * / 
		 
		int n1 = 5, n2 =2;
		System.out.printf("%d+%d=%d\n", n1,n2,n1+n2);
		System.out.printf("%d-%d=%d\n", n1,n2,n1-n2);
		System.out.printf("%d*%d=%d\n", n1,n2,n1*n2);
		System.out.printf("%d/%d=%d\n", n1,n2,n1/n2);
		
		
		
		int n3 = 1000000;
		int n4 = 2000000; 
		long n5 = n3 * n4 ;
		System.out.println(n5);
		long n6 = (long)n3 * n4;
		System.out.println(n6);
		
		// 나머지 연산자 " % "
		// 나누기 / => 5/2 = 2.5 
		int n7 = 100;
		int n8 = 3; 
		
		System.out.printf("%d를 %d로 나눈 값은 %.2f \n", n7,n8,n7/(double)n8);
		System.out.printf("%d를 %d로 나눈 몫 값은 %d \n", n7,n8,n7/n8);
		System.out.printf("%d를 %d로 나눈 나머지 값은 %d \n", n7,n8,n7%n8);
		
		
		
		
		
		

	}

}
