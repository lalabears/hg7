package j0530;
import java.util.Scanner;
public class C0530_11_학생성적 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//   출력2 > 입력1 > 검색5 > 수정3 > 등수4 순으로 하시는게 편합니다. 
		int num = 10;  // 학생 수 
		String[] name = new String[num]; // 학생의 이름을 저장할 배열
		int[][] score = new int[num][4];
		double[] avg = new double[num]; // 평균을 저장할 배열 
		int[] rank = new int[num]; // 등수를 저장할 배열 
		int count = 0 ; // 몇번째 학생이 입력되고있는지 세보기 위한 변수 
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		while(true) {
			System.out.println(" [ 성적처리 프로그램 ] ");
			System.out.println(" 1. 성적 입력 ");
			System.out.println(" 2. 성적 출력 ");
			System.out.println(" 3. 성적 수정 ");
			System.out.println(" 4. 등수 처리 ");
			System.out.println(" 5. 학생 성적 검색 ");
			System.out.println(" 0. 프로그램 종료 ");
			System.out.println(" -------------------- ");
			System.out.println(" 원하는 번호를 입력하세요 ");
			int input = scan.nextInt();
		} // while-true

	} // main

}// class
