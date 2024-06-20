package j0620;

public class Rect extends Shape  {
	double width; 
	double height; 
	
	Rect(int w, int h){
		this(new Point(0,0), w, h);
	}
	Rect(Point p , int w, int h){
		super(p);
		width = w; height = h; 
	}
	double calcArea() {
		return width * height;
	}
	boolean isSquare() {
		if(width == height) return true;
		else return false; 
	}

}
