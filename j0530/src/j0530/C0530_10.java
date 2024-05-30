package j0530;
import java.util.Arrays;
import java.util.Scanner;
public class C0530_10 {
	public static void main(String[] args) {
		// 필요한 배열 :
		// String 이름. 
		// double  - 평균.
		// kor, eng, math , total > int   score 변수로 묶어서 사용
		String[] name = {"홍길동", "유관순", "이순신"};
		double[] avg = new double[3];
		//int[][] scores = new int[10][4]; // kor, eng, math, total 
		// 행 : 서로다른 학생들 
		// 열 : 점수들
		int[][] scores = { {100,100,100,300} ,
				{90, 90, 90, 270},
				{100, 90, 100, 290}		} ;
		
		// 홍길동의 국어점수는 100입니다.
		System.out.println(name[0]+"의 국어점수는 "+scores[0][0]+"입니다");
		// 유관순의 총점은 270입니다 
		System.out.println(name[1]+"의 총점은 "+scores[1][3]+"입니다");
		
		// 세명의 학생의 평균을 avg배열에 넣어보세요 
		for(int i = 0 ; i < avg.length ; i++) {
			avg[i] = scores[i][3]/3.0;
		}
		System.out.println(Arrays.toString(avg));
	/*	이름   국어   영어   수학  총점   평균
		홍길동  100  100   100   300   100.00
		유관순  90   90     90   270   90.00
		이순신  100  90    100   290   96.67*/
		System.out.println("이름   국어   영어   수학   총점   평균");
		for(int i = 0; i <name.length; i++) {
			System.out.printf("%s  %3d  %3d  %3d  %3d   %.2f\n",
				name[i],scores[i][0],scores[i][1],scores[i][2],scores[i][3],avg[i]	);
		}
		
		// 등수매기기 1차원 버전. 
		
		
		
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		// 한 줄이 학생의 정보. 행 0 일때 1번 학생의 점수들의 배열이 
		//                  행 1 일때 2번 학생의 점수들이 들어감.  
		int[][] score = new int[2][4]; 
		// 점수를 입력받아 배열을 채워보세요 
		String[] title = {"국어","영어","수학","총점"};
		//            title[0] title[1] title[2]
		
		int total = 0; // 더하기위한변수 
		
		for(int i = 0 ; i < score.length; i++) {
			total = 0; 
			System.out.println((i+1)+"번 학생의 ");
			for(int j = 0 ; j <score[i].length-1; j++ ) {
				// 무슨점수를 입력해주세요
				System.out.println(title[j]+"점수를 입력해주세요 : ");
				score[i][j] = scan.nextInt();
				total += score[i][j];
			}
			score[i][3] = total; 
			System.out.println();
		}
		
		
		
		// 출력 
		for(int i = 0 ; i < score.length; i++) {
			for(int j = 0 ; j <score[i].length; j++ ) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}

	}

}
