package stuProject;

import java.util.Scanner;

public class StuMain {
	public static void main(String[] args) {
//		Student stu = new Student();
//		stu.name = "홍길동"; -> 불가능 private멤버이므로
//		Student stu1 = new Student("홍길동",100,100,100);
		Scanner scan = new Scanner(System.in);
		int choice = 0; 
		int count = 0; 
		String sName = "";
		int chk = 0; 
		int kor=0, eng=0, math=0;
		Student[] s = new Student[10];
		loop: while(true) {
			System.out.println("-------------------- ");
			System.out.println(" [ 성적처리 프로그램 ]");
			System.out.println(" 1. 성적 입력 ");
			System.out.println(" 2. 성적 출력 ");
			System.out.println(" 3. 성적 수정 ");
			System.out.println(" 4. 등수 처리 ");
			System.out.println(" 5. 학생 성적 검색 ");
			System.out.println(" 0. 프로그램 종료 ");
			System.out.println("-------------------- ");
			System.out.println("원하는 번호를 입력하세요 ");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("입력");
				
				break;
			case 2:
				//함수로
				break;
			case 0:
				System.out.println("프로그램을 종료합니다. ");
				break loop;	
			}// switch
			
		} // while - true 
		

	}// main 
	
	// 학생입력메서드
	
	// 출력 메서드 

}// class
