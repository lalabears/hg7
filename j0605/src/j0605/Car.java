package j0605;
public class Car {
	// 1. 변수
	String company ="현대자동차";
	String model;
	String color;
	int maxspeed; 
	// 2. 생성자 
	//  this()	  생성자. 같은 클래스의 다른생성자를 호출할때 사용함. 
	Car(){  // 기본생성자
		this("소나타","은색",250); // this()는 첫문장에서만사용가능
		/*this.model = "소나타";
		this.color = "은색"; 
		this.maxspeed = 250;*/
		
	} 
	Car(String model){
		this(model,"은색",250);
	}
	Car(String model, String color){
		this(model,color,250);
	}
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color; 
		this.maxspeed = maxspeed;
	}
	
}
