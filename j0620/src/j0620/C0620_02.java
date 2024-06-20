package j0620;
import java.util.Scanner;
public class C0620_02 {
	// 클래스 변수로 scanner를 만듦. 
	// static으로 만든 변수는 static메서드에서 사용할 수 있다. 
	static Scanner scan = new Scanner(System.in);
	static RectangleController rc = new RectangleController();
	static CircleController cc = new CircleController();
	
	public static void main(String[] args) {
		
		loop: while(true) {
			System.out.println("=====메뉴=====");
			System.out.println("1. 원 ");
			System.out.println("2. 사각형 ");
			System.out.println("0. 종료 ");
			System.out.println("=============");
			System.out.println("메뉴를 선택해주세요");
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				circleMenu(); // 객체를 선언하지 않고 메서드 호출 : static메서드
				break;
			case 2:
				rectangleMenu(); // 리턴없고, 매개변수 없음
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop; 
			}// switch
		}// while

	}// main 
	
	static void circleMenu() {
		System.out.println("=====원메뉴=====");
		System.out.println("1. 원 둘레 구하기");
		System.out.println("2. 원 넓이 구하기");
		System.out.println("0. 메인메뉴로 .. ");
		System.out.println("번호를 입력해주세요");
		int menu = scan.nextInt();
		if(menu == 1) {
			calcCircum();
		}else if(menu == 2) {
			calcCirArea();
		}else if(menu == 0) {
			return;
		}else {
			circleMenu(); 
		}
	} // circle menu	
	static void rectangleMenu() {
		System.out.println("=====원메뉴=====");
		System.out.println("1. 사각형 둘레 구하기");
		System.out.println("2. 사각형 넓이 구하기");
		System.out.println("0. 메인메뉴로 .. ");
		System.out.println("번호를 입력해주세요");
		int menu = scan.nextInt();
		if(menu == 1) {
			calcPerimeter();
		}else if(menu == 2) {
			calcRectArea();
		}else if(menu == 0) {
			return;
		}else {
			rectangleMenu(); 
		}
	}// rect menu
	static void calcCircum(){
		System.out.println("원둘레 ");
		System.out.println("X좌표 : ");
		int x = scan.nextInt();
		System.out.println("Y좌표 : ");
		int y = scan.nextInt();
		System.out.println("반지름 : ");
		int r = scan.nextInt();	
		System.out.println(cc.calcCircum(x, y, r));
		
	}
	static void calcCirArea(){
		System.out.println("원넓이");
		System.out.println("X좌표 : ");
		int x = scan.nextInt();
		System.out.println("Y좌표 : ");
		int y = scan.nextInt();
		System.out.println("반지름 : ");
		int r = scan.nextInt();	
		System.out.println(cc.calcCirArea(x, y, r));
	}
	static void calcPerimeter(){
		System.out.println("사각형둘레 호출");
		System.out.println("X좌표 : ");
		int x = scan.nextInt();
		System.out.println("Y좌표 : ");
		int y = scan.nextInt();
		System.out.println("높이 : ");
		int h = scan.nextInt();
		System.out.println("너비 : ");
		int w = scan.nextInt();
		System.out.println(rc.calcPerimeter(x, y, w, h));
	}
	static void calcRectArea(){
		System.out.println("사각형넓이 호출");
		System.out.println("X좌표 : ");
		int x = scan.nextInt();
		System.out.println("Y좌표 : ");
		int y = scan.nextInt();
		System.out.println("높이 : ");
		int h = scan.nextInt();
		System.out.println("너비 : ");
		int w = scan.nextInt();
		System.out.println(rc.calcRectArea(x, y, w, h));
	}
	

}// class 
