package j0612;
public class Point {
	int x; 
	int y; 
	Point(){
		this(1,1); // this()는 생성자를 호출함. 
	} 
	Point(int x, int y){
		this.x = x; 
		this.y = y; 
	}
	
	
	String getLoc() {
		String str = "x : "+x +", y: "+y; 
		return str; 
	}
}
