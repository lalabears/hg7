package j0620;
public class Point {
	// 필드
	private int x;
	private int y; 
	// 생성자 
	Point(){}
	Point(int x, int y ){
		this.x = x; this.y = y ;
	}
	public String toString() {
		return "x : "+ x +", y : "+ y;
	}
	
	// setter & getter 
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

