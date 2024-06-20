package j0620;
// 추상클래스 Shape  
public abstract class Shape {
	// Point를 포함한다. 
	Point p = new Point();
	// 기본생성자, 포인트를 매개변수로 받는 생성자. 
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p = p;
	}
	// 추상메서드 :  
	abstract double calcArea();
	// getter & setters 
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	} 
	
	
}
