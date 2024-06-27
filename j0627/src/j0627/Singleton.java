package j0627;
public class Singleton {
	private static int num; 
	// 같은 클래스 내에서만 s를 사용할 수 있다.
	private static Singleton s = new Singleton();
	// private로 지정한 생성자를 만들어둬야한다. 
	private Singleton() {
		num = 10; 
	}
	// getInstance 메서드 
	static Singleton getInstance() {
// default type 리턴형(자기자신) 메서드명 (매개변수)	
		if(s==null) {
			s = new Singleton(); // 객체선언을 다시함 
		}
		return s;
	}
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		Singleton.num = num; 
	}
	public void call() {
		System.out.println("부르셨나요 ??? ");
	}
	
	
	
}
