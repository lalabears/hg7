package j0612;
// Point와 Point3은 상속 관계에 있음 
public class Point3 extends Point{
	int z; 
	// 상속받았기때문에 x, y변수를 가지고 있음 
	// 필요하던, 필요없던 부모의 모든멤버를 상속받음 	
	int k; // 자식의 변화는 부모에게 상관없음
	// 그러나 부모의 변화는 자식에게 큰영향이있을 수 있음
	
	Point3(){ 
		this(1,1,1); // this() 객체의 생성자
	};
	// super() 와 this()는 생성자의 맨 윗줄에 있어야 한다!!! *******
	Point3(int x, int y, int z){ 
		//this.x = x; 	this.y = y; > 이런식으로 접근하는것은 올바르지 않음.
		// 초기화는 나의 객체만 초기화해 줘야함. 
		super(x,y); // 부모의 생성자를 호출함. 
		// 조상이 선언한 멤버는 조상이 초기화를 해라. 
		this.z = z;
	}
	
	
	
	
	
	
	
	
	// 메서드의 오버라이딩 
	// 기존 조상의 메서드에서 내용만 수정할 수 있음. 
	// 메서드의 선언부는 수정할 수 없음 
	String getLoc() {  // 메서드의 선언부 
		String str = "x : "+x +", y: "+y +" , z : "+z; 
		return str; 
	}
}
