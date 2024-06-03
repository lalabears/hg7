package j0603;
import java.util.Scanner;
public class C0603_08 {
	// 1. 변수
	
	// 2. 생성자 
	
	// 3. 메서드
	// 실행을 위해 존재 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 객체 선언 및 생성 
		C0603_08 c= new C0603_08();
		int[] num = new int[2];
		for(int i = 0 ; i < num.length; i++ ) {
			System.out.println((i+1)+"번째 숫자를 입력해주세요");
			num[i] = scan.nextInt();
		}
		System.out.println("합 : "+ c.add(num[0], num[1]));
		System.out.println("차 : "+ c.sub(num[0], num[1]));
		c.print();
		int r = c.add(11,20); // r이름의 메모리 공간에 11+20을더한값이 들어감
	}// main
	int add(int n1, int n2) {
		return n1+n2;
	} // add
	int sub(int n1, int n2) {
		int r = n1-n2;
		return r; 
	} // sub 
	void print() {
		System.out.println("이곳은 void 메서드로 리턴값이 없습니다.");
	}
	
}//class
