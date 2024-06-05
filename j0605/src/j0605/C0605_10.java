package j0605;
import java.util.Scanner;
public class C0605_10 {
	public static void main(String[] args) {
	// Person1 클래스 사용 , Memeber클래스사용
		int n = 1; 
		Scanner scan = new Scanner(System.in);
		Person1 p = new Person1("홍길동",22); 
		// 연산자 new에 의해서 Person클래스의 인스턴스(객체)가 생성됨
		// Person() 이 호출이되서 수행이되는것임. 
		// 연산자 new 의 결과로 생성된 Person인스턴스의 주소가 반환되어 
		// 참조변수 p에 저장됨. 
		p.printAtt();
		Person1 p1 = new Person1();
		p1.name = "유관순";		p1.age = 20;		p1.printAtt();
		Person1 p2 = new Person1("강백호");		    p2.printAtt();
		Person1 p3 = new Person1("서태웅",18,190,75);	p3.printAtt();
		// Member 클래스를 만들어보세요 
		
		Member m1 = new Member();  // 객체 선언하고 생성
		// 객체를 초기화
		m1.id = "ccc";
		m1.name = "강백호";
		m1.pw = "5555";
		m1.email = "kang@aa.com";
		// 객체를 선언하고 생성함과 동시에 초기화
		Member m2 = new Member("aaa","1111");
		Member m3 = new Member("bbb","홍길동","1234","hong@aa.com");
		// + 출력하는 메서드 한개 만들기 
		//[아이디 : bbb  이름 : 홍길동  비밀번호 :1234  이메일 :hong@aa.com]
		m1.printAtt();		m2.printAtt();		m3.printAtt();
		
		
		
		
		

	}

}
