package j0617;
public class C0617_02 {
	public static void main(String[] args) {
		Man hong = new Man("홍길동", 10000);
		Man kang = new Man("강백호", 5000);
		Bus bus101 = new Bus(101); // 101번
		Subway line2 = new Subway(2); // 2호선 
		// takeTrans는 매개변수가 Trans 클래스
		// 다형성때문에 자손의 객체를 사용할 수 있다. 
		hong.takeTrans(line2); // 1500
		hong.takeTrans(bus101); // 1000
		hong.takeTrans(line2);  // 1500
		hong.showInfo(); // 홍길동님 잔액 6000원입니다
		kang.takeTrans(bus101);
		kang.takeTrans(line2);
		kang.takeTrans(bus101);
		kang.showInfo(); // 강백호님 잔액 1500원입니다
		bus101.showInfo();
		line2.showInfo();
		
		
		
		
		
		
	/*	상속을 사용하지 않았을 때 
	    Bus bus101 = new Bus(101); // 101번버스
		hong.takeBus(bus101); // 101버스를타는 홍길동
		kang.takeBus(bus101); // 101버스를타는 홍길동
		
		Subway line2 = new Subway(2); // 2호선'
		kang.takeSubway(line2);
		hong.takeSubway(line2);
		
		hong.showInfo();
		kang.showInfo();
		bus101.showInfo();
		line2.showInfo(); */
		

	}

}
