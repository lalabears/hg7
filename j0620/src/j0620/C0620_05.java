package j0620;
public class C0620_05 {
	public static void main(String[] args) throws Exception {
		
		// method3();
		
		System.out.println("프로그램시작");
		method1();
		method2();
		// method1, method2 는 자기 예외를 자기가 처리함. 
		// try-catch는 예외를 처리하는 구문이다. 
		
		// method3, method4는 호출한 쪽에서 예외처리를 해주어야함. 
		// 호출한 메서드에서 (main) try-catch문으로 예외처리를 해줌 
		try {
			method3();
			method4(); // method3에 오류가 있기때문에 method4는 실행되지않음
		}catch(Exception e) {
			System.out.println("메서드에 오류가 있습니다. ");
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램종료");
		
		// throw : 예외 발생시키지
		// throws :예외책임떠넘기기 
	}
	public static void method1() {
		try {
			throw new ArithmeticException("에러1");
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void method2() {
		try {
			throw new ArrayIndexOutOfBoundsException("에러2");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	// 오류처리 책임을 호출한쪽으로 책임미루기 
	public static void method3() throws ArithmeticException {
		throw new ArithmeticException("에러3");
	}
	public static void method4() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException("에러4");
	}
	

}
