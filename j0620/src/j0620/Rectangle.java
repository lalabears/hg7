package j0620;
public class Rectangle extends Point{
	private int width; 
	private int height; 
	public Rectangle() {}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width; this.height = height;
	}
	public String toString() {
		return "x : "+ getX() + ", y : " + getY()
		+ ", w : "+ getWidth() + ", h : " + getHeight();
	}
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
class RectangleController{
	private Rectangle r = new Rectangle();
	public String calcPerimeter(int x, int y, int w, int h) {
		r.setX(x); r.setY(y); r.setHeight(h); r.setWidth(w);
		String str = "둘레 : " + 2*(r.getHeight()+r.getWidth());
		return r.toString() + str; 
	}
	public String calcRectArea(int x, int y, int w, int h) {
		r.setX(x); r.setY(y); r.setHeight(h); r.setWidth(w);
		String str = "넓이 : " + (r.getHeight()*r.getWidth());
		return r.toString() + str; 
	}
	
}

