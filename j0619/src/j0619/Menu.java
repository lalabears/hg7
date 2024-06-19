package j0619;
// Menu  - Restaurant 을 구현함
public abstract class Menu implements Restaurant {
	// sell(int n) 을 구현하지 않을 예정이므로 
	// 추상클래스로 만든다. 
	private String name;
	private int price;
	
	Menu(){}
	Menu(String name, int price){
		this.name = name; this.price = price;
	}
	// getter & setter 
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
