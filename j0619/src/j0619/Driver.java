package j0619;

public class Driver {
	// 변수
	private String name; 
	private Car car; // 포함관계 
	// 생성자
	public Driver() {}
	public Driver(String name, Car car) {
		this.name = name;
		this.car = car; 
	}
	// 메서드 
	// 메서드 1. 오버로딩 
	void drive() {
		// 결합도를 낮추기 
		car.operate(); 
		
		
		// Car 클래스랑 결합도가 높은 상태 
		/*car.startEngine();
		car.moveForward();
		car.openWindow("뒤 왼쪽");*/
	}
	// setter & getter  - 간접적으로 데이터에 접근, 수정가능하게함
/*	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
*/	
	// 다형성은 - 결합도를 느슨하게 해준다
	// 코드가 간결해짐(중복을제거할 수 있음) 
	// Driver클래스는 매개변수타입을 상위클래스로 했기때문에
	//  하위클래스의 변경에대해서 신경쓰지 않아도되게됨. 
	void drive(VehicleH v) {
		v.moveForward();
		v.moveBackward();
	}
	// driver class가 car, moterbike클래스에 의존하고 있다. 
	// 두클래스들이 직접적인 관계를 가지고 있음 
	// 결합도가 높다고 표현함. 
/*	void drive(Car car) {
		car.moveForward();
		car.moveBackward();
	}
	void drive(MoterBike bike) {
		// MoterBike클래스를 없애고 MoterCycle로 바꾼다면? 
		bike.moveForward();
		bike.moveBackward();
	}*/
	
	
	

	
}
