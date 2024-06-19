package j0619;
public class Car extends VehicleH  {
	// 객체의 속성을 정의함 - 필드, 멤버변수
	boolean isConvertible; // 자동차 고유의 속성 
	// 객체의 기능을 정의함 - 메서드 
	public void moveForward() {
		System.out.println("차가 앞으로 전진합니다");
	}
	public void moveBackward() {
		System.out.println("차가 뒤로 후진합니다");
	}
	// 자동차의 고유메서드 
	void openWindow(String location) {
//  반환형   메서드명 ( 매개변수 )  <- 선언부. 
//                  매개변수 : 자료형 변수명  : lv 
		System.out.println(location+"의 창문을 엽니다 ");
	}
	// 공통창구 
	public void operate() {
		startEngine();
		moveForward();
		openWindow("뒤 왼쪽");
	}

}
