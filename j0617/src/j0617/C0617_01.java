package j0617;
public class C0617_01 {
	public static void main(String[] args) {
		/*	상속: 기존 클래스에 기능을 추가하거나 재정의해 새로운 클래스를 정의하는것.
		 	기존 정의된 클래스의 모든 필드, 메서드를 물려받아 새로운 클래스를 생성.
		 	기존 작성된클래스를 재활용할 수 있음. 
		 	자식클래스 설계시 중복되는 멤버를 미리 부모클래스에 작성하면 자식은 생략가능
		 	클래스 간 계층적 관계를 구성 > 다형성의 문법적 토대마련 
		 	
		 	class 자식클래스 extends 부모클래스 {  }
		 	자바는 단일 상속만 허용함. 부모가 둘이 될수 없음.
		 	다중상속 원할시엔 하나는 상속, 하나는 포함으로 사용할 수 있음
		 	
		 	오버라이딩: 상속받은 조상의 메서드를 자신에 맞게 변경하는것.
		 	- 선언부가 조상클래스메서드와 일치해야함.
		 	- 접근제어자가 조상보다 좁을 수 없음 	*/	
		
		// 부모클래스 
		// 객체 선언 및 생성 
		Animal animal = new Animal();
		animal.eat();   // 참조변수명.메서드명() 으로 호출함. 
		animal.move();  // animal클래스 메서드
		// 자식클래스 
		Human human = new Human();
		human.eat();     // 상속받았기때문에 animal클래스 메서드도 멤버로 사용
		human.move();    // 오버라이딩 메서드. 본인의 메서드 호출 
		human.readBook();// 사람클래스의 메서드
		Tiger tiger = new Tiger(); 
		tiger.move();    // 오버라이딩 메서드. 본인의 메서드 호출
		Eagle eagle = new Eagle(); 
		eagle.move();    // 오버라이딩 메서드. 본인의 메서드 호출
		/* 다형성 - 하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미함. 
		   부모클래스타입의 참조변수로 자식클래스타입의 객체를 참조할 수 있음
		   
		   오버라이딩으로 메서드가 자식에게도 존재하는 경우는 자식메서드를 호출함.
		*/
		System.out.println("==============================");
		Animal h01 = new Human();
		h01.eat();
		h01.move();  // human에 있는 move메서드가 호출됨. 
		// h01.readBook(); // 자식메서드는 호출 할 수 없다. 
		// h01의 클래스타입이 부모이기때문에 부모메서드에 존재하는 변수, 메서드만호출
		Animal ti = (Animal)tiger;
		ti.eat(); ti.move();
		// 자식클래스에서 부모타입으로 형 변환하는 경우는 (부모클래스)를 생략할 수 있음
		Animal eag = eagle; 
		eag.eat(); eag.move();
		
		// 하위클래스 타입으로 상위클래스 참조는 불가능하다. 
		// Human h = new Animal();
		Animal a = new Human(); 
		// 부모클래스타입에서 자식클래스타입으로 형변환하는 경우는 타입변환을 지정해야함 
		Human h = (Human)a; 
		h.eat(); h.move(); h.readBook();
		
		a.eat(); a.move(); // 부모클래스 메서드들만 사용가능 
		// 형 변환하게 된다면 자식 클래스 모두 사용이 가능함. 
		((Human)a).eat(); 
		((Human)a).move(); 
		((Human)a).readBook();
		System.out.println("==============================");
		// 인스턴스메서드는 객체를 생성하지 않고 사용할 수 없다. 
		C0617_01 c = new C0617_01();
		c.moveAnimal(animal);
		c.moveAnimal(human);
		c.moveAnimal(tiger);
		c.moveAnimal(eagle);
//		
//		Animal an = eagle; 
		// 객체선언 
	   
		System.out.println("==============================");
		// animal 타입만 담을 수 있는 배열 
		Animal[] animalList = new Animal[4];
		// 각각의 배열안에 객체생성 
		animalList[0] = new Animal();
		animalList[1] = new Human();
		animalList[2] = new Tiger();
		animalList[3] = new Eagle();
		for(int i = 0 ; i < animalList.length; i++) {
			animalList[i].move(); 
		}
		System.out.println("==============================");
		for(int i = 0 ; i < animalList.length; i++) {
			c.moveAnimal(animalList[i]); 
		}
		
	}
	public void moveAnimal(Animal animal) {
		animal.move();
		// instanceof : 형변환이 가능한지 확인해주는 연산자 
		if(animal instanceof Human) {
			Human h = (Human)animal;
			h.readBook();
		} else if (animal instanceof Tiger) {
			Tiger t = (Tiger)animal;
			t.hunting();
		} else if (animal instanceof Eagle) {
			Eagle e = (Eagle)animal;
			e.flying();
		} else {
			System.out.println("해당사항 없음");
		}
	}

}
