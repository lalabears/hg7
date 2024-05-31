package j0531;

public class Car {
	String color; 
	int speed; 
	final int MAX_SPEED = 200; 
	
	void setColor(String color) {
		this.color = color; 
	}
	int getSpeed() {
		return this.speed;
	}
	void print() {
		System.out.println("이 자동차 색은 "+ this.color );
		System.out.println("이 자동차 속도는 "+ this.speed );
	}
}
