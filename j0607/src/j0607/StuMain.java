package j0607;
import java.util.Scanner;
public class StuMain {
	// 클래스변수 선언 - static 자료형 변수명 ; 
	// 클래스변수는 클래스 메서드에서 사용이가능함. 
	// 인스턴스변수는 클래스메서드에서 사용이 불가능함. 
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 객체 배열 생성 
		Student[] stu = new Student[10]; 
		int count=0; // 학생수를 나타내는 변수 
		// 학생이 한명입력될때마다 count 증가시키기 
		loop: while(true) {
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 정보 출력");
			System.out.println("0.종료");			
			System.out.println("---------------");
			int choice = scan.nextInt();
			switch(choice) {
			case 1: 
				count = stuInput(stu, count);
				// System.out.println(count+"명");
				break;
			case 2:
				printStu(stu, count);
				break;
			case 0:
				break loop;  // break 별명 -> 별명에 해당하는 조건문종료
			}
		}
		
	//	stuInput
	//	printStu
		
		
		
		
		
	//	stuInput(stu); // stu의 주소를 전달 
		// 클래스메서드 호출은 객체선언없이 가능함. 
		// 클래스명.메서드명 으로 호출(같은 클래스내에 존재한다면 클래스명은 생략이 가능)            
//		printStu(stu);
		
		
		
		/*
		// 1. 기본생성자로 학생한명 객체 만드는 방법 
		Student s1 = new Student(); 
		s1.name = "홍길동";
		s1.kor = 100; 
		s1.eng = 100;
		s1.math = 90; 
		s1.sum();
		s1.average();
		s1.printStu();
		
		// 2. 매개변수가 있는 생성자로 객체 만드는 방법 
		Student s2 = new Student("유관순",100,90,100);
		s2.printStu();
*/		
		
	}// main
	
	static int stuInput(Student[] stu, int count) {
		String name;
		int kor, eng, math; 
		for(int i = count ; i < stu.length ; i++ ) {
			System.out.println("이름: (0.상위메뉴)");
			name = scan.next();
			if(name.equals("0")) break; //for문을 종료
			System.out.println("국어");
			kor = scan.nextInt();
			System.out.println("영어");
			eng = scan.nextInt();
			System.out.println("수학");
			math = scan.nextInt();
			// 매개변수가 있는 객체를 생성 
			stu[i] = new Student(name, kor, eng, math);
			count++; 
		} // for
		return count;
	} // stuInput()
	
	static void printStu(Student[] stu, int count) {
		// 출력부분을 printStu()라는 메서드를 만들어서 실행시키기 
		for(int i = 0 ; i < count ; i ++) {
			stu[i].printStu();
		}
	}
	
	/*	stuInput() 메서드를 만들어서. 
	3명의 학생 객체 배열을 만들어서. 
	학생 3명의 정보를 생성해 보세요 
	(입력은 scanner로 입력받아서 이름, 국,영,수 입력받기)
	출력은 main에서 해보세요 */
	
	
}// class
