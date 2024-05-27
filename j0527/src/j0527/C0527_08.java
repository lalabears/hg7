package j0527;

import java.util.Scanner;

public class C0527_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생 성적 프로그램. 
		/*
		[학생 성적 프로그램 ]
		1. 성적입력
		2. 성적출력
		3. 종료
		-----------------------
		원하는 번호를 입력해주세요 : 
		번호입력받지말고 n = 1
		변수 : 번호, 이름, 국, 영, 수, 총점, 평균 
		입력 : 이름, 국, 영, 수
		 */
		// 1. 변수선언 
		int n=1, kor=0,eng=0,math=0,total=0;
		double avg = 0; 
		String name ="";
		loop: while(true) {
			System.out.println("[학생 성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력해주세요 :");
			int ch = scan.nextInt();
			switch(ch) {
			case 1: // 성적입력
				System.out.println("이름:");
				name= scan.next();
				System.out.println("국어");
				kor = scan.nextInt();
				System.out.println("영어");
				eng = scan.nextInt();
				System.out.println("수학");
				math = scan.nextInt();
				// 총점, 합계
				total = kor+eng+math;
				avg = total/3.0; 
				break;
			case 2: // 성적출력 
				System.out.println("----------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println("----------------------------------------------------");	
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n",n, name,kor,eng,math,total,avg );
				break;
			case 3: // 프로그램종료 
				break loop;
			}
			
			
			
				
		
		
		} // while-true
	} //main

}// class
