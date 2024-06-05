package j0605;

public class Rect {
	int x1 = 0 ;
	int y1 = 0 ;
	int x2 = 0 ;
	int y2 = 0 ;
	Rect buildRect(int a, int b, int c, int d) {
		x1 = a; 		y1 = b;		x2 = c;		y2 = d; 
		System.out.println("사각형의 면적: " + (x2-x1)*(y2-y1));
		return this; 
	}
	Rect buildRect(Point tL, Point bR) {
		x1 = tL.x;		y1 = tL.y;		x2 = bR.x;		y2 = bR.y;
		System.out.println("사각형의 면적: " + (x2-x1)*(y2-y1));
		return this;
	}
	Rect buildRect(Point tL, int w, int h) {
		x1 = tL.x; y1 = tL.y; x2 = x1+w; y2 = y1+h;
		System.out.println("사각형의 면적: " + (x2-x1)*(y2-y1));
		return this;
	}

}
