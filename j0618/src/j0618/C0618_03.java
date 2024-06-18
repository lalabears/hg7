package j0618;
public class C0618_03 {
	public static void main(String[] args) {
	/* 인터페이스 : 추상클래스처럼 추상메스드를 가지지만 추상화 정도가 높아서
	              일반메서드, 멤버변수를 구성원으로 가질 수 없다. 
	  추상클래스 - 부분적으로 완성된 미완성 설계도 
	  인터페이스 - 구현된것이 하나도 없는 밑그림만 있는 기본 설계도
	  interface 인터페이스명 {
	  	public static final 자료형 변수명 = 값;
	  	public abstract 반환형 메서드명(); 
	  }
	*/
		
	/*  인터페이스의 구현 
	    class 클래스명 implements 인터페이스명 {
	    }
	    인터페이스도 추상클래스처럼 그 자체로 객체생성이 불가능함.
	    구현하는 인터페이스메서드 중 일부만 구현한다면 abstract를 붙여서
	    추상클래스로 선언해주어야한다. 
	*/	
		CA ca = new CA();
		ca.methodA();
		CC cc = new CC();
		cc.methodA(); cc.methodB(); cc.methodC();
		/*
		  인터페이스의 장점:
		  1. 개발시간 단축
		  2. 표준화가능
		  3. 서로관련없는 클래스들의 관계를 맺어줄 수 있음.
		  4. 독립적인 프로그래밍이 가능 
		*/
	
		// 스타크래프트 - 모든 유닛의 최고조상은 테란유닛 
		// 유닛의 종류에따라 그라운드유닛, 에어유닛으로 나뉨
		// 그라운드 유닛 - 탱크, 마린, SCV
		// 에어유닛 - 드랍쉽 
		
		Tank tank = new Tank();
		DropShip dropShip = new DropShip();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		// tank랑 dropship을 수리할 수 있음 
		scv.repair(tank); //Tank수리가 완료되었습니다.
		scv.repair(dropShip);// DropShip수리가 완료되었습니다. 
		
		// 수리를 하기 위해서는 ? 
		/* 방법 1. - 메서드오버로딩 
		   void repair(Tank tank) { } 
		   void repair(DropShip dropShip) { } 
		   문제점. 수리할 장비가 추가된다면? 
		*/
		
		/* 그러면 조상을 사용한다면 ?? 
		   void repair(GroundUnit gu) { } 
		   void repair(AirUnit au) { } 
		   
		   최소한 두개의 메서드가 필요함. 
		   >> 마린은 repair을 할 수 없음. 
		*/
		
		/*마린처럼 수리될수 없는 유닛이 매개변수로 가면 문제가 발생함 
		  문제점을 해결하기 위해서 인터페이스를 사용하면됨!
		  기존상속체계는 유지할 수 있으면서, 
		  서로다른 특징을가진 클래스에 공통점을 부여할 수 있다. 
		*/
		
		
		
		
	}

}
