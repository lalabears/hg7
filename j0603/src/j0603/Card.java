package j0603;

public class Card {
	/* class 의 변수 
	1. 인스턴스 변수  (iv)
	  => 객체 생성 후 사용가능
	     각 객체별 다른 값 저장가능.
	     객체명.인스턴스변수명 으로 접근 
	2. 클래스변수    (cv)
	  => 객체 생성 없이 사용가능
	     같은 클래스 모든 객체들이 공유하는 변수 
	     클래스명.클래스변수명 으로 접근 
	3. 지역변수      (lv)
	  => 메서드 내 선언되며 메서드 종료와함께 소멸
	*/
	// iv
	String kind;    // 카드의 모양. 클로버, 하트, 다이아, 스페이드
	int number;     // 숫자들 
	// 하트 10 , 다이아 A, 클로버 5
	// cv 
	static int width = 100;  // 카드의 크기 중 너비
	static int height = 250; // 카드의 크기 중 높이 
	void print() {
		int num = 10 ; // lv
	}
	
}
