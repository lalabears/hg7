package j0627;
public class Food { 
	private String name;
	private int price;
	Food(String name, int price){
		this.name=name; this.price=price;
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
	@Override
	public String toString() {
		return "이름: " + name + ", 가격 : " + price ;
	}
}
class Drink extends Food{
	boolean achole;
	Drink(){
		this("물", 1000, false);
	}
	Drink(String name, int price) {
		this(name, price, false);
	}
	Drink(String name, int price, boolean achole) {
		super(name, price);
		this.achole = achole;
	}
	@Override
	public String toString() {
		return super.toString()+ ", 술? " + achole ;
	}
	
}
class Snack extends Food{
	boolean sweet;
	Snack(){
		this("초코파이", 500, true);
	}
	Snack(String name, int price, boolean sweet) {
		super(name, price);
		this.sweet = sweet;
	}
	@Override
	public String toString() {
		return super.toString()+ ", 단거? " + sweet ;
	}
	
}