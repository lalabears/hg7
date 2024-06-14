package stuPkg;
import j0614.Person;
public class C0614_01 {
	public static void main(String[] args) {
		// person - 다른패키지에 있음. 아무 관련이 없음
		// public 생성자는 호출이 가능함. 
		Person p1 = new Person();
		// default 생성자 호출 불가능
		// Person p2 = new Person("강",21,175);
		// proteced 생성자 호출 불가능 
		// Person p3 = new Person("강",21,175,70);
		p1.name = "강";
		p1.printAll(); // 퍼블릭한 메서드만 사용할 수 있음 
		
		// 같은 패키지내에있는 클래스 
		Female female = new Female();
		female.info();
		female.printAll(); // 부모의 메서드
		
		
	}

}
