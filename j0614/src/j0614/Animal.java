package j0614;
public abstract class Animal {
	// 하나이상의 추상메서드를 포함하는 클래스는 추상클래스라고 함. 
	// 반드시 사용되어야하는 메소드를 추상클래스에 추상메서드로 선언하면
	// 이 클래스를 상속받는 모든 클래스에서 반.드.시. 재정의해야함. 
	// 추상클래스는 완성된 설계도가 아니기때문에 객체를 생성할 수 없다. 
	// 다른 클래스를 작성하는데 도움을 줄 목적으로 사용함. 
	/*
	  	 abstract class 추상클래스명 {
	  	     abstract 반환타입 메소드명();  
	  	 }
	*/
	
	// 클래스: 설계도 
	// 추상클래스 : 미완성 설계도 
	abstract void cry();
	// abstract 미완성의 메서드 : 선언부만 있고 구현부가 없는 메서드를 미완성메서드라함
	void eat() {
		System.out.println("음식을 먹어요");
	}
}
abstract class Bird extends Animal{
//	void cry() {	}
	void fly() {
		System.out.println("날아요~");
	}
}

class Puppy extends Animal{
	void cry() { // 메서드의 오버라이딩
		System.out.println("멍멍");
	}
	void play() {
		System.out.println("장난감을 가지고 놀아요");
	}
}
class Kitty extends Animal{
	void cry() { // 메서드의 오버라이딩
		System.out.println("야옹");
	}
	void jump() {
		System.out.println("점프~");
	}
	
}
