package j0612;
public class Person {
	// 멤버변수는 자동 초기화됨 .
	// bool-false, String-null, 숫자들은 0으로 
	// static 자료형 변수명; 
	// 클래스멤버변수. cv
	static String keyword = "사람";
	// 자료형 변수명; 
	// 인스턴스멤버변수 iv
	boolean isHungry = true;  
	String name; 
	// static메서드, 클래스메서드
	public static void describe() {
		System.out.println(keyword+"입니다");
		//클래스메서드는 클래스변수만 사용할 수 있다.
		// iv는 사용할 수 없음 
		// System.out.println(isHungry); // 오류
	}
	// 인스턴스메서드 
	public void eat() {
		isHungry = false; 
	}
//  제한자  자료형   함수명 	
	public String isFull() {
		String lv ; //로컬변수 - 메서드안에 속하는 변수.lv는 메서드안에서 사용
		if(isHungry == true ) lv = "배고픔";
		else lv = "배부름";
		return lv; // 리턴타입과 메서드의 자료형은 일치해야함 
	}
// 제한자 default는 생략. 
	// 자료형 void는 리턴이 없을때 사용  return;은 사용해도되고 생략해도됨 
	void newName(String var) { // 매개변수도 지역변수로 메서드에서 사용됨
		System.out.println("매개변수로 전달 받은 이름 : "+var);
		name = var; 
		System.out.println("새롭게 객체변수에 반영된 이름 : "+ name);
	}
	
	public void work() {
		System.out.println("일하기");
	}
	public void sleep() {
		System.out.println("잠자기");
	}
	
	
	

}
