package j0612;
// Rectangle 사각형도 shape 로부터 상속을 받는다. 
public class Rectangle extends Shape {
	// 변수
	private int width; // 너비
	private int height; // 높이
	Point[] p; // 사각형은 포인트가 4개임 
	// 생성자
	public Rectangle(Point[] p) {
		this.p = p;
	}
	public Rectangle(Point p1,Point p2,Point p3,Point p4 ) {
		Point[] p = {p1,p2,p3,p4};  // p[0] = p1; p[1]=p2; p[2]=p3; p[3]=p4;
		this.p = p; 
	}
	
	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		super(width*height, 2*(width+height));
		//  부모의 상속자 호출 super( 넓이, 둘레) 
		this.width = width; this.height = height; 
	}
	// 메서드 
	// 메서드의 오버라이딩을 사용함. 
	public void printInfo() {
		super.printInfo(); // 부모의 printInfo() 호출 
		System.out.println("너비 : "+width);
		System.out.println("높이 : "+height);
	}
	
	// getters and setters
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	
}
