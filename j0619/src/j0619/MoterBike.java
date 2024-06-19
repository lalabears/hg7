package j0619;

public class MoterBike extends VehicleH {
	// 오토바이의 고유속성 
	boolean isRaceable; 
	// 인터페이스 추상메서드 구현 
	public void moveForward() {
		System.out.println("오토바이가 앞으로 전진합니다");
	}
	// 메서드 오버라이딩 
	public void moveBackward() {
		System.out.println("오토바이가 뒤로 후진합니다");
	}
	// 오토바이의 고유 메서드 
	void stunt() {
		System.out.println("오토바이로 묘기를 부립니다");
	}
	

}
