package stuPkg;
import j0613.Parent;
public class C0613_01 {
	public static void main(String[] args) {
		ChildB c = new ChildB(1,2);
		//n1은 퍼블릭하기때문에 어느클래스에서나 접근가능
		c.n1 = 1111; 
		// C0613_01 클래스는 상속관계가 아니기때문에 접근이 불가능함. 
		// c.n2 = 1234; 
		
		c.method(); // childB클래스 메서드
		c.methodA(); // 부모클래스의 퍼블릭 메서드 
		// c.methodB(); 
		// C0613_01 클래스는 상속관계가 아니기때문에 protected라도 접근불가  
		
		Parent p = new Parent(); // 퍼블릭 생성자 
		p.n1 = 100 ; // 퍼블릭 필드 
		p.methodA(); // 퍼블릭 메서드
	}

}
