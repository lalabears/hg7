package j0619;
public class C0619_06 {
	public static void main(String[] args) {
		method1();
		method2();
		method3();
	} // main
	public static void method1() {
		try { // throw는 새로운 예외를 발생시킨다 
			throw new ClassNotFoundException("에러1");
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	public static void method2() {
		try {
			throw new ArithmeticException("에러2");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
	public static void method3() {
		try {
			throw new NullPointerException("에러3");
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

}// class 
