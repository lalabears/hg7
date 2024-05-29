package j0529;
import java.util.Scanner;
public class C0529_11_학생성적 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 10;  // 학생 수 
		String[] name = new String[num]; // 학생의 이름을 저장할 배열
		int[] kor = new int[num]; // 국어점수를 저장할 배열
		int[] eng = new int[num]; // 영어점수를 저장할 배열 
		int[] math = new int[num]; // 수학점수를 저장할 배열
		int[] total = new int[num]; // 총점을 저장할 배열
		double[] avg = new double[num]; // 평균을 저장할 배열 
		int[] rank = new int[num]; // 등수를 저장할 배열 
		int count = 0 ; // 몇번째 학생이 입력되고있는지 세보기 위한 변수 
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
				for(int i = count ; i < num ; i++) {
					System.out.println((i+1)+"번 학생의 이름을 입력해주세요(상위이동 0)");
					name[i] = scan.next();
					if(name[i].equals("0")) break; // for문종료 > switch 종료
					System.out.println("국어점수를 입력해주세요 ");
					kor[i] = scan.nextInt();
					System.out.println("영어점수를 입력해주세요 ");
					eng[i] = scan.nextInt();
					System.out.println("수학점수를 입력해주세요 ");
					math[i] = scan.nextInt();
					total[i] = kor[i]+eng[i]+math[i];
					avg[i] = total[i]/3.0;
					count++; // 학생 한명 입력이 완료되었음 > 학생수1 증가 
				}
				break; 
			case 2:
				System.out.println("[학생 성적 출력]");
				System.out.println("----------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
				System.out.println("----------------------------------------------------");
				for(int i = 0 ; i < count ; i++) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n",(i+1),name[i],kor[i],eng[i],math[i],total[i],avg[i],rank[i] );
				}
				break; 
			case 3:
				System.out.println("[학생 성적 수정]");
				System.out.println("검색할 학생의 이름을 입력해주세요 ");
				String mName = scan.next();
				int mNo = -1; // 성적 수정할 학생이 있는 인덱스 위치 변수 
				for(int i = 0 ; i < count ; i ++) {
					if(name[i].equals(mName)) {
						mNo = i; 
					}
				}
				if (mNo == -1) { // 학생이 존재하지 않는경우 
					System.out.println("검색하신 학생이 존재하지 않습니다. ");
					break; 
				}
				
				System.out.println("수정하고싶은 과목을 선택해주세요 ");
				System.out.println("1.국어   2.영어    3.수학 ");
				int subject = scan.nextInt(); // 수정할 과목을 선택 
				switch(subject) {
				case 1: 
					System.out.println("국어 성적 수정을 선택하셨습니다. ");
					System.out.println(mName+"님의 현재 국어점수는 : " + kor[mNo]+"점 입니다");
					System.out.println("수정할 점수를 입력해주세요 ");
					kor[mNo]=scan.nextInt();
					total[mNo] = kor[mNo]+eng[mNo]+math[mNo];
					avg[mNo] = total[mNo]/3.0;
					System.out.println("국어점수 수정을 완료하였습니다");
					break; 
				}
				
				break; 
			case 4:
				System.out.println("[학생 등수 처리]");
				for(int i = 0 ; i < count ; i ++ ) {
					int rankCnt=1;
					for(int j = 0 ; j <count ; j++) {
						if(total[i] < total[j]) {
							rankCnt++;
						}
					}
					rank[i] = rankCnt;
				}
				
				System.out.println("등수처리가 완료되었습니다 ... ");
				break; 
			case 5:
				System.out.println("[학생 검색 출력]");
				System.out.println("검색할 학생의 이름을 입력해주세요 ");
				String sName = scan.next();
				System.out.println("----------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
				System.out.println("----------------------------------------------------");
				
				int s_no = -1; 
				// 입력된 학생까지만 검색 
				for(int i = 0 ; i < count ; i++ ) {
					if(name[i].equals(sName)) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n",(i+1),name[i],kor[i],eng[i],math[i],total[i],avg[i],rank[i] );
						s_no = i; 
					}
				}
				if(s_no ==-1) {
					System.out.println("검색하신 학생은 존재하지 않습니다. 다시 확인해주세요");
				}
				
				break; 
			}
				


		} //while
	}// main
}// class
