package j0613;

public class Tablet extends Product {
	Tablet(){
		this("태블릿", 100, 10);
	}
	Tablet(String name, int price, int bonuspoint){
		this.productName = name;
		this.price = price;
		this.bonusPoint = bonuspoint; 
	}
	
	

}
