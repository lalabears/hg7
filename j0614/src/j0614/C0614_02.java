package j0614;
public class C0614_02 {
	public static void main(String[] args) {
	/* 다형성 - 하나의 객체가 여러 자료형 타입을 가질 수 있는 것. 
	   부모클래스의 참조변수로 클래스 자식타입의 인스턴스를 참조할 수 있다. 
	   오버라이딩은 상속을 통해 같은 이름의 메서드로 서로 다른내용을 구현한다는 점이
	   다형성을 실현했다고 볼 수 있다. 
	   참조변수의 다형성 : 
	   자바는 부모클래스의 참조변수로 자식클래스 타입의 인스턴스를 참조할 수 있음. 
	   참조변수가 사용할 수 있는 멤버개수가 실제 인스턴스 멤버보다 같거나 적어야 가능'
	   자식클래스의 참조변수로 부모클래스를 참조할 수 없다.> 자식멤버가 무조건 부모보다 많기때문
	*/	
		// 1. 객체 타입과 참조변수의 타입이 일치 
		Coffee coffee = new Coffee(); //  부모 
		//  객체 선언   =    객체 생성
		//  coffee 주소  > Coffee()라는 객체를 생성해서 
		//                그 주소값을 coffee 라는변수에 넣음 
		coffee.hot = false;   // 커피클래스의 iv
		coffee.price = 1000;  // 커피클래스의 iv
		coffee.printInfo();   // 커피클래스의 메서드
		coffee.setHot();      // 커피클래스의 메서드 
		// 상속으로 인해 부모의 멤버를 가질 수 있는 자식 클래스들 
		Americano americano = new Americano();
		americano.hot = false;  // 커피클래스(부모)의 iv
		americano.price = 4500; // 커피클래스(부모)의 iv
		americano.shot = 3;     // 아메리카노클래스의 iv
		americano.setIce();     // 커피클래스(부모)의 메서드
		americano.addshot();    // 아메리카노클래스의 메서드
		americano.printInfo();  // 메서드오버라이딩 
		CaffeLatte latte = new CaffeLatte();
		latte.setHot();   // 부모의 메서드
		latte.changeMilk("두유");  // 본인의 메서드
		latte.printInfo();  // 메서드오버라이딩(본인메서드)
		
		// 2. 객체 타입과 참조타입이 불일치  - 상속관계만사용
		// 부모클래스 참조변수로 자식클래스타입객체를 참조할 수 있음.
		// 업캐스팅 - 자식클래스객체주소를 부모클래스타입으로 변환
		Coffee coffAm                     = new Americano(); 
		// 부모클래스이 참조변수(coffAm:주소)   =   자식의 객체 
		coffAm.hot = true;   // 부모객체의 변수
		coffAm.price = 3000; // 부모객체의 변수 
		coffAm.setHot();     // 부모객체의 메서드
		coffAm.setIce();     // 부모객체의 메서드
		coffAm.printInfo();  // 부모객체의 메서드있음
		                     // (하지만 오버라이딩으로 자식도있음)
		// 자식클래스로 접근이 불가능 coffAm.shot = 3;
		// 자식 단독 addshot()메서드는 사용할 수 없음. 
		Coffee coffLa = new CaffeLatte();
		coffLa.price = 5000; 
		coffLa.printInfo();   // 부모의 메서드, 변수만 호출, 접근이 가능하다. 
		// 오버라이딩으로 메서드가 자식에게도 존재하는경우는 자식의 메서드를 호출한다. 
		Americano a = new Americano();
		CaffeLatte c = new CaffeLatte(); 
		Coffee coffeA = a;        // (Coffee)a에서 (Coffee)생략이 가능함
		Coffee coffeL = (Coffee)c; 
		// 자식클래스타입에서 부모클래스타입으로 형변환하는경우는 (부모클래스) 생략이 가능하다. 
		// 리모콘이 부모이기때문에 부모의 메서드 부모의 변수만 접근할 수 있음. 
		coffeA.price = 100; 
		coffeA.printInfo();  // amricano에 있는 메서드 실행 (오버라이딩)
		coffeL.price = 200;
		coffeL.printInfo();  // caffelatte에 있는 메서드 실행(오버라이딩)
		
		//3. 하위클래스 타입으로 상위 클래스 참조는 불가능함. 
		// 다운캐스팅 - 업캐스팅의 반대, 타입변환을 지정해줘야함. 	
	//	Americano ameri = new Coffee(); // 불가능
	//	CaffeLatte caffla = new Coffee(); // 불가능 
		Coffee cf = new Coffee(); 
	//	Americano ac = (Americano)cf; // 다운캐스팅안되? 
	//	ac.addshot();
		Coffee cfa = new Americano();
		// 형변환을 지정해줘야지만 사용할 수 있다.
		// 부모클래스 타입에서 자식클래스 타입으로 형변환은 써줘야함!
		Americano ac = (Americano)cfa;
		ac.shot =5;
		ac.addshot();
		ac.printInfo();
		
		/* instanceof 연산자 ( 참조변수 instanceof 클래스 )
		 * 결과가 참이면 해당타입으로 형변환이 가능함.  */
		//                참조변수명  instanceof 클래스명 
		System.out.println( cf instanceof Americano ); // false
		// Americano aa = (Americano)cf; // 오류가 난다 
		System.out.println( cfa instanceof Americano ); // true
		Americano aa = (Americano)cfa;
		
		System.out.println("=====================");
		// 커피 구매하기. 
		Customer me = new Customer(); 
		Americano a01 = new Americano();
		// 기본생성자로 생성된 아메리카노: 4000원
		CaffeLatte c01 = new CaffeLatte();
		// 기본생성자로 생성된 카페라떼 : 5000원 
		
		me.buyCoffee(a01); 
		System.out.println("현재 잔액: "+me.money);
		// 현재 잔액: 46000
		me.buyCoffee(c01);
		System.out.println("현재 잔액: "+me.money);
		
	
		
	
		
		
	}

}
