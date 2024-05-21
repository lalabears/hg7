package j0521;
import java.util.Scanner;
public class C0521_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 변수 : 번호, 이름, 국, 영, 수, 총점, 평균  
		 
		 출력
		 ----------------------------------------------------
		 번호	이름		국어		영어		수학		총점		평균
		 ---------------------------------------------------- 
		  1    홍길동    100      90      80     270     90.00
		*/
		
		// 번호, 이름, 국, 영 , 수를 입력을 받아 출력을 해보세요 
		
		// 변수 선언을 해주어야함. 
		int no, kor, eng, math, total;
		double avg; 
		
		System.out.print("학생의 이름을 입력해주세요 : ");
		String name = scan.nextLine();
		System.out.print("학생의 번호를 입력해주세요 : ");
		no = scan.nextInt(); 
		System.out.print("국어점수를 입력해주세요 : ");
		kor = scan.nextInt();
		System.out.print("영어점수를 입력해주세요 : ");
		eng = scan.nextInt();
		System.out.print("수학점수를 입력해주세요 : ");
		math = scan.nextInt();
		
		total = kor+eng+math; 
		avg = total/3.0; 
		
		System.out.println("----------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n",
				      no, name, kor, eng, math, total, avg) ;
		
		

	}

}
