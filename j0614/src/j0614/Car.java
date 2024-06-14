package j0614;
public class Car {
	Tire[] tires = {
			new Tire("앞왼쪽", 6),new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽",8) ,new Tire("뒤오른쪽",3)
	};
	int run() {
		System.out.println("자동차가 달립니다. ");
		for(int i = 0 ; i < tires.length; i ++ ) {
			if(tires[i].roll() == false ) {
				stop();
				return (i+1);
			}
		}
		return 0; 
	}
	
	
	
	void stop() {
		System.out.println("자동차가 멈춥니다. ");
	}
	/*
	// 포함관계
	Tire frontLeftT = new Tire("앞왼쪽", 6);
	Tire frontRightT = new Tire("앞오른쪽", 2);
	Tire backLeftT = new Tire("뒤왼쪽",8);
	Tire backRightT = new Tire("뒤오른쪽",3);
	int run() {
		System.out.println("자동차가 달립니다 ");
		if(frontLeftT.roll() == false ) {
			stop();			return 1; 
		}
		if(frontRightT.roll() == false ) {
			stop();			return 2; 
		}
		if(backLeftT.roll() == false) {
			stop();			return 3; 
		}
		if(backRightT.roll() == false) {
			stop();			return 4;
		}
		return 0; 
	}
	*/
}

