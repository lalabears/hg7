package j0604;
import java.util.Arrays;
import java.util.Scanner;
public class C0604_10 {
	public static void main(String[] args) {
		// 객체 선언 및 생성 
		Cal4  c = new Cal4(); 
		int[] num = new int[2]; // 방이2개인 배열 생성 
		c.calculate(num, 10, 5);
		System.out.println(Arrays.toString(num));
		int[] num2 = new int[2]; // 방이2개인 배열 생성 
		c.n1 = 30; 
		c.n2 = 6; 
		c.cal1(num2);
		System.out.println(Arrays.toString(num2));
		
		// 새로운 객체를 생성해서 . 인스턴스변수를 사용해서.
		int[] r = new int[4]; 
		// 0. 덧셈결과 1. 뺄셈결과 2.곱셈결과 3.나눗셈결과(정수)
		Cal4  a = new Cal4(); 
		a.n1 = 77;
		a.n2 = 31; 
		a.run(r);
		System.out.println(Arrays.toString(r));
		
		// 번호, 국, 영, 수 점수를 입력받아 cal2 ()
		// 합계, 평균(int)를 구해서 return 해보세요 
		int[] arr = new int[6];
		// 0:번호 1:국어 2:영어 3:수학 4, 5 합계평균을 넣어서 계산해서 출력(main)
		Scanner scan = new Scanner(System.in); 
		String[] title = {"번호","국어","영어","수학","합계","평균"};
		for(int i = 0 ; i < 4; i++ ) {
			System.out.println(title[i]+"를 입력:");
			arr[i] = scan.nextInt();
		}
		Cal4 b = new Cal4(); 
		b.cal2(arr);
		for(int i = 0 ; i < title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		for(int i = 0 ; i < arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
	}

}
