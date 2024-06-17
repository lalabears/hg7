package j0617;

public class Bus extends Trans {
/* number, passengerCount, money
   take 승객을 태움, showInfo
            : 버스 00번 승객은 00명이고 버스수입은 00원입니다
*/
	Bus(int number){ 
		this.number = number; 
	}
	void showInfo() {
		System.out.println("버스 "+number+"번 승객은 "+passengerCount
				+"명이고 버스수입은 "+money+"원입니다");
	}
	
	
/*
	// 변수
	int number;    // 버스번호
	int passengerCount; // 승객 수 default 값 0
	int money; // 수입 default 값 0
	
	// 생성자
	// Bus(){} // 버스번호가 없는 버스는 존재하지 않는다. 
	Bus(int number){ 
		this.number = number; 
	}
	// 메서드
	void take(int money) { // 승객을 태움 
		passengerCount++; // 승객1명증가
		this.money += money; 
	}
	void showInfo() {
		System.out.println("버스 "+number+"번 승객은 "+passengerCount
				+"명이고 버스수입은 "+money+"원입니다");
	}
	*/
}
