package j0612;

public class Product {
	private static int count = 1000; 
	private int pId;
	private String pName;
	private int price;
	private double tax; 
	{
		count++;
	}
	Product(){}
	Product(String pName,int price,double tax){
		this.pId = count; 
		this.pName = pName;
		this.price = price;
		this.tax = tax; 
	}
	// 출력용메서드를 만들거나 getter만들어사용
	public void printInfo() {
		System.out.printf("%d\t%s\t%d\t%.2f\n",
				pId, pName, price, tax);
	}
	
	
	// Setter & Getter 
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	
	
}
