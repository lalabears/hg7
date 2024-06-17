package j0617;

public class C0617_08 {

	public static void main(String[] args) {
		Owner o = new Owner(); 
		CustA a = new CustA(); // 햄버거만 주문하는 단골
		CustB b = new CustB(); // 피자만 주문하는 단골 
		CustC c = new CustC(); // 스파게티만 주문하는 단골
		o.giveFood(a); // 햄버거를 준다
		o.giveFood(b); // 피자를 준다
		o.give(c);
		ResOwner r = new ResOwner();
		CustomerA ca = new CustomerA();
		CustomerB cb = new CustomerB();
		r.giveFood(ca);
		r.giveFood(cb);
		
	}

}
