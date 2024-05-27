package j0527;

import java.util.Arrays;
import java.util.Scanner;

public class C0527_10 {

	public static void main(String[] args) {
		
		int[] num ;  // int 타입의 배열을 선언 
		num = new int[5]; // 5칸 배열 생성
		
		System.out.println(num); // 주소값 출력 
		System.out.println(num[0]); // 디폴트값 출력 
		
		// 3칸 배열을 생성해서 1,2,3 숫자를 넣어보세요 
		int[] number = new int[3]; // 3칸배열생성
		number[0] = 1;
		number[1] = 2; 
		number[2] = 3;
		// arr 전체 출력 
		System.out.println(Arrays.toString(number));
		
	//	int[] numA = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] numA = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(numA));
		
		
		// 45칸 배열을 생성하고 숫자를 1-45까지 숫자를 넣어보세요 ?
		// 반복문 사용 
		int[] arr = new int[45];
		for (int i = 0; i<45;i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));

		// 3칸 정수 타입의 배열을 만들어서 
		// 입력한 숫자 3개를 배열에 넣어보세요 (for)
		Scanner scan = new Scanner(System.in);
		int[] arr1 = new int[3]; // 3칸 정수타입 배열 생성 
		for(int i = 0 ; i < 3; i ++) {
			System.out.println("숫자 입력 : ");
			int n = scan.nextInt();  // 숫자를 콘솔창으로 부터 입력받음 
			arr1[i] = n; 
		}
		System.out.println(Arrays.toString(arr1));
		// 5 칸 문자열 타입의 배열을 만들어서 
		// 이름 5개 입력 받아서 배열에 순차적으로 넣어주기 

		String[] name = new String[5]; 
		for(int i = 0 ; i< 5 ; i ++) {
			System.out.println("이름 입력 : ");
			name[i] = scan.next();
		}
		
		//int[] stu_no = new int[5];
		//stu_no[0] = 1; 
		int[] stu_no = new int[]{1,2,3,4,5}; 
		// 5칸 . 1-5까지 넣은 배열 만들기 
		// name은 위에서 입력받은 5칸 배열 사용하기. 
		int[] kor = {100,95,90,98,100};
		int[] eng = {80, 90,100,70,56};
		// 5칸 1-100 사이의 랜덤한 숫자 5개 넣기 
		int[] math = new int[5];
		for(int i = 0 ; i < 5 ; i ++) {
			math[i] = (int)(Math.random()*100)+1; 
		}
		//System.out.println(Arrays.toString(stu_no));		System.out.println(Arrays.toString(name));		System.out.println(Arrays.toString(math));
		//  total, avg 배열 5칸 짜리 생성해서 
		int[] total = new int[5];
		double[] avg = new double[5];
		//  kor, eng, math값을 사용해서 배열에 값 채워주기
		for(int i = 0 ; i < 5 ; i ++) {
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0; 
		}
		//System.out.println(Arrays.toString(total));		System.out.println(Arrays.toString(avg));
		// 5명의 학생 성적 출력해보기 - 배열사용 . 
		System.out.println("----------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		for(int i = 0 ; i < 5; i++ ) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n",stu_no[i],name[i],kor[i],eng[i],math[i],total[i],avg[i] );
		}
	}

}
