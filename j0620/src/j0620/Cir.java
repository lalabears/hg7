package j0620;
// shape (추상클래스)를 상속받음 
public class Cir extends Shape {
	double r; 
	// 생성자의 오버로딩
	Cir(){}
	Cir(double r){
		this(new Point(0,0),r); // this() 자기생성자 호출 
	}
	Cir(Point p, double r){
		super(p); // super()상위클래스생성자 호출 
		this.r = r; 
	}
	// 추상메서드를 완성시킴. 
	double calcArea() {
		return Math.PI*r*r;
	}
	// getter setter 
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	

}
