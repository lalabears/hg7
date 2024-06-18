package j0618;
public class Ref extends Product {
	Ref(){
		this("비스포크 냉장고", 150, 15);
	}
	Ref(String productName,int price,int bonusPoint){
		super(productName,price,bonusPoint);
	}
	
}
