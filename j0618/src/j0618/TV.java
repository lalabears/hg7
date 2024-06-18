package j0618;
public class TV extends Product{
	TV(){
		this("75인치 smart TV",100,10);
	}
	TV(String productName,int price,int bonusPoint){
		super(productName,price,bonusPoint);
	}
}
