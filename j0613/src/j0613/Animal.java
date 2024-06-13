package j0613;
public class Animal {
	// 메서드 오버라이딩 cry는 자손마다 다른 출력을 가진다.  
	void cry() {}
	void eat() {
		System.out.println("음식을 먹어요");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
	void play() {
		System.out.println("공을가지고 놀아요");
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("야옹~");
	}
	void jump() {
		System.out.println("높은곳으로 점프해요");
	}
}
class Bird extends Animal{
	void cry() {
		System.out.println("짹짹");
	}
	void fly() {
		System.out.println("하늘을 날아요");
	}
}
