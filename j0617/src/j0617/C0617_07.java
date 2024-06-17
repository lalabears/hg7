package j0617;
public class C0617_07 {
	public static void main(String[] args) {
	/*  인터페이스 - 일종의 추상클래스. 
	              실제 구현된것이 전혀 없는 기본설계도 (알맹이없는 껍데기)
	              추상메서드와 상수만 멤버로 가질 수 있음.
	              객체생성불가, 클래스작성에 도움을 줄 목적으로 사용
	  class 대신에 interface를 사용함. 
	  interface 인터페이스명{
	  	public static final 자료형 상수이름 = 값; 
	  	public abstract 메서드명(매개변수); 
	  }
	  
	  - 모든멤버변수는 public static final 이어야함. (생략가능)
	  - 모든메서드는 public abstract 여야함 (생략가능) 
	  
	  인터페이스의 구현 - 인터페이스에 정의된 추상메서드를 완성하는것 
	  - 상속 : extends 
	  - 인터페이스 : implements 
	  자식클래스는 인터페이스를 구현했다. 
	        추상클래스를 상속받아 완성하는것과같은의미 
	  
	*/
		// 객체를 선언하고 생성할 수 있다. 
		Dog d = new Dog();
		d.move();
		Cat c = new Cat();
		c.move(); 
		
		d.hunting();
		c.hunting();
		
		// abstract 객체는 생성할 수 없다
		// Bird b = new Bird();
		
		// 부모 멤버변수 
		d.name = "뿌꾸";
		d.age = 5; 
		System.out.println(d);
		
		// 객체 선언 및 생성
		Kor k = new Kor();
		Eng e = new Eng();
		Fren f = new Fren();
		
		k.country();
		k.greetings();
		e.country();
		e.greetings();
		f.country();
		f.greetings();
		
		// user 클래스에서 매개변수의 다형성을 활용
		// 인터페이스를 매개변수로 받음 
		User u = new User();
		u.allLan(k);
		u.allLan(e);
		u.allLan(f);
		u.allLan(new Jap());
		
		
		
		

	}

}
