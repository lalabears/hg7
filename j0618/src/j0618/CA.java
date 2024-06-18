package j0618;
// 인터페이스 A를 구현하는 클래스 CA
public class CA implements A {
	public void methodA() {
		System.out.println("A구현");
	}
}
// 인터페이스 B를 구현하는 클래스 CB
abstract class CB implements B {
	// 인터페이스 B에있는 메서드를 구현하지 않는다면
	// 추상클래스로 만들어주어야함.
	// 추상클래스는 객체를 생성할 수 없다. 
}
//인터페이스 C를 구현하는 클래스 CC
class CC implements C {
	// A, B를 상속받은 C 
	// C인터페이스 메서드만 구현하면안됨. 
	public void methodC() {
		System.out.println("C구현");
	}
	// 완성을 시키려면 A, B인터페이스메서드들도 구현해야함
	public void methodA() {
		System.out.println("A구현");
	}
	public void methodB() {
		System.out.println("B구현");
	}
	
}