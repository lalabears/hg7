package j0612;
public class C0612_01 {
	public static void main(String[] args) {
		// 객체 선언   객체 생성 
		Person p1 = new Person(); 
		Person p2 = new Person();
		
		p1.eat(); // p1객체의 메서드eat() 호출 
		System.out.println(p1.isHungry);  // false
		System.out.println(p1.isFull());  // 배부름
		// p1만eat() 했기때문에 p2는 배고픔 
		System.out.println(p2.isHungry);  // true 
		System.out.println(p2.isFull());  // 배고픔
		
		// 클래스 메서드 호출은 클래스명.메서드명()
		Person.describe(); // 사람입니다
		// 클래스변수 호출  클래스명.변수명
		System.out.println(Person.keyword);
		

	}

}
