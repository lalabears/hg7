package j0617;

public class Man {
/* name, money
   method: takeBus, takeSubway, showInfo
                               :00님 잔액 00원입니다*/
	// 변수 
	final int BUSP = 1000;
	static final int SUBP = 1500;
	String name;
	int money;  // 객체변수로 객체가 가지고있는 돈을 의미함
	// 생성자
	public Man(String name, int money){
		this.name = name; this.money = money ;
	}
	// 메서드 
	void takeTrans(Trans t) {
		// 다형성으로 인해서 t는 bus, subway도 될 수 있음 . 
		int m = 0 ; 
		if( t instanceof Bus)  m = BUSP;
		else if( t instanceof Subway) m = SUBP;
		t.take(m);
		money -= m ; 
		
	}
	void showInfo() {
		System.out.println(name+"님 잔액 "+money+"원입니다");
	}
	
/*	void takeBus(Bus bus) {
		//      버스에 대한 정보를 매개변수로 받아온다. bus는 객체다
		// 버스라는 클래스에 1000원을 지불할것임.
		bus.take(BUSP);
		// 객체가 가지고 있는 돈에서 1000원이 소비된다. 
		money-= BUSP; 
	}
	void takeSubway(Subway subway) {
		// 서브웨이라는 클래스에 1500원을 지불할것임.
		subway.take(SUBP);
		// 객체가 가지고 있는 돈에서 1500원이 소비된다. 
		money-= SUBP; 
	} */
	
	
	
}
