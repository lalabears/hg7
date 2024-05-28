package j0528;

import java.util.Scanner;

public class C0528_학생성적 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		// 모두 1차원 배열 
		// 5 명의 학생, 이름, 국어, 영어, 수학 점수를 입력받아. 
		// 1. 성적입력, 2. 성적출력
		// ++ 학생이름으로 검색을 하고 해당학생의 성적만 출력해주는 5번. i번째
		// 가능하다면 3번도 해보세요 . 
		// 3번 : 수정할 학생이름 입력받기. > 수정하고싶은 과목명입력받기 .
		int num = 5; 
		int[] no = new int[num];
		String[] name = new String[num];
		int[] kor = new int[num];
		int[] eng = new int[num];
		int[] math = new int[num];
		int[] total = new int[num];
		double[] avg = new double[num];
		int count = 0 ; // 몇번째 학생인지. 
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
			int choice = scan.nextInt();
				
			switch(choice) {
			case 1:
				System.out.println("[성적입력]");
				System.out.println("이름");
				name[count]= scan.next();
				System.out.println("국어: ");
				kor[count] = scan.nextInt();
				System.out.println("영어: ");
				eng[count] = scan.nextInt();
				System.out.println("수학: ");
				math[count] = scan.nextInt();
				no[count] = count;
				total[count] = kor[count]+eng[count]+math[count] ;
				avg[count] = total[count]/3.0;
				count++; 
				break;
			case 5:
				System.out.println("[학생검색출력]");
				// 이름을 입력을 받음
				// [홍길동, 유관순, 이순신, 김구, 강감찬]
				// 사용자 : 김구 > 3번째 있음
				// 몇번째 있는지 찾게되면. kor[3], eng[3] 
				// 존재하지 않는 학생입니다. 
				System.out.println("검색하고싶은 학생의 이름을 입력해주세요 ");
				String sname = scan.next();
				int stu_no = -1; 
				for(int i = 0; i< name.length ; i++) {
					if (name[i].equals(sname)) {
						stu_no = i; 
					}
				}
				if(stu_no != -1) {
					System.out.println("----------------------------------------------------");
					System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
					System.out.println("----------------------------------------------------");
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n",no[stu_no],name[stu_no],kor[stu_no],eng[stu_no],math[stu_no],total[stu_no],avg[stu_no] );

				}else {
					System.out.println("존재하지 않는 학생입니다. ");
				}
				break;
			case 2:
				System.out.println("[성적출력]");
				System.out.println("----------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println("----------------------------------------------------");
				for(int i = 0 ; i < name.length ; i ++ ) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n",no[i],name[i],kor[i],eng[i],math[i],total[i],avg[i] );
				}
				break;
			case 3:
				System.out.println("[성적수정]");
				break;
			case 4:
				System.out.println("[등수처리]");
				break;
			default:
				System.out.println("잘못선택하셨습니다.");
			}//switch




		} //while


	} // main

}//class
