package j0612;
//         shape 클래스를 상속받은 circle클래스 
public class Circle extends Shape{
	// iv
	private int radius; //반지름 
	Point p ; // 원점을 추가할 수 있음  < 포함관계 (x, y) + 반지름 
	
	// 생성자
	public Circle() {}
	public Circle(Point p, int r) {
		this.p = p ; 
		radius = r; 
	}
	public Circle(int radius) {
		// shape에 넓이랑 둘레값을 넣고싶음.
		// 넓이와 둘레를 넣어줌 
		//         public Shape(int area, int perimeter)
		super((int)(radius*radius*Math.PI ), (int)(2*Math.PI*radius));
		this.radius = radius;
	}
	// 메서드 
	// 메서드의 오버라이딩 : 부모랑 같은 선언부, 메서드명을 가짐 
	public void printInfo() {
		super.printInfo(); // 부모클래스에 있는 메서드를 호출 
		System.out.println("반지름 : "+ radius );
	}
	// getter setter
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	

}
