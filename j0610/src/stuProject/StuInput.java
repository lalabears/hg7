package stuProject;
import java.util.Scanner;
public class StuInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 객체배열
		Student[] s = new Student[3];
		//Student stu = new Student("홍길동",100,100,100);
		//stu.printStuInfo();
		String name;
		int kor,eng,math;
		for(int i = 0; i < s.length; i++) {
			System.out.println("이름:");
			name = scan.next();
			System.out.println("국어:");
			kor = scan.nextInt();
			System.out.println("영어:");
			eng = scan.nextInt();
			System.out.println("수학:");
			math = scan.nextInt();
			// 객체 생성
			s[i] = new Student(name,kor,eng,math);			
		}
		for(int i = 0 ; i <s.length; i++ ) {
			s[i].printStuInfo();
		}
	}
}
