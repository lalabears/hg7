package j0520;

public class C0520_07 {

	public static void main(String[] args) {
		// 출력 
		System.out.print("줄바꿈이 없는 출력");
		System.out.print("\n"); // 줄바꿈
		System.out.println("줄바꿈이 포함된 출력 ");
		// 실수의 자리수 조절이 불가능함 
		System.out.println(5/3);
		System.out.println(5.0/3.0);
		// 10진수로만 출력이됨. 
		System.out.println(0x100);
		// printf()를 사용하면 출력 형식 지정이 가능하다 (소수점자리 지정가능)
		// %f : 실수, %d : 정수, %s : 문자열 , %x : 16진수 , %c : 문자 
		System.out.printf("%.3f \n", 5.0/3.0);
		System.out.printf("print와 같습니다 \n");
		System.out.printf("10진수 : %d \n", 0x100 );
		System.out.printf("16진수 : %x \n", 0x100 );
		// println 은 출력 후 enter키 포함(즉 줄바꿈포함) 
		// print, printf 는 포함 되어 있지 않아 줄바꿈 하고자 할때 \n 사용
		// \t를 사용하면 tab키 만큼 공백이 출력이됨. 
		System.out.print("안녕\t하세요\n반갑습니다\n");
		String name ="홍길동";
		int age = 27; 
		System.out.println("이름 : 홍길동, 나이 : 27세");
		System.out.println("이름 : " + "홍길동" + ", 나이 : " + 27 + "세");
		System.out.println("이름 : " + name + ", 나이 : " + age + "세");
		System.out.printf("이름 : %s, 나이 : %d세\n", name, age);
		
		// %f 실수형 .숫자로 소수점 이하 자리수를 정할 수 있음. 
		System.out.printf("%.3f \n",10.12345);
		System.out.printf("%d \n", 1000);
		System.out.printf("16진수 : %x \n", 1000);
		System.out.printf("8진수  : %o \n", 1000);
		// 16진수 8진수 등 접두사를 붙이고 싶을경우 #을 사용함. 
		System.out.printf("16진수 : %#x \n", 1000);
		System.out.printf("8진수  : %#o \n", 1000);
		
		float f = 100.123456789f;
		System.out.printf("%f \n", f); // 소수점6자리까지 출력해줌. 
		// 100.123459 float이 8자리까지는 정확하게 표현하고 그이하는 부정확함. 
		int num = 123;
		System.out.printf("[%7d] \n" , num); // 7 칸 오른쪽정렬
		System.out.printf("[%-7d] \n" , num);// 7 칸 왼쪽정렬
		System.out.printf("[%07d] \n" , num);// 7 칸 빈공백은 0을 채워서 출력
		
		double pi = 3.14159265;
		System.out.printf("[%7.2f] \n",pi); // 총 7칸 소수점이하 2칸 (소수점포함)
		System.out.printf("[%07.2f] \n",pi);// 총 7칸 소수점이하 2칸 빈공백 0을채워서 
		
		pi = 3.14; 
		System.out.printf("[%7.5f] \n",pi); //총7칸 소수점이하 5칸 
		
		String str = "https://www.google.com"; // 22글자
		System.out.printf("[%s] \n" , str);
		System.out.printf("[%30s] \n", str);
		System.out.printf("[%-30s] \n", str);
		System.out.printf("[%.10s] \n", str);
		
		
		//  System.out.printf( str  ,   args  )
        //                     " "  , 해당하는 값들
		//                            숫자, 문자열, 문자, 변수
		System.out.printf("문자열\n");
		System.out.printf( "%c "  ,  'A'  );
		System.out.printf( "%d "  ,  10  );
		System.out.printf( "%f "  ,  10.0  );
		System.out.printf( "%s "  ,  "문자열"  );
		System.out.printf( "%s "  ,  str  );	
		System.out.println();
		
		// 변수 num1 은 20, num2는 7을 선언 한 후, 두 수를 나눈 값을
		// 소수점 4자리까지 출력해보세요 
		int num1 = 20; 
		int num2 = 7 ; 
		// int num1 =20, num2 = 7 ; 
		// int num1, num2; 
		// num1 = 20;
		// num2 = 7 ;
		
		double result = num1 / num2; // 2.0000
		double result1 = (double)num1 / num2;
		System.out.printf("%.4f \n", result );
		System.out.printf("%.4f \n", result1 );
		// 2.0000 
		// 2.8571 
		System.out.printf("%.4f \n", (double)num1 / num2 );
		
		// 변수 n1 은 11.567 n2는 29 로 선언 후 두 수의 합을 
		// n1 + n2 = 40.6 로 출력해보세요 
		double n1 = 11.567;
		int n2 = 29 ; 
		double result2 = n1+n2; 
		
		System.out.printf("n1 + n2=%.1f \n" ,(n1+n2));
		System.out.printf("n1 + n2= %.1f \n" ,result2);
		
		System.out.println("n1 + n2 = " + n1+n2);   // 11.56729
		System.out.println("n1 + n2 = " + (n1+n2));
		System.out.println("n1 + n2 = " + result2);
		
		// 변수 kor 100 eng 100 math 99 이라고 선언 후 
		// 다음과 같이 출력해보세요 
		// 출력 : [합계 : 299, 평균 : 99.67]
		
		int kor = 100, eng = 100, math = 99; 
		// printf 로 출력해야함 
		
		System.out.printf("[합계 : %d, 평균 : %.2f] \n", 100+100+99 , (100+100+99)/3.0 );
		// [합계 : 299, 평균 : 99.67]
		
		int total = kor+eng+math; 
		double avg = (double)total/3;
		System.out.printf("[합계 : %d, 평균 : %.2f] \n", total, avg );
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
