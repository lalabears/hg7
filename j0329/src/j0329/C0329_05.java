package j0329;

public class C0329_05 {

	public static void main(String[] args) {
		
		// printf 
		System.out.print("줄바꿈 없는 출력");
		System.out.println("줄바꿈 있는 출력");
		
		// 실수의 자리수 조절이 불가능 
		System.out.println(5/3);
		System.out.println(5.0/3);
		System.out.println(5/3.0);
		
		// printf를 사용하면 출력형식 지정이 가능 
		// 정수형 : %d, 실수 : %f , 문자열 : %s
		System.out.println("정수 : " + 10);
		
		System.out.printf("정수 : %d \n", 10);
		// System.out.println();
		
		System.out.printf("%.5f \n", 5.0/3); 
		
		// \n 줄바꿈 \t 들여쓰기(tab만큼)
		
		float f = 100.123456789f;
		System.out.println(f);
		System.out.printf("%.3f \n", f);
		
		
		System.out.printf("[%8d]\n", 123);
		// 5칸 왼쪽 정렬
		System.out.printf("[%-8d]\n", 123);
		// 5칸 오른쪽 정렬
		System.out.printf("[%08d]\n", 123);
		// 빈공간을 0으로 채움 
		
		double pi = 3.14159265;
		System.out.printf("[%10.2f]\n", pi);
		System.out.printf("[%010.2f]\n", pi);
		System.out.printf("%.3f \n",pi);
		
		pi = 3.14; 
		System.out.printf("%.5f \n",pi);
		// 소수점 이하의 빈 공백은 0으로 채우게 된다. 

		String str = "www.naver.com";
		System.out.printf("[%s]\n", str);
		System.out.printf("[%20s]\n", str);
		System.out.printf("[%-20s]\n", str);
		System.out.printf("[%.8s]\n", str);
		
	}
}
