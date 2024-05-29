package j0529;
import java.util.Scanner;
public class C0529_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 변수선언 
		int input = 0 ; 
		int num = 10; // 학생 수 
		int count = 0 ; // 입력된 학생 수 
		// 1차원 배열로 , 이름, 국어, 영어, 수학, 총점, 평균 배열을 학생 수 크기로 만듦
		String[] name = new String[num]; 
		int[] kor = new int[num];
		int[] eng = new int[num];
		int[] math = new int[num];
		int[] total = new int[num];
		double[] avg = new double[num];
		while(true) { // 무한반복문. 
			// 2. 화면 출력 
			System.out.println(" [ 성적처리 프로그램 ] ");
			System.out.println(" 1. 성적 입력 ");
			System.out.println(" 2. 성적 출력 ");
			System.out.println(" 0. 프로그램 종료 ");
			System.out.println(" -------------------- ");
			System.out.println(" 원하는 번호를 입력하세요 ");
			input = scan.nextInt();
			if(input == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; // 무한반복문 탈출 
			}
			// 3.조건문 
			switch(input) {
			case 1:
				System.out.println("[ 성적입력 ]");
				// 학생이 존재하지 않을때 count = 0 임. 따라서 i = 0 부터 입력 할 수 있음. 
				// 학생을 2명 입력하고 상위메뉴로 이동했을때 count에는 2가 저장되어있기때문에 
				// 다시 case 1로 들어왓을때 i = 2부터 시작할 수 있음. 
				for(int i = count ; i < num ; i++ )	{
					System.out.println((i+1)+"번째 학생을 입력해주세요(0.이전페이지이동)");
					name[i] = scan.next();
					if(name[i].equals("0")) break; // 0을 눌렀을때 for문을 탈출함. 
					System.out.println("국어점수를 입력해주세요");
					kor[i] = scan.nextInt();
					System.out.println("영어점수를 입력해주세요");
					eng[i] = scan.nextInt();
					System.out.println("수학점수를 입력해주세요");
					math[i] = scan.nextInt();
					total[i] = kor[i]+eng[i]+math[i];
					avg[i] = total[i]/3.0;
					count++;  // 학생 1명입력한 후 학생수 1 증가 
				}//for 
				break; // case 1 실행 후 switch문 탈출 
			case 2:
				System.out.println("[ 성적출력 ]");
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
				System.out.println("--------------------------------------------");
				for(int i = 0 ; i < count ; i++) {
					// count 는 학생 수를 저장하는 변수로 학생수 만큼만 출력을 함
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
				}
				if(count==0) {
					System.out.println("학생이 존재하지 않습니다");
					System.out.println();
				}
				break;
			default:
				System.out.println("잘못입력하셨습니다");
			}//switch
		}// while
		
	}// main
}// class
