package j0605;
import java.util.Scanner;
public class C0605_12_stu {
	// 클래스변수로 선언 -> 클래스메서드에서 사용이가능함. (인스턴스변수사용불가)
	static Scanner scan = new Scanner(System.in);
	// main 함수  - static ! 클래스메서드!! 
	public static void main(String[] args) {
		int kor=0, eng=0, math=0;  // 지역변수 
		int count =0 ; // 학생의 수를 세는 변수 
		String name=""; 
		Stu[] students = new Stu[10];
		loop: while(true) {
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("번호를선택해주세요(0.종료) ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:	// 입력 
				count = stuInput(count, students, name, kor, eng, math);
				break;
			case 2:	// 출력 
				stuPrint(count,students);
				break;
			case 0: 
				break loop;
			} // switch
		}// while-true
		
		
		
		
	} //main
	
	// stuInput()메서드 
	static int stuInput(int count, Stu[] students, String name,int kor, int eng, int math) {
		for(int i = count ; i<students.length;i++) {
			System.out.println((i+1)+"번 학생 이름 : (종료0) ");
			name = scan.next();
			if(name.equals("0")) break;
			System.out.println("국어");
			kor = scan.nextInt();
			System.out.println("영어");
			eng = scan.nextInt();
			System.out.println("수학");
			math = scan.nextInt();
			students[i] = new Stu((i+1), name, kor,eng, math);
			count++; 
		}// for 
		return count; 
	} // stuInput
	static void stuPrint(int count, Stu[] students) {
		for(int i = 0 ; i<count;i++) {
			students[i].printAttr();
		}
	}// stuPrint
	

}// class
