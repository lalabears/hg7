package j0612;

public class Child extends Parent {
	int x = 7; // 멤버변수 
	void printAttr() {
		int x = 1; // lv
		System.out.println("x : " + x );
		System.out.println("this.x : " + this.x );
		System.out.println("super.x : " + super.x );
	}

}
