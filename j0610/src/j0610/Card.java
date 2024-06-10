package j0610;

public class Card {
	/* static - 공통적인 이라는 의미. 
	   멤버변수, 메서드, 초기화 블럭에서 사용됨 
	   변수 : 모든객체에 공통으로 사용되는 클래스변수가됨. 
	         클래스변수는 객체를 생성하지 않고 사용가능
	         클래스가 메모리에 로드될 때 생성됨. 
	   메서드 : 객체를 생성하지 않고 호출가능한 메서드. 
	         인스턴스객체를 사용할 수 없음.  	*/
	static int width;  // 클래스변수 선언
	static int height; // 클래스변수 선언
	static {  // 초기화 블럭에서 클래스변수 초기화 
		width = 100;	height = 250;   }
	static void cardinfo() { // 클래스메서드 
		System.out.println("높이 : "+height+" 너비 : "+width);}
	
	/*  final - 변경할 수 없다는 의미로 사용됨
	    클래스, 메서드, 변수(iv, cv, lv) 
	    클래스 - 변경될 수 없는 클래스. 확장할 수 없는 클래스가 됨
	           즉 다른 클래스의 조상이 될 수 없음. 
	    메서드 - 변경될 수 없는 메서드. 오버라이딩을 통해 재정의할 수 없음. 
	    변수 - 값을 변경할 수 없는 상수가 됨 
	 final이 붙은 변수는 상수이므로 선언과 동시에 초기화되지만 
	 인스턴스변수일 경우 생성자에서 초기화가 가능함. 
	*/
	final int NUMBER;
	final String KIND;
	Card(String kind, int num){
		NUMBER = num; 
		KIND = kind;
	}
	void print() {
		final double max_page = 100;   // lv같은 경우는 상수가되어 변경불가
	// 	max_page = 101;
	}
	
	/* Abstract - 추상적인 이라는 의미 
	   선언부만 있고 구현부가 없는 메서드를 추상메서드라고 하며 
	   반드시 abstract를 붙여야함. 
	   하나이상의 추상메서드를 포함하는 클래스도 반드시 abstract 제어자를 붙임
	   클래스, 메서드에서 사용됨. 
	   클래스 - 클래스 내 추상메서드가 선언되었음을 의미 
	   메서드 - 선언부만 작성하고 구현부는 작성하지 않은 메서드 
	*/
	
} // card

abstract class ABC{
	abstract void printABC(); 
	void printA() {
		System.out.println("출력");
	}
}

