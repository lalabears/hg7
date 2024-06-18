package j0618;

public class Buyer {
	// 멤버변수, 객체변수 - iv
	String name;  //구매자이름
	int money;    // 보유금액(단위만원)
	int bonusPoint;// 보더스포인트 
	Product[] cart = new Product[10];
	// product들을 담을 수 있는 객체배열
	int count; // 구매한 물건의개수
	//생성자 
	Buyer() {}// 기본생성자 
	Buyer(String name, int money, int bonusPoint){
		this.name = name;
		this.money = money; 
		this.bonusPoint = bonusPoint; 
	}
	// 메서드 
	// 매개변수로 다형성 사용
	void buy(Product p) {
		this.money -= p.price; 
		this.bonusPoint += p.bonusPoint; 
		cart[count] = p;
		count++;
	}
	// 메서드 오버로딩 
	/*void buy(TV tv) {
		this.money -= tv.price; 
		this.bonusPoint += tv.bonusPoint; 
		cart[count] = tv;
		count++;
	}
	void buy(Ref ref) {
		this.money -= ref.price; 
		this.bonusPoint += ref.bonusPoint; 
		cart[count] = ref;
		count++;
	}
	void buy(Wash wash) {
		this.money -= wash.price; 
		this.bonusPoint += wash.bonusPoint; 
		cart[count] = wash;
		count++;
	}
	void buy(Cond cond) {
		this.money -= cond.price; 
		this.bonusPoint += cond.bonusPoint; 
		cart[count] = cond;
		count++;
	}*/
	void checkCart() {
		for(int i = 0 ; i < count ; i++) {
			System.out.println(cart[i].productName);
		}
	}
	
	
	

}
