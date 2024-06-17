package j0617;

public interface Inter {
	// 인터페이스는 상수만 변수로 가질 수 있다. 
	// 아래 모두 public static final 로 정의된 것이다. 
	public static final int A = 1;   // 정석
	final int B = 2;                 // public static 생략
	static int C = 3;                // public final 생략
	int D = 4;                       // public static final 생략

	// 인터페이스안에 존재하면 의미가 분명하기때문에 제어자를 생략할 수 있다
	
	// 추상 메서드만 있을 수 있다. 
	public abstract int getInt(); 
	void printInfo(); // public abstract 생략이 가능함. 

}
