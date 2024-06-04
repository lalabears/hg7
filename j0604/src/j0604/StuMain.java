package j0604;
import java.util.Scanner;
public class StuMain {
	public static void main(String[] args) {
		// 출력 > 입력 > 검색 > 수정 > 등수
		Scanner scan = new Scanner(System.in);
		// 객체 배열을 생성해서 
		int num = 10;
		Students[] stu = new Students[num];
		int count = 0; 
		String sName =""; 
		loop: while(true) {
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
			switch(input) {
			case 1: 
				System.out.println("[학생 성적 입력]");
				for(int i = count ; i < stu.length; i++) {
					stu[i] = new Students(); // 객체생성
					System.out.println((i+1)+"번 학생의 이름을 입력(0.상위메뉴)");
					stu[i].name = scan.next();
					if(stu[i].name.equals("0")) break; 
					System.out.println("국어점수를 입력해주세요");
					stu[i].kor = scan.nextInt();
					System.out.println("영어점수를 입력해주세요");
					stu[i].eng = scan.nextInt();
					System.out.println("수학점수를 입력해주세요");
					stu[i].math = scan.nextInt();
					stu[i].sum();
					stu[i].average();
					stu[i].no = i+1; 
					count++;
				}
				break;
				
			case 2:
				System.out.println("[학생 성적 출력]");
				for(int i = 0 ; i <Students.title.length; i++) {
					System.out.printf("%s\t",Students.title[i]);
				}
				System.out.println();
				System.out.println("------------------------------------");
				for(int i = 0 ; i<count; i++) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					stu[i].no,stu[i].name,stu[i].kor,stu[i].eng, stu[i].math, 
					stu[i].total, stu[i].avg, stu[i].rank);
				}
				break; 
			case 5: 
				int ck = 0; // 있으면 1 없으면 0 
				System.out.println("[학생 검색 출력]");
				System.out.println("검색할 학생의 이름을 입력해주세요 ");
				sName = scan.next();
				for(int i = 0 ; i < count ; i ++ ) {
					if(stu[i].name.equals(sName)) {
						ck = 1; 
						for(int j = 0 ; j <Students.title.length; j++) {
							System.out.printf("%s\t",Students.title[j]);
						}
						System.out.println();
						System.out.println("------------------------------------");
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
								stu[i].no,stu[i].name,stu[i].kor,stu[i].eng, stu[i].math, 
								stu[i].total, stu[i].avg, stu[i].rank);
					}
			
					
				}
				if(ck == 0) System.out.println("입력한 학생이 존재하지 않습니다");
				break;
			case 0: 
				break loop; 
			default: 
				System.out.println("잘못입력하셨습니다");
			}
		}
		
		
		
	}

}
