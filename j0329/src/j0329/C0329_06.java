package j0329;

public class C0329_06 {

	public static void main(String[] args) {
		// printf() 를 사용해서 
		// 1.  변수명 num1 값 10, 변수명 num2 값 3
		// 두 수를 나눠서 소수점 2자리 까지 출력하세요 
		int num1 = 10, num2 = 3; 
		double num13 = 10, num23 = 3; 
//		System.out.println( num1 / (float)num2 );
		double result = num1/(float)num2;
		
		System.out.printf("%.2f \n",num1/(float)num2);
		System.out.printf("%.2f \n",num13/num23);
		System.out.printf("%.2f \n",result);
		
//		int num11 = 10;
//		double num12 = 3; 
//		System.out.println( num11 / num12 );
		
		// 정수/정수 = 정수 
		
		// 2. 변수 n1 : 3.14, n2 : 5
		// 출력 : [n1+n2의 결과값 : 8.14] 
		double n1 = 3.14; // float n1 = 3.14f; 
		int n2 = 5;
		double re = n1+n2;
		System.out.println( n1 + n2 ); // 8.14 
		System.out.println(re); // 8.14
		System.out.printf(" [n1+n2의 결과값 : %.2f] ", n1+n2);
		
		System.out.println();
		// 3. 변수 : kor :100, eng : 100, math : 99
		// 합계와 평균을 출력하세요 평균은 소수점2자리까지 
		int kor = 100, eng = 100, math =99;
		int total = kor+eng+math; 
		// double avg = (kor+eng+math)/3.0;
		double avg = total/3.0;
		System.out.printf("합계 : %d 평균 :%.2f \n", total, avg);
		System.out.printf("합계 : %d 평균 :%.2f \n", 
				kor+eng+math, (kor+eng+math)/3.0);
		
		
		
		
		
	}

}
