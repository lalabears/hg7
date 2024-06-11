package lottopkg;

public class C0611_01 {

	public static void main(String[] args) {
		Member m1 = new Member(); // (default) 생성자 
		m1.name = "유관순";  // public
		m1.email = "yu@aa.com"; // default
		m1.position = "인턴";  // protected 
		// m1.age = 25;  -> private는 같은 패키지라도 다른클래스면 접근불가
		
		
		// public 생성자를 통한 객체 생성 
		Member m2 = new Member("홍길동",41,"hong@aa.com","부장");
		m2.printName(); // public
		m2.printEmail(); // default
		m2.printPosition(); // protected 
		// m2.printAge(); private여서 사용이 불가능 
		System.out.println("printall 함수호출 ");
		m2.printAll();
		
		
		
		
	}

}
