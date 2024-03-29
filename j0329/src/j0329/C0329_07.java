package j0329;

public class C0329_07 {

	public static void main(String[] args) {
		// 1. 변수 : a = 20 
		// 출력: 저는 20살입니다.
		// printf 에서 사용  : %s : 문자열 %d : 정수 %f :실수
		
		System.out.println("저는 20살입니다.");
		int a = 20; 
		System.out.println("저는 "+ a +"살입니다.");
		System.out.printf("저는 %d살입니다. \n", a);
		
		// 변수 : name = 홍길동 age = 20;
		// 출력 : 저의 이름은 홍길동이고 나이는 20살입니다. (%s %d %f)
		String name = "홍길동";
		int age = 20 ; 
		System.out.printf("저의 이름은 홍길동이고 나이는 20살입니다.\n");
		System.out.printf("저의 이름은 %s이고 나이는 20살입니다.\n",name);
		System.out.printf("저의 이름은 %s이고 나이는 %d살입니다.\n",name, age);
		
		
		
		
		
		
		System.out.println(5+2); 
		System.out.println(5-2);
		System.out.println(5*2);
		System.out.println(5/2.0);  // 7, 3, 10,2.500000
		
//		변수를 선언하고(n1, n2) printf 를 사용해서 사칙연산을 출력해보세요 
//		5 + 2 = 7
//		5 - 2 = 3 
//		5 * 2 = 10 
//		5 / 2 = 2.5
		int n1 = 5, n2 = 2;
		System.out.printf("%d + %d = %d \n",n1,n2,n1+n2);
		System.out.printf("%d - %d = %d \n",n1,n2,(n1-n2));
		System.out.printf("%d * %d = %d \n",n1,n2,n1*n2);
		System.out.printf("%d / %d = %.1f \n",n1,n2, n1/(float)n2);
		
		
		// 2단 출력
//		2 * 1 = 2 
//	    2 * 2 = 4
//	    2 * 3 = 6    
//	    변수는 1개 n = 2
		int n = 2; 
		System.out.printf("%d * %d = %d \n",n,1,n*1);
		System.out.printf("%d * %d = %d \n",n,2,n*2);
		System.out.printf("%d * %d = %d \n",n,3,n*3);
		
		
	}

}
