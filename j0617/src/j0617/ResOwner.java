package j0617;
public class ResOwner {
	public void giveFood(Customer c) {
		System.out.println(c.getOrder());
	}
}
class CustomerA implements Customer{
	public String getOrder() {
		return "햄버거를 준다";
	}
}
class CustomerB implements Customer{
	public String getOrder() {
		return "피자를 준다";
	}
}
