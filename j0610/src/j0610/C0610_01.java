package j0610;
public class C0610_01 {
	public static void main(String[] args) {
		// 객체 생성하기 . 
		// 1. 기본생성자를 사용 
		Korean p1 = new Korean(); 
		// 2. 생성자를 사용해서 필드값 초기화
		Korean p2 = new Korean("홍길동","050101-1111111",20);
		
		// 필드 값 읽기 
		// 1. cv  :  클래스명.변수명  
		System.out.println("국적 : "+Korean.nation);
		// 2. iv :  객체명.변수명
		System.out.println("이름: "+ p1.name);
		System.out.println("이름: "+ p2.name);
		// 필드값 변경 
		p1.name = "유관순";
		System.out.println("이름: "+ p1.name);
		
		// 메서드 사용 : 객체명.메서드명 
		p1.printInfo();
		p2.printInfo();
		
		p1.changAge(30);
		p1.changeName("강백호");
		p1.printInfo();

	}

}
