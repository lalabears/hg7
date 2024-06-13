package j0613;
public class C0613_05 {
	public static void main(String[] args) {
		/* 
		 상속 : 기존의 클래스로 새로운 클래스를 작성하는 것 
		       두 클래스의 부모-자식 관계를 맺어주는것. 
		 class 자식클래스명 extends 부모클래스명 { }   
		 의 기본구조를 하고 있음. 
		 ***** 자손은 조상의 멤버(변수,메서드)를 상속받는다 - 생성자제외
		 ***** 자손의 멤버개수는 조상보다 적을 수 없다 (같거나 많음) *******
		    자손 >>>= 부모     ===>     double >> int
		 다형성이란 - 하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미한다. 
		 부모클래스타입 참조변수로 자식클래스를 참조할 수 있음.    
		 
		*/
		
		// 1. 객체타입과 참조변수 타입이 일치하는 경우 
		// + 상속으로 인해 부모의 멤버를 자식이 가질 수 있다. 
		Animal ao = new Animal(); // 멤버2개
		// 부모인 animal은 두개의 멤버를가지고 있다. cry, eat method
		ao.cry();   // 동물의 cry()메서드임
		ao.eat();
		Dog d1 = new Dog();  // 멤버 3개 부모1+자기꺼1+오버라이딩1
		d1.cry();  // 메서드 오버라이딩을 사용해서 개의 cry() 메서드임
		d1.eat();  // 부모, 즉 동물의 eat()메서드를 자손이 사용할수 있음 
		d1.play(); // 개만 가지고 있는 메서드 
		Cat c1 = new Cat(); 
		c1.cry();  // 오버라이딩 메서드로 고양이메서드 
		c1.eat();  // 부모가 가지고 있는 메서드
		c1.jump(); // 고양이만 가지고 있는 메서드
		
//		double a = (int)1; 
//		int a1 = (int)(1.1); 		
		// 2. 객체 타입과 참조변수 타입이 불일치 (다형성) - 상속이 되어있다면 
		Animal ad = new Dog(); 
		ad.cry(); // 멍멍        // 자식멤버 호출 - 오버라이딩된경우 
		ad.eat(); //음식을 먹어요 
		// ad.play();  // 불가능 - 자식만 단독으로 가지고 있는 경우 
		Animal ac = new Cat();
		ac.cry();  // 야옹~
		ac.eat(); 
		// ac.jump();  // 불가능 - 자식만 단독으로 가지고 있는 경우 
		Animal ab = new Bird();
		ab.cry();  // 짹짹
		ab.eat();
		//ab.fly(); 
		
		// 3. 하위클래스 타입으로 상위 클래스 참조는 불가능합니다. 
		//  Dog da = new Animal(); // 불가능  
		
		/* 즉, 참조변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스멤버
		   개수보다 같거나 작아야 참조할 수 있음
		   자식클래스에서 사용할 수 있는 멤버개수는 언제나 부모클래스보다
		   같거나 많기때문에 부모클래스가 자식클래스를 참조할 수 있음 
		  
		*/
		
		// smartphone - cellphone 
		// 객체타입과 참조변수 타입이 일치
		CellPhone cp = new CellPhone(); 
		SmartPhone np = new SmartPhone(); 
		// 부모 : cellphone 자식 : smartphone
		CellPhone cs = new SmartPhone(); 
		
		// np : smart phone  -> 부모로부터 상속을 받음 
		np.capacity = 100;   // smartphone 변수
		np.color = "black";  // cellphone 변수
		np.model = "sky";    // cellphone 변수 
		
		// cs : 다형성을 사용해서 cellphone의 멤버만 가져올 수 있는
		//   리모콘을가진 자식객체로 탄생함 
		cs.color = "white";
		cs.model = "iphone11";
		
		// Employee - Manager 
		Manager m = new Manager(); // employee를 상속받은 자식클래스
		
		Employee e = new Manager();  // 다형성 
		Employee eo = new Employee();
		
		// Manager me = new Employees(); // 불가능하다
		
		/* 참조변수의 타입 변환 - 자바는 참조변수도 조건에 따라 타입변환할 수 있음. 
		1. 서로 상속관계에 있는 클래스사이에서만 타입변환이 가능
		2. 자식클래스타입에서 부모클래스 타입으로 형변환은 생략이 가능함 
		3. 부모클래스타입에서 자식클래스타입으로 형변환은 반드시 명시해야함 
		
		(변환할 타입의 클래스이름) 변환할참조변수   
		*/

		Animal aniNull = null ; // Animal 객체 선언 
		Dog dog1 = new Dog();   // Dog 객체 선언 및 생성 
		aniNull = dog1;  // (Animal)dog1을 생략할 수 있다. 
		aniNull.cry();   // 멍멍
		aniNull.eat();   // 음식을 먹어요
		
		Animal aniNull2 = null; // Animal 객체선언 
		Dog dog2 = null ; // Dog 객체 선언 
		//aniNull2 = dog2;
		// aniNull2.cry();  // 객체를 생성하지 않았기때문에 사용할 수 없다. 

		Animal ani3 = new Animal();
		Dog dog3 = null; 
	//	dog3 = (Dog)ani3; 
	//	dog3.cry();
		//  Dog dtemp = new Animal();  >> 불가능  
		
		Animal ani4 = new Dog();
		ani4.cry();
		ani4.eat();
		Dog dog4 = null; 
		dog4 = (Dog)ani4;
		dog4.cry();
		dog4.eat();
		dog4.play(); 
		/*  instanceof 연산자   : 참조변수 instanceof 클래스이름
		 - 참조변수가 참조하는 인스턴스 실제타입을 체크하는데 사용
		 - 연산결과는 true / false
		 - instanceof의 연산결과가 true면 해당 타입으로 형변환이 가능함. 
	    */
		Animal a5 = new Animal();
		Animal a6 = new Dog();
		Dog a7 = new Dog();
		System.out.println(a5 instanceof Dog); // false
		System.out.println(a6 instanceof Dog); // true
		System.out.println(a7 instanceof Animal); // true 
		System.out.println(a6 instanceof Animal); // true 
		
		
		// cellphone - smartphone 
		CellPhone cell01  = new CellPhone();
		CellPhone cell02  = new SmartPhone(); 
		SmartPhone smart01 = new SmartPhone();
		
		System.out.println(cell01 instanceof SmartPhone); // false 
		System.out.println(cell02 instanceof SmartPhone); // true 
		cell02.bell() ; // cellphone의 기능만 사용할 수 있었음. 
		((SmartPhone)cell02).downloadApp(100); // 사용이 가능하다. 
		// 100GB 어플을 다운받습니다..
        // 현재 폰 잔여 용량은 : -100 

		
		
	}

}
