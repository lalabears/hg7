package j0613;

public class ChildA extends Parent {
	
	int n1 = 100;
	
	void method() {
		int n1 = 9000; 
		System.out.println("n1 : "+ n1);
		System.out.println("this.n1 : "+ this.n1);
		System.out.println("super.n1 : "+ super.n1);
	}

}
