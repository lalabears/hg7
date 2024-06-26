package j0626;
public class Cafe {
//	cafe 클래스 변수는 private name, price, isHot(뜨거우면 true)
	private String name;
	private int price; 
	private boolean isHot;
	// 생성자 : 객체를 생성할 수 있게해주면서 값을 초기화해줌 
	Cafe(){
		// this( ) 자기자신의 생성자를 호출함. 
		this("아메리카노", 2500, false);
	}
	// 생성자의 오버로딩에 의해 매개변수가 다르면 여러개 생성자를 만들 수 잇음
	Cafe(String name, int price, boolean isHot){
		this.name = name; this.price = price; this.isHot = isHot;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + ", 가격: " + price + ", 뜨커? " + isHot ;
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
	public boolean isHot() {
		return isHot;
	}
	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}
}
class Americano extends Cafe{
	private int shot; 
//	기본생성자: (기본은 2샷 2500원에 아이스)
	Americano(){
		this("아메리카노", 2500, false); // 자기생성자 호출 > 48줄 호출
		this.shot = 2; 
	}
	Americano(String name, int price, boolean isHot){
		super(name, price, isHot); // 부모생성자 호출 >13줄 호출
		this.shot = 2;
	}
	
	void addShot(int shot) {//	addShot(1) > 샷추가 메서드   1샷당 500원 추가
		this.shot += shot; 
		// 가격변동을 고려해야함. 
		int price = super.getPrice() + shot * 500 ;
		super.setPrice(price);	
	}
	public String toString() {
		return super.toString() + ", 샷 : " + shot;
	}
}
class Latte extends Cafe{
	 private String milk;
	 //(기본은 우유, 3500원, 아이스)
	 Latte(){
		 this("카페라떼", 3500, false); // 자기생성자 호출 > 69줄 호출
		 this.milk = "우유"; 
	 } 
	 Latte(String name, int price, boolean isHot){
		 super(name, price, isHot); // 부모생성자 호출 >13줄 호출
		 this.milk = "우유"; 
	 }
	 //changeMilk("두유") > 우유변경메서드  우유변경시 500원 추가
	 void changeMilk(String milk) {
		 this.milk = milk; 
		 super.setPrice(super.getPrice() + 500);	 // 가격변동을 고려해야함.
	 }
	 public String toString() {
		 return super.toString() + ", 우유 : " + milk;
     }
	 
}








