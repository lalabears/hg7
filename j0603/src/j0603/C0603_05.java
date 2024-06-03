package j0603;

import java.util.Scanner;

public class C0603_05 {
	public static void main(String[] args) {
		// students 객체를 사용.
		// 학생 객체 배열을 만들어서 (5명) 
		// 학생의 성적을 입력받아 출력 
		Scanner scan = new Scanner(System.in);
		// 1. 학생 객체 배열을 만든다.
		int num = 3; 
		Students[] stu = new Students[num];
		// int[] n = new int[3]; 
		
		// 2. 학생 객체를 생성하고 값 넣기
		for(int i = 0 ; i < stu.length ; i ++ ) {
			stu[i] = new Students(); // 학생객체 생성
			stu[i].stuNo = i+1; 
			System.out.println((i+1)+"번 학생의 이름: ");
			stu[i].name = scan.next();
			System.out.println("국어");
			stu[i].kor = scan.nextInt();
			System.out.println("영어");
			stu[i].eng = scan.nextInt();
			System.out.println("수학");
			stu[i].math = scan.nextInt();
			stu[i].total();
			stu[i].avg();
		}
		// 3. 출력하기
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0 ; i < stu.length ; i ++ ) {
			stu[i].print();
		}
	}

}
