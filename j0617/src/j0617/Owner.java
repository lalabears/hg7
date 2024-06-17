package j0617;

public class Owner {
	void giveFood(CustA a) {
		System.out.println("햄버거를 준다");
	}
	void giveFood(CustB b) {
		System.out.println("피자를 준다");
	}
	void giveFood(CustC c) {
		System.out.println("스파게티를 준다");
	}
	void give(Cust c) {
		if ( c instanceof CustA ) {
			System.out.println("햄버거를 준다");
		}
		if ( c instanceof CustB) {
			System.out.println("피자를 준다");
		}
		if ( c instanceof CustC) {
			System.out.println("스파게티를 준다");
		}
	}
}
class Cust{
	String name;
	Cust(){}
	Cust(String name){ this.name = name;}
}
class CustA extends Cust {}
class CustB extends Cust {}
class CustC extends Cust {}
