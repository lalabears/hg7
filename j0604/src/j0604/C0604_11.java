package j0604;
import java.util.Scanner;
public class C0604_11 {
	// 클래스 변수
	static Scanner scan = new Scanner(System.in); 
	static String[] title = {"번호","국어","영어","수학","합계","평균"};
	
	// 클래스 메서드 - main 
	public static void main(String[] args) {
		
		// 1. 변수 선언 
		int[] arr = new int[6];   // 6칸 배열을 선언 및 생성 
		System.out.println(arr);  // 배열의 주소 
		// 2. 함수 호출 및 연산
		input(arr); // 값을 넣는 메서드
		// > arr[0], arr[1], arr[2], arr[3] 값이 채워진 상태 
		calculate(arr); // 총합 평균을 계산하는 메서드 
		// > arr[4], arr[5]  채워짐 
		print(arr);
		
		
	}
	static void input(int[] arr) {
		// scan.nextInt()로 입력받기 
		// 번호, 국, 영, 수 점수를 입력받아 합계, 평균(int)를 구해서 배열에 저장
		// 0:번호 1:국어 2:영어 3:수학 4, 5 합계평균을 넣어서 계산해서 출력(main)
		for(int i = 0 ; i < 4; i++ ) {
			System.out.println(title[i]+"를 입력:");
			arr[i] = scan.nextInt();
		}  
	}
	// 클래스 메서드 사용 함수명 calculate(배열).
	static void calculate(int[] arr) {
		// arr 의 4번방에는 1,2,3 번방 값 합계
		arr[4] = arr[1]+arr[2]+arr[3];
		// arr 의 5번방에는 1,2,3 번방의 평균
		arr[5] = arr[4]/3;
	}
	static void print(int[] arr) {
		// 출력 
		for(int i = 0 ; i < title.length;i++) {	System.out.print(title[i]+"\t");}
		System.out.println();
		for(int i = 0 ; i < arr.length;i++) {System.out.print(arr[i]+"\t");	}
		System.out.println();
	}

}
