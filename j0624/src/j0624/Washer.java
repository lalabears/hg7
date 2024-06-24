package j0624;
public class Washer extends Product {
	// 자식 객체만 가지고 있는 변수 
	private String capacity;
	Washer(){
		this("그랑데세탁기",550000,5500,"23kg");
	}
	Washer(String name, int price, int point, String capacity) {
		super(name, price, point); // 모든변수private이기때문에 super()
		// this.name = name;  super.name=name; 
		this.capacity = capacity;
	}
	public String toString() {
		return super.toString()+ ", "+ capacity;
		// super는 부모객체를 뜻함. 
	}
	
}
