package j0607;

public class Circle {
	// 1. 변수
	int radius;   // iv
	static double pi = 3.14; //cv 
	// 2. 생성자
	Circle(){} // 기본생성자 
	Circle(int r){
		radius = r; 
	}
	// 3. 메서드
	// 메서드 오버로딩 
	double area() {
		return radius*radius*pi; 
	}
	double area(int r) {
		return r*r*pi; 
	}
	double area(double r) {
		return r*r*pi; 
	}
	
	double size() {
		return 2*radius*pi; 
	}
	double size(int r) {
		return 2*r*pi; 
	}
	double size(double r) {
		return 2*r*pi; 
	}
	
	void increR() {
		this.radius++;
	}
	
	
}
