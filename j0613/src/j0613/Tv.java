package j0613;

public class Tv extends Product{
	// 기본생성자 
	Tv(){
		this("티비", 200, 20);
	}
	// 생성자 
	Tv(String name, int price, int bonuspoint){
		this.productName = name;
		this.price = price;
		this.bonusPoint = bonuspoint; 
	}

}
