package j0618;
// 인터페이스는 인터페이스로부터만 상속이가능 - Object의 자손이 아니다.
public interface A {
	public abstract void methodA();
}
interface B {
	public void methodB();
}
// 다중상속이 가능하다. 
interface C extends A, B{
	abstract void methodC();
}
