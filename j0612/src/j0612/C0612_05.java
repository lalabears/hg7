package j0612;
public class C0612_05 {
	public static void main(String[] args) {
		/* 오버라이딩 overriding(덮어쓰다)
		   상속받은 조상의 메서드를 자신에 맞게 변경하는 것 
		   
		   조건:
		   1. 선언부가 조상클래스의 메서드와 일치해야함.
		   2. 접근제어자가 조상보다 좁은범위로 변경불가능
		   
		   오버로딩. 오버라이딩은 서로관계가 없습니다!
		   오버로딩: 기존에 없는메서드를 만드는것,다만 이름이 같고 매개변수가다름
		   오버라이딩: 상속받은 메서드내용을 변경. 기존에 있는 메서드의 내용을 변경하는것
		*/
		Point p = new Point();
		p.x = 10;
		p.y = 20;
		System.out.println(p.getLoc());
		//x : 10, y: 20
		
		// point3클래스는 point를 상속받은 클래스임
		Point3 p1 = new Point3();
		p1.x = 10;
		p1.y = 20;
		p1.z = 30; 
		//              부모의 메서드를 호출
		System.out.println(p1.getLoc());
		// 오버라이딩 이후에는 자식 클래스의 메서드를 호출함 
		// x : 10, y: 20
		// x : 10, y: 20 , z : 30
		
		Shape sh = new Shape(10,100);
		sh.printInfo();
		// 넓이 : 10 	둘레 : 100
		
		Circle c = new Circle(3);
		c.printInfo();
		// 반지름 : 3
		
		Rectangle r = new Rectangle(10,20);
		r.printInfo();
		// 너비 : 10		높이 : 20
		
		/* this > 나 자신 객체자신
		   this() > 자신의 생성자를 의미 
		   
		   super > 조상님
		   super() > 조상님의 생성자를 의미함. 
		   
		   this, super 다 자신을 의미하지만, 
		   this 주로 멤버변수랑 lv 구별할때 사용. 
		   super > 조상의 멤버와 자신의멤버를 구별할때 사용함. 
		   
		*/
		
		Child ch = new Child();
		ch.printAttr();
		/*  child에 x변수가 존재하지 않을때 출력 :
		  	x : 100      	this.x : 100      	super.x : 100
		*/
		/*  child 인스턴스변수 x가 존재할때 출력
			x : 7		this.x : 7			super.x : 100
		*/ 
		/*  child안의 printAttr()안에 지역변수가 존재할때 출력
		 	x : 1 		this.x : 7			super.x : 100
		 */
		
		/* super() - 조상의 생성자 
		  : 생성자, 초기화 블럭은 상속되지 않음. 
		  : 조상의생성자를 호출해야할때 super()를 사용함. 
		  : 조상의 멤버는 조상의 생성자를 호출해서 초기화함. 
		 
		*/
		
		System.out.println("------------------------");
		Circle c1 = new Circle(5);
		c1.printInfo();
		// 넓이 : 78  둘레 : 31	반지름 : 5
		
		Rectangle r1 = new Rectangle(10, 5);
		r1.printInfo();
		// 넓이 : 50  둘레 : 30  너비 : 10	 높이 : 5
		
		// 포함관계 
		Point center = new Point(2,2);
		// x:2, y:2 값을 가지는 center객체 생성
		Circle c2 = new Circle(center,5);
		// x:2, y:2 의 중심을 가지며 반지름이 5인 원객체 생성
		Circle c3 = new Circle(new Point(10,10),10); 
		// x:10 y:10 의 중심을 가지며 반지름이 10인 원객체 생성
		
		// 사각형의 경우 사각형은 점 4개로 이루어져 있음. 
		Point[] p4 = {new Point(1,1), new Point(1,10),
				new Point(10,1),new Point(10,10)};
		Rectangle r2 = new Rectangle(p4);
		Rectangle r3 = new Rectangle(p4[0],p4[1],p4[2],p4[3]);
		
		
	}

}
