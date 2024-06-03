package j0603;

public class C0603_02 {

	public static void main(String[] args) {
		/*
		  1. 객체 :  속성 + 행동  ex) 사람.  배고픔, 식사하다  
		          변수 + 메소드 
		  자동차 
		  속성 : 크기, 색상, 엔진시동여부 
		  행동 : 시동을 걸다. 시동을 끄다.
		  2. 클래스 : 객체를 만드는 청사진.(붕어빵틀)
		  객체를 만들때 마다 새로운 정의를 하는것이 아니고 미리 정의해 놓은 클래스를 사용함.
		  클래스 안에 객체의 속성과 행위를 포함하고 있음 
		  3. 인스턴스
		  클래스에서 객체가 생성되는것을 실체화 라고 하며 이때 생성된 객체를 인스턴스라고 함. 
		 
		  - 클래스의 정의 
		  class 클래스이름[extends 부모클래스이름]{
		    변수
		    생성자
		    메소드
		  }
		  
		  - 객체생성 
		  1. 클래스 형의 변수를 선언한다
		  Time t1;
		  2. 객체를 생성한다
		  new Time();
		  3. 생성된 객체의 주소를 객체 변수에 대입한다
		  t1 = new Time();
		*/
		// 객체생성 
		Car myCar = new Car();
		// new 연산자로 객체를 생성하고 이름을 myCar로 지정함. 
		// Car는 클래스이름. Car()는 생성자. 
		// myCar는 Car라는 설계도에서 나오기때문에 그 변수인 color, size, engineState
		// 를 자동으로 가지게되며 3개의 메소드들도 포함한다. 
		myCar.color = "red"; 
		// 객체이름.변수  ( . 은 특정변수를 참조할때 사용)
		// 객체의 속성 중 color라는 변수에 빨강을 할당함.
		myCar.size = "compact";
		myCar.printAtt(); 
		// 객체이름.메소드();
		// engineState는 기본값 false가 저장되어있고 객체의 정보를 출력해줌. 
		myCar.startEngine(); 
		// myCar의 engineState를 변수의 상태에따라 꺼져있으면 킨 상태로 만든다. 
		myCar.printAtt(); 
		//  46번째 줄에서 상태를 변경했기 때문에 43번째 줄과는 다르게 나옴 
		myCar.stopEngine();
		// myCar의 시동을 끈 상태로 만든다
		myCar.printAtt(); 
		
		// newCar라는 객체를 생성. 검정색 suv 를 만들고 시동을 켜 주세요 
		
		Car newCar = new Car();
		newCar.color = "black";
		newCar.size = "suv";
		newCar.startEngine();  // 지금 시동을 킵니다.
		newCar.printAtt();
		//   색 : black, 크기 : suv    시동이 켜졌습니다.
		
		

	}

}
