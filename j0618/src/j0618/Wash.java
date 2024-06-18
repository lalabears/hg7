package j0618;
public class Wash extends Product {
	Wash(){
		this("그랑데 세탁기", 90,9);
	}
	Wash(String productName,int price,int bonusPoint){
		super(productName,price,bonusPoint);
	}
}
