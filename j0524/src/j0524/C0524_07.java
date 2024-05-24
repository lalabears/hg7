package j0524;
import java.util.Scanner;
public class C0524_07 {
	public static void main(String[] args) {
		// 변수의 종류 오버플로우를 조심하세요
		// 20! 출력을 해보세요 (1*2*3*4*5*....*20)
		
		long result = 1L; 
		for(int i = 1;i <= 20;i++) {
			result *= i;
		}
		System.out.println("20! ="+result);
		
		
		
		
		Scanner scan = new Scanner(System.in);
		// 숫자를 10 개 입력받아 숫자 10개의 합을 구하세요 
		// 입력을 1,2,3,4,5,6,7,8,9,10 (사용자가입력)
		// 출력 : 합은 : 55 
		int n = 0, sum = 0;
		for (int i = 0 ; i<10 ; i++) {
			System.out.println("숫자를 입력해주세요 : ");
			n = scan.nextInt();
			sum += n; 
		}
		
		System.out.println("합은 : "+ sum);

	}

}
