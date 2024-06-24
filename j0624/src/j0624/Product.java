package j0624;
// 클래스는 객체를 정의, 생성하는데 사용됨 (필드+메서드)
public class Product extends Object{ 
	// 필드 - 클래스에 포함된변수 
	private String name; 
	private int price; 
	private int point; 
	// 생성자(constructor) 객체를 생성하기위한 특별한 메서드 
	Product(){}
	Product(String name, int price, int point){
		this.name=name; this.price= price; this.point = point;
	}
	// 메서드 - 특정 작업을 수행하기위한 명령문의 집합.
	// toString()은 Object객체의 매서드를 오버라이딩한것
	public String toString() {
		//  printf("%d", 123)
		return name +", "+ price +", "+ point ;
		// return String.format("%s, %d, %d", name, price, point );
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	

}
