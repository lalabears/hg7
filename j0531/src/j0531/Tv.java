package j0531;

//    클래스명은 대문자로 시작함. 
public class Tv {
	
	// 변수명은 소문자로 시작함.  : 명사로 만듦.
	String color; 
	boolean power; // 디폴트 : false 
	int channel; // 디폴트 : 0 
	int volume = 10 ; 
	// ()가 있으면 메서드. 메서드는 주로 동사로만듦.
	void power() {
		power = !power; 
	}
	void channelUp() {
		if(channel > 99) channel = 1; 
		channel++; 
	}
	void channelDown() {
		channel--;
		if( channel < 0 ) {
			channel = 99;
		}
	}
	void volumeUp() {
		if(volume >=30) {
			volume = 30 ;
			return; 
		}
		volume++; 
	}
	void volumeDown() {
		if(volume<=0) {
			volume = 0; 
			System.out.println("소리는 0 이하로 내려가지 않습니다.");
			return;
		}
		volume--;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	클래스 : 객체를 정의 해 놓은것 
	클래스 용도 : 객체를 생성하는데 사용

	객체 : 실제로 존재하는 것. 사물 또는 개념 
	객체의 용도 : 객체가 가지고 있는 기능과 속성에 따라 다름. 
	
	클래스가 설계도라고 한다면 객체는 그 제품을 뜻함. 
	클래스 : 붕어빵 기계      객체: 그 기계로 찍어낸 붕어빵. 
	
	객체 > 속성(변수) + 기능(매서드)  
	하나의 클래스로부터 여러개의 인스턴스(객체)를 생성할 수 있음.
	생성된 인스턴스는 독립 메모리 공간에 저장된 자신만의 변수를 가질 수 있다.
	그러나 해당 클래스의 모든 메소드는 해당 클래스에서 생성된 인스턴스가 공유함   
	
	인스턴스 : 클래스로부터 객체를 선언하는 과정을 인스턴스 화 라고하며.
	         클래스타입의 객체를 인스턴스라고함. 
	         즉, 메모리에 할당된 객체 
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

class Tv2 {
	
	

} // 소스파일의 이름은 public class 이름 과 일치해야함. 
class Tv4 {
	
	// 하나의 소스코드에 다른 클래스를 추가해도 문제 없이 사용할 수 있다
	// 가능하면 하나의 소스파일에는 한개의 클래스만 작성하시는것이 좋습니다. 
	// 하나의 소스파일에는 하나의 퍼블릭클래스만 있어야한다. 
}
class Tv3{}

// 퍼블릭 클래스가 없다면 파일이름은 어떠한 것이 되어도 상관없다(오류가 없다)

// 파일이름과 클래스이름이 불일치하면 이클립스에서 실행을 시켜주지 못한다. 


