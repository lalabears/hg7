package j0619;
// Electronic  - 부모클래스
public class Electronic {
	// 필드 - iv, cv 
	private String brand; // 브랜드
	private String name;  // 기기명
	private int price;    // 가격
	// 생성자 
	Electronic(){}
	Electronic(String brand,String n,int price){
		// 매개변수와 객체변수가 이름이 같다면 this 사용
		// 지역변수에서는 지역변수가 우선이됨. 
		this.brand = brand; // this는 객체자신을 의미 
		name = n; 
		this.price = price ; 
	}
	// 메서드 - Object class에서 overriding 
	public String toString() {  // 선언부가 부모와같아야함 
		return "brand=" + brand + ", name=" + name + ", price=" + price + "원";
	}
	
	// getter and setter
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
	
	
	

}
