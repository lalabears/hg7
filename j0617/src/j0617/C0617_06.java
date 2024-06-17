package j0617;
public class C0617_06 {
	public static void main(String[] args) {
		// 추상클래스는 객체를 생성 할 수 없다
		// Language lan = new Language(); 
		// 자식클래스는 완성된 클래스이기때문에 객체를 생성할 수 있다.
		Korean kor = new Korean();
		//부모클래스로부터 상속받은 추상메소드를 구현한 메서드 실행 
		kor.greetings(); 
		
		// 자손으로 객체 생성이 가능함
		Language en = new English();
		en.greetings(); // Hello
		
		// 객체 배열은 생성가능함
		Language[] lang = new Language[3];
		// 다형성으로 인해 부모객체배열에 자식들을 담을 수 있다 
		lang[0] = new Korean();
		lang[1] = new English();
		lang[2] = new French();
		lang[0].greetings();
		lang[1].greetings();
		lang[2].greetings();
		
		// ------------------------------------------- //
		/*
		 제어자 : 클래스, 변수, 메서드의 선언부에 함께 사용되어 부가적 의미를 부여함
		        접근제어자 (public, default, protected, private) + 그외 제어자 
		 접근제어자는 4개중 1개만 사용할 수 있음.
		
		1. abstract : 추상적인 이라는의미. 
		   선언부만있고 구현부가 없는메서드를 추상메서드라고함. 
		   하나이상의 추상메서드가있는 클래스는 반드시 abstract를 붙여주어야함. 
		   클래스, 메서드에 사용됨. 
		2. static : 클래스의, 공통적인을 의미함. 
		   변수 - 모든객체에 공통으로 사용되는 클래스 변수
		         클래스변수는 객체 생성여부와 관계없이 사용가능 
		         클래스가 메모리에 로드될 때 생성됨. 
		   메서드 - 객체를 생성하지 않고 호출가능한 메서드. 
		           메서드 내에서 iv 를 사용할 수 없음 
		   멤버변수(iv,cv), 메서드, 초기화 블럭에서 사용됨
		3. final : 마지막의, 변경될수 없는 - 거의모든대상에 사용이가능함 
		   클래스 - 확장 또는 변경이 불가능한 클래스로 상속이 불가능하다. 
		   변수 -  값을 변경시킬 수 없는 변수(상수)를 의미함. 
		   메서드 - 오버라이딩이 불가능한 메서드를 의미함
		   
		
		- 클래스에 final과 abstract는 함께 사용할 수 없다. 
		- 메서드에 static과 abstract는 함께 사용할 수 없다. 
		- 메서드에 private와 abstract는 함께 사용할 수 없다. 
		- 메서드에 private와 final은 함께 사용할 필요가 없다.  
		
		*/
		
		
		
		
		
		
		
		

	}

}
