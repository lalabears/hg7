package j0603;
public class Car {
	//1. 속성 ( 변수 )
	String color;         // null
	String size;          // null
	boolean engineState;  // false 
	// 2. 생성자 ( 기본 생성자는 생략가능 )
	// 3. 행동 ( 메서드 )
	void printAtt() {
		System.out.println("색 : "+ color +", 크기 : "+ size);
		if(engineState) {
			System.out.println("시동이 켜졌습니다.");
		}else {
			System.out.println("시동이 꺼졌습니다.");
		}
	}
	void startEngine() {
		if(engineState) {
			System.out.println("시동이 이미 켜져있습니다.");
		}else {
			engineState = true; 
			System.out.println("지금 시동을 킵니다.");
		}
	}
	void stopEngine() {
		if(engineState==false) {
			System.out.println("시동이 이미 꺼져있습니다.");
		}else {
			engineState = false; 
			System.out.println("지금 시동을 끕니다. ");
		}
	}
	
	

}
