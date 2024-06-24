package j0624;
//  상속: 자식클래스 extends  부모클래스
public class Tv extends Product{
	// 상속을 받게 되면 부모의 필드, 메서드를 다 가지게 됨.
	
	// this(), super()는 맨 윗줄에 써줘야함. 
	Tv(){  // 매개변수가 없는 생성자 : 기본생성자 
		this("삼성TV",1000000,10000); 
		// this()는 같은 생성자를 호출한다 
	}
	// 생성자의 오버로딩 (오버로딩은 같은메서드인데 매개변수가 다를경우)
	Tv(String name, int price, int point){
		super(name, price, point);
		// super() 는 부모의 생성자를 호출함. 
	}
}
