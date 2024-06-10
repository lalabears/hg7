package j0610;
public class Korean {
	// 필드(변수) - 객체의 데이터가 저장되는 곳
	static String nation = "대한민국"; // 클래스변수 cv
	String name ;  // 인스턴스변수 iv
	String ssn;
	int age;
	// 생성자 - 객체 생성시 초기화 역할을 담당함. 
	// 클래스와 같은 이름을가짐. 리턴없음(메서드가 아니므로void는 사용하지않음).
	// 생성자가 존재하지 않을때 기본 생성자는 자동생성. 
	// 기본생성자 : 매개변수가 없는 생성자. 
	// 한개 이상의 생성자를 만들었다면 기본생성자를 만들어주지 않으면 사용 불가함. 
	Korean(){} 
	// 생성자의 오버로딩 
	Korean(String name, String ssn, int age ){
		this.name = name; this.ssn = ssn; this.age = age; 
	}
	// 매서드 - 객체의 동작에 해당하는 실행블럭 
	void changeName(String name) {   // 메서드의 선언부 리턴타입 메서드명(매개변수)
		this.name = name;            // 메서드의 구현부. 코드와 return으로구성
	}
	void changAge(int age) {
		this.age = age;
	}
	void printInfo() {
		System.out.println("이름: "+name+", 주민번호: "+ssn+", 나이: "+age);
		
	}
	
	
	
	

}
