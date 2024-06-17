package j0617;

public class Trans {
	int number;    // 교통 수단 번호 
	int passengerCount; // 교통수단의 승객 수 default 값 0
	int money; // 교통수단의 수입 default 값 0
	
	void take(int money) { // 승객을 태움 
		passengerCount++; // 승객1명증가
		this.money += money; 
	}

}
