package j0613;
public class Shop {
	public static void main(String[] args) {
		// 구매자는 1000만원에 포인트가 0입니다. 
		Buyer b1 = new Buyer(1000, 0);
		Tv tv = new Tv();  // 기본생성자로 만들어진객체 
		Tablet tb = new Tablet();
		Pc pc = new Pc();
		
		b1.buy(tv);
		b1.printInfo();
		b1.buy(tb);
		b1.printInfo();
		b1.buy(pc);
		b1.printInfo();
		
		
	/*	// 테레비를 구매하는 메서드를 만들어보세요 
		// void buyTv - > buyer
		b1.buyTv(tv);
		b1.printInfo();
		// 현재 남은돈 : 800	현재 가진 포인트: 20
		// 테블릿을 구매하는 메서드 
		b1.buyTb(tb);
		b1.printInfo();
		// 현재 남은돈 : 700	현재 가진 포인트: 30
		// Pc 구매 
		b1.buyPc(pc);
		b1.printInfo();
     */
	}

}
