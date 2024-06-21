package j0621;

public class Point {
	private int x;
	private int y; 
	Point(){}
	Point(int x, int y){
		this.x = x; this.y=y;
	}
	// 메서드 오버라이딩 
	// 오브젝트의 toString()메서드를 자손에특성에맞게변경
	public String toString() {
		return "("+x+","+y+")";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

}
