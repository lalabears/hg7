package j0531;

import java.util.Scanner;

public class C0531_04 {

	public static void main(String[] args) {
		// 학생성적 입력 - 출력 
		Scanner scan = new Scanner(System.in);
		int num = 10; 
		String[] name = new String[num]; 
		int[][] score = new int[num][4]; // 국,영,수, 총점 저장 
		double[] avg = new double[num];
		int count = 0 ; // 학생의 수 
		String[] title = {"이름","국어","영어","수학","총점","평균"};
		while(true) {
			// i > 학생번호 (0~)
			for(int i = count ; i < num ; i ++ ) {
				System.out.println((i+1)+"번 학생의 이름을 입력해주세요 (0.종료)");
				name[i] = scan.next();
				if(name[i].equals("0")) break; // for문 종료 
				int sum = 0 ; 
				// j는 점수. j=0국 j=1영 j=2수 j=3 총점
				for(int j = 0 ; j < 3 ; j ++) {
					System.out.println(title[j+1]+"점수를 입력해주세요");
					score[i][j] = scan.nextInt();
					sum += score[i][j];
				}
				score[i][3] =sum; 
				avg[i] = sum/3.0; 
				count++; 
			}
			
			// 출력부 :
			System.out.println("-------------------------------------");
			System.out.println("[성적출력]");
			for(int i = 0 ; i <title.length; i++) {
				System.out.printf("%s\t",title[i]);
			}
			System.out.println();
			System.out.println("------------------------------------");
			for(int i = 0 ; i<count; i++) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],score[i][0],score[i][1],score[i][2],score[i][3],avg[i]);
			}
			
			
			
		}
		
		
		
		

	}

}
