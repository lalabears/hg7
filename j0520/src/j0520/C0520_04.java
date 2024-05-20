package j0520;

public class C0520_04 {

	// 전역 변수 
	static int num = 11; // class 내 전역변수 선언 
		
	public static void main(String[] args) {
		int num = 100;  // main 내 지역변수 
		System.out.println("main method 지역변수 num 호출 : "+num);
		sub(); // 함수호출
	}
	
	static void sub() {
		System.out.println("sub method num 호출 " + num);
	}

}
