package j0613;
public class Buyer {
	int myMoney;
	int myBonusPoint; 
	Product[] cart = new Product[10];
	int count; 
	
	Buyer(){} // 기본생성자 
	Buyer(int myMoney, int myBonusPoint){
		this.myMoney = myMoney;
		this.myBonusPoint = myBonusPoint;
	}
	void buy(Product p) {
		System.out.println(p.productName+"을 구매합니다");
		this.myMoney -= p.price;
		this.myBonusPoint += p.bonusPoint;
		cart[count] = p;
		count++;
	}
	void checkCart() {
		for(int i = 0 ; i < count ; i ++ ) {
			System.out.println(cart[i].productName);
		}
	}
	void addMoney(int money) {
		this.myMoney += money;
	}
	
	/*
	void buyTv(Tv tv) {
		this.myMoney -= tv.price;
		this.myBonusPoint += tv.bonusPoint;
	}
	void buyTb(Tablet tb) {
		this.myMoney -= tb.price;
		this.myBonusPoint += tb.bonusPoint;
	}
	void buyPc(Pc p) {
		this.myMoney -= p.price;
		this.myBonusPoint += p.bonusPoint;
	}*/
	void printInfo() {
		System.out.println("현재 남은돈 : "+this.myMoney);
		System.out.println("현재 가진 포인트: "+ this.myBonusPoint);
	}
}
