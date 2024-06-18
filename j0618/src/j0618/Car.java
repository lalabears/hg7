package j0618;
public class Car {
	String color;
	int door;
	void go() {
		System.out.println("출발합니다.");
	}
	void stop() {
		System.out.println("정지합니다.");
	}
	//메서드 오버라이딩(Object객체로부터 메서드오버라이딩)
	public String toString() {
		return "자동차 색: "+color+",문: "+door;
	}
}
class Ambulance extends Car{
	void siren() {
		System.out.println("사이렌을 울립니다.");
	}
	public String toString() {
		return "구급차 색: "+color+",문: "+door;
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("물을뿌립니다.");
	}
	public String toString() {
		return "소방차 색: "+color+",문: "+door;
	}
}