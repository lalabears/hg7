package j0617;

public class Subway extends Trans {
/* number, passengerCount, money
   take 승객을 태움, showInfo
	       : 지하철 00번 승객은 00명이고 지하철수입은 00원입니다
*/
	Subway(int number){
		this.number = number; 
	}
	void showInfo() {
		System.out.println("지하철 "+number+"번 승객은 "+passengerCount
				+"명이고 지하철수입은 "+money+"원입니다");
	}

	/*
	// 변수
	int number;    // 지하철 라인 
	int passengerCount; // 승객 수 default 값 0
	int money; // 수입 default 값 0
		
	// 생성자
	Subway(int number){
		this.number = number; 
	}
	// 메서드
	void take(int money) { // 승객을 태움 
		passengerCount++; // 승객1명증가
		this.money += money; 
	}
	void showInfo() {
		System.out.println("지하철 "+number+"번 승객은 "+passengerCount
				+"명이고 지하철수입은 "+money+"원입니다");
	}
		*/
}
