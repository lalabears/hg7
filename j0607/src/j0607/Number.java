package j0607;

public class Number {
	int x; 
	int y; 
	
	/*
	메서드 - 매개변수 
	
	자료형 메서드명 (매개변수1, 매개변수2, .., 매개변수n) {
	 	코드
	 	return 문
	}
	매개변수는 자료형을 꼭 명시해주어야함. 기본형, 참조형 사용가능
	
	메서드 호출시 :
	참조변수명.메서드명( 인수1, 인수2, .. , 인수n );
	
	인수들은 값들을 넣는다 
	*/

	//	1. 값에 의한 호출 
// 자료형  메서드명 ( 매개변수1 , 매개변수2 )	
	int    add    (int x, int y ) {
     // x = 10, y = 20; 
		return x+y; 
// 반환값 자료형은 메서드 자료형과 동일해야함.
	}
	
	void swap ( int x, int y ) {
		// x = 10, y = 20;
		int temp = x; 
		x = y; 
		y = temp; 
		System.out.printf("메서드내: x: %d y: %d\n",x,y);
		// swapInt(a,b) 로 호출했으므로 x는 a 값 y 는 b 값이 복사.
		// 메서드가 끝난 후에는 그 값을 돌려받지는 못함. 
	}
	// 매개변수를 사용하지 않고 인스턴스 변수를 사용할 경우. 
	void swap() {
		int temp = x;
		x = y; 
		y= temp; 
		System.out.printf("메서드내: x: %d y: %d\n",x,y);
		// 전역변수를 사용하면 값이 바뀜을 알 수 있다. 
	}
	
	// 2. 참조에 의한 호출. call by reference
	// 매개변수의 원래 주소값에 저장하는 방식. 
	// 메서드의 실행에 따라 인수로 전달한 변수값이 영향을 받음 
	static void swap(Number a) {
		int temp = a.x;
		a.x = a.y; 
		a.y = temp; 
		System.out.println(a);
		System.out.printf("메서드내: x: %d y: %d\n",a.x,a.y);
		// number클래스의 객체를 생성해 값을 매개변수로 전달하게되면. 
		// 값이 아닌 주소가 전달됨.
		// 때문에 swapRef 메서드에서 객체에 저장한 결과가 
		// 호출한 쪽에 영향을 끼침. 
	}
	
	
	/*
	메서드의 오버로딩 
	메서드를 만들때 각각의 메서드는 다른이름을 만들어야함. 
	같은기능을 한다고 한다면.. 
	자바에서는 매개변수의 개수나 종류가 다르다면 같은이름으로 정의할 수 있게해줌
	이를 메서드 오버로딩이라고함.
	- 이름이 같아야함.
	- 매개변수의 개수, 자료형이 달라야함. 
	
	 ** 매개변수가 같고 리턴타입이 다를경우 오버로딩 성립X 
	*/
	/*
	int swap ( int x, int y ) { // 오버로딩 성립안함
		int temp = x; 
		x = y; 
		y = temp; 
		return temp;
	}*/
	
	// 매서드 오버로딩 사용 
	int max(int x, int y ) {
		if (x>y) return x;
		else return y ;
	}
	double max(double x, double y ) {
		if (x>y) return x;
		else return y ;
	}
	double add(double x, double y ) {
		return x+y; 
	}
	
	

}
