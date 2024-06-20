package j0620;
public class Circle extends Point {
	private int radius; 
	public Circle() {};
	public Circle(int x, int y, int r) {
		super(x,y);
		radius = r; 
	}
	public String toString() {
		return super.toString()+", r: "+ radius; 
	}
	// getter & setter 
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}

class CircleController{
	// 포함관계
	private Circle c = new Circle();
	
	public String calcCircum(int x, int y, int r) {
		c.setX(x); c.setY(y); c.setRadius(r);
		String str = "둘레 : " + 2 * Math.PI * c.getRadius() ;
		return c.toString()+ str; 
	}
	public String calcCirArea(int x, int y, int r) {
		c.setX(x); c.setY(y); c.setRadius(r);
		String str = "면적 : " + Math.PI * c.getRadius()*c.getRadius() ;
		return c.toString()+str; 
	}
}







