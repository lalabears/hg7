package stuPkg;
// import 패키지명.클래스명 > 패키지명을 생략하고 클래스사용가능
import j0613.Parent; // j0613내 Parent 클래스 
import j0613.*; // j0613패키지 내 모든 클래스
public class ChildB extends Parent {
 // parent를 상속받으려면 어떻게 해야할까요? 
	
	ChildB(){ super(); } // public Parent() {} 
	ChildB(int n1, int n2){
		// super(n1, n2); 
		// (default) Parent(int n1,int n2)
		// default - 같은패키지 내에서만 사용할 수 있음 
		super(n1,n2,1,1); 
		// 	protected Parent(int n1,int n2,int n3, int n4)
		// 같은패키지 or 다른패키지지만 상속받는다면 사용가능 	
	}
	
	void method() {
		super.n1 = 100; // n1은 public이기때문에 접근가능 
		super.n2 = 200; // n2는 protected 이기때문에 접근가능 
		super.methodA(); // methodA는 public이기때문에 접근가능
		super.methodB(); // methodB는 protected이기때문에 접근가능
	}
	
	
}
