package j0614;
public class Card {
	// 클래스변수 cv - 모든객체들이 공통적으로가지는 값은 static을 붙여 클래스변수로한다
	static String[] kinds = {"Spade","Heart","Diamond","Clover"};
	static String[] numbers= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	static int width = 100;
	static int height = 250;
	// 인스턴스변수 iv - 객체마다 값이 다름
	String kind;
	String number;
	int a; 
	// 생성자 this<변수 this()<함수
	Card(){this("Heart","A");} // 기본생성자 > 매개변수생성자 호출해서 초기화
	Card(String kind, String number){
		this.kind = kind;
		this.number = number;
	}
}
