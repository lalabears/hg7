package j0610;
public class Product {
	// 변수선언
	static int count = 1000; // 클래스변수 
	int serialNo; // 인스턴스변수 
	String pName; 
	int price; 
	// 초기화 블럭 
	{
		count++;
		serialNo = count; 
	}
	// 생성자 
	Product(){}
	Product(String name){
		pName = name;
	}
	Product(String pName, int price){
		this.pName = pName; 
		this.price = price;
	}

}
