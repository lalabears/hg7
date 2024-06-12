package j0612;
public class Shape  {
	// iv
	private int area; // 넓이
	private int perimeter; // 둘레
	// 생성자 
	public Shape() {}
	public Shape(int area, int perimeter) {
		this.area = area; this.perimeter = perimeter;
	}
	// 메서드
	public void printInfo() {
		System.out.println("넓이 : "+ area);
		System.out.println("둘레 : "+ perimeter);
	}
	// Getters and Setters 
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}
	
	
}
