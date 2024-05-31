package j0531;
import java.util.Scanner;
public class C0531_08_학생성적 {
	public static void main(String[] args) {
		// 2차원 배열로 학생성적 프로그램을 완성해보세요 . 
		int num = 10;  // 학생 수 
		int[] sno = new int[num];
		String[] name = new String[num]; // 학생의 이름을 저장할 배열
		int[][] score = new int[num][4];
		double[] avg = new double[num]; // 평균을 저장할 배열 
		int[] rank = new int[num]; // 등수를 저장할 배열 
		int count = 0 ; // 몇번째 학생이 입력되고있는지 세보기 위한 변수 
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int stu_no;
		String sName;
		Scanner scan = new Scanner(System.in);
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
			if(input == 0) {
				System.out.println("프로그램이 종료되었습니다");
				break; // if 문 제외 가장가까운 중괄호가 종료된다. 즉 while문 종료. 
			}
			switch(input) {
			case 1: 
				System.out.println("[학생 성적 입력]");
				for(int i = count ; i < num ; i ++ ) {
					System.out.println((i+1)+"번 학생의 이름을 입력해주세요 (0.종료)");
					name[i] = scan.next();
					if(name[i].equals("0")) break; // for문 종료 
					int sum = 0 ; 
					// j는 점수. j=0국 j=1영 j=2수 j=3 총점
					for(int j = 0 ; j < 3 ; j ++) {
						System.out.println(title[j+2]+"점수를 입력해주세요");
						score[i][j] = scan.nextInt();
						sum += score[i][j];
					}
					score[i][3] =sum; 
					avg[i] = sum/3.0; 
					sno[i] = i+1;
					count++; 
				}
				
				break; 
			case 2:
				System.out.println("[학생 성적 출력]");
				for(int i = 0 ; i <title.length; i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("------------------------------------");
				for(int i = 0 ; i<count; i++) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",sno[i],name[i],score[i][0],score[i][1],score[i][2],score[i][3],avg[i],rank[i]);
				}
				break; 
			case 3:
				System.out.println("[학생 성적 수정]");
				stu_no=-1; // 검색된 학생이 유무를 확인 
				int cnt=0;  //검색된 학생의 수
				sName = "";
				System.out.println("수정하고싶으신 학생의 이름을 입력해주세요 ");
				sName = scan.next();
				for(int i =0; i<title.length;i++) {
					System.out.printf("%s\t", title[i]);
				}
				System.out.println();
				System.out.println("----------------------------------------------");
				for(int i = 0; i<count; i++) {
					if( name[i].contains(sName)) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",sno[i],name[i],score[i][0],score[i][1],score[i][2],score[i][3],avg[i],rank[i]);
						cnt++; // 검색된 학생의 수만큼 cnt가 증가함. 
						stu_no = i; 
					}
				}
				if(cnt == 0 ) {
					System.out.println("학생이 존재하지 않습니다.");
				}else if(cnt>1) {
					System.out.println("몇번 학생의 성적을 수정하시겠습니까? ");
					int no = scan.nextInt();
					stu_no = (no-1); // 인덱스는 0번부터 시작하기 때문에 
				}
				System.out.println(name[stu_no]+"학생을 선택하셨습니다.");
				System.out.println("1.국어 2.영어 3.수학 원하시는 과목을 선택해주세요");
				int subject = scan.nextInt();
				if(subject == 1) {
					System.out.println(name[stu_no]+"학생의 현재국어점수 : "+ score[stu_no][0]);
					System.out.println("수정하고싶은 점수를 입력해주세요 ");
					score[stu_no][0] = scan.nextInt(); // 입력받은 점수로 국어점수 수정 
					score[stu_no][3] = score[stu_no][0]+score[stu_no][1]+score[stu_no][2];
					avg[stu_no] = score[stu_no][3]/3.0;
				}else if(subject == 2) {
					System.out.println(name[stu_no]+"학생의 현재영어점수 : "+ score[stu_no][1]);
					System.out.println("수정하고싶은 점수를 입력해주세요 ");
					score[stu_no][1] = scan.nextInt(); // 입력받은 점수로 국어점수 수정 
					score[stu_no][3] = score[stu_no][0]+score[stu_no][1]+score[stu_no][2];
					avg[stu_no] = score[stu_no][3]/3.0;
				}else if(subject == 3) {
					System.out.println(name[stu_no]+"학생의 현재수학점수 : "+ score[stu_no][2]);
					System.out.println("수정하고싶은 점수를 입력해주세요 ");
					score[stu_no][2] = scan.nextInt(); // 입력받은 점수로 국어점수 수정 
					score[stu_no][3] = score[stu_no][0]+score[stu_no][1]+score[stu_no][2];
					avg[stu_no] = score[stu_no][3]/3.0;
				}
				System.out.println("학생성적 수정이 완료되었습니다.");
				break; 
			case 4:
				System.out.println("[학생 등수 처리]");
				for (int i = 0; i < count; i++) {
					int rankCnt=1;
					for(int j = 0 ; j <count; j++) {
						// {160, 60, 285}    {160,60,285}
						if(score[i][3] < score[j][3]) {
							rankCnt++;
						}
					}
					rank[i] = rankCnt;
				}			
				System.out.println("등수처리가 완료되었습니다 ... ");
				break; 
			case 5:
				System.out.println("[학생 검색 출력]");
				stu_no=-1; // 검색된 학생이 유무를 확인 
				sName = "";
				System.out.println("검색하고싶으신 학생의 이름을 입력해주세요 ");
				sName = scan.next();
				for(int i =0; i<title.length;i++) {
					System.out.printf("%s\t", title[i]);
				}
				System.out.println();
				System.out.println("----------------------------------------------");
				for(int i = 0; i<count; i++) {
					if( name[i].contains(sName)) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",sno[i],name[i],score[i][0],score[i][1],score[i][2],score[i][3],avg[i],rank[i]);
						stu_no = i; 
					}
				}
				if(stu_no == -1 ) System.out.println("학생이 존재하지 않습니다.");
				break; 
			}
			
		} // while-true

	}// main

}// class
