package j0619;
//                   클래스명              인터페이스 
//public abstract class VehicleH implements Vehicle  {
public class VehicleH implements Vehicle  {
	// abstract : interface method를 완성시키지 않았음. 
	String company; 
	String model ;
	String color; 
	int wheels; 
	void startEngine() {
		System.out.println("시동을 겁니다");
	}
	public void moveForward() {
		System.out.println("앞으로 전진합니다");
	}
	// 인터페이스 추상메서드 구현 
	public void moveBackward() {
		System.out.println("뒤로 후진합니다");
	}

}
