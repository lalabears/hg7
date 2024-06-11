package j0611;
public class C0611_05 {
	public static void main(String[] args) {
		/* 포함 : 클래스의 멤버로 참조변수를 선언하는것 
		*/
		
		Circle c = new Circle();
		c.p.x = 10; 
		c.p.y = 10; 
		c.r = 5; 
		
		Circle2 c2 = new Circle2();
		c2.x = 10; 
		c2.y = 10; 
		c2.r = 5; 
		
		Circle3 c3 = new Circle3();
		c3.x = 10; 
		c3.y = 10;
		c3.r = 5; 

	}

}
