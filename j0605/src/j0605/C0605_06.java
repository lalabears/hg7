package j0605;

public class C0605_06 {

	public static void main(String[] args) {
		System.out.println("메인시작");
		firstMethod();
		System.out.println("메인끝");
	}
	static void firstMethod() {
		System.out.println("첫번째 메서드시작");
		secondMethod();
		System.out.println("첫번째 메서드끝");
	}
	static void secondMethod() {
		System.out.println("두번째 메서드시작");
		System.out.println("두번째 메서드끝");
	}

}
