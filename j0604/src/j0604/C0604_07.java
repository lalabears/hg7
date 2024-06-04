package j0604;
public class C0604_07 {
	public static void main(String[] args) {
		// 객체 생성 
		Number num  = new Number();
		num.n1 = 10;
		System.out.println("1. num.n1 : "+num.n1);
		change(num.n1);  
		System.out.println("2. num.n1 : "+num.n1);
		change(num);
		System.out.println("3. num.n1 : "+num.n1);

	} //main
	// 클래스 메서드 - 객체선언없이 사용가능. 클래스명.메서드명() 으로 호출
	static void change(int n1) {
		n1 = 1000; 
		System.out.println("A. 메서드 내 n1 : " + n1 );
	}// change
	static void change(Number n2) {
		n2.n1 = 1000; 
		System.out.println("B. 메서드 내 n1 : " + n2.n1 );
	}
	
	

}// class
