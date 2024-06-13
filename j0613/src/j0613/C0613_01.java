package j0613;
public class C0613_01 {
	public static void main(String[] args) {
		// 핸드폰객체 생성 
		CellPhone cp = new CellPhone("현대걸리버","실버");
		// 클래스명  참조변수명 = new 생성자();
		
		// 핸드폰 메서드 사용  
		// 참조변수명.메서드명() 으로 객체의 메서드를 호출
		cp.printAttr();
		cp.powerOn();
		cp.sendMessage("오늘 너무 덥다");  // 매개변수가 있는 메서드
		cp.receiveMessage("30도까지 올라간데 ");
		cp.bell();
		cp.powerOff();
		
		// 스마트폰의 객체 생성 
		SmartPhone sp = new SmartPhone("아이폰15pro","black",512);
		// 상속받은 필드 
		System.out.println(sp.model);
		System.out.println(sp.color);
		// 스마트폰의 필드 
		System.out.println(sp.capacity);
		// 상속받은 메서드 
		sp.powerOn();
		sp.bell();
		sp.sendMessage("카톡!");
		sp.receiveMessage("kakakakaktalk!");
		// 스마트폰의 메서드
		sp.downloadApp(5);
		sp.deleteApp(2);
		
		// 오버라이딩 메서드 호출
		sp.printAttr();
		
		// 매개변수가 없는 스마트폰 
		SmartPhone sp2 = new SmartPhone();
		sp2.printAttr();
		// 폰 모델: sky, 색: black, 용량 :0
		
		/* 메서드 오버라이딩 :
		상속된 메서드의 내용이 자식클래스와 맞지 않는경우 
		자식클래스에서 동일한 메서드를 재 정의하는것을 말함
		객체에서 메서드 호출시 자식메서드가 호출된다. 
		규칙: 부모와 선언부가 같아야함
		     접근제한을 부모보다 강하게 할 수 없음 
        */
		Animal a = new Animal();
		a.cry(); // 아무것도 출력되지 않음 
		Dog d = new Dog();
		d.cry(); // 멍멍
		Cat c = new Cat();
		c.cry(); // 야옹
		Bird b = new Bird();
		b.cry(); 
	}

}
