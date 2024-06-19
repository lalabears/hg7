package j0619;
public class C0619_07 {
	public static void main(String[] args) {
		// try-catch : 예외처리 
		
	    //	method1(); // 컴파일에러는 예외처리를 해주지 않았기때문
		try {
			method1();  // 예외발생 
			method2();
			method3();
		} catch (ClassNotFoundException|ArithmeticException|NullPointerException e) {
			System.out.println(e.getMessage());
		} 
		System.out.println("프로그램종료 ");
		
	} // main
	// throws 예외클래스 : 해당예외클래스에대한 예외처리는
	// 메서드를 호출한쪽에서 처리를 할것이라는 것을 지정함
	public static void method1() throws ClassNotFoundException{
		System.out.println("에러가 없음 ");
		//throw new ClassNotFoundException("에러1");
	}
	public static void method2() throws ArithmeticException{
		System.out.println(10/0);
		// throw new ArithmeticException("에러2");
	}
	public static void method3() throws NullPointerException{
		throw new NullPointerException("에러3");
	}

}// class 
