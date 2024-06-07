package j0607;

public class Car {
	String color; 
	String gearType; 
	int door; 
	// 생성자는 클래스명과 이름이 같고 return이 없다. 
	Car(){      //기본생성자
		this("white","auto",4); // 다른생성자 호출시 사용하는 this()
	}
	Car(Car c){
		this(c.color, c.gearType, c.door);
	}
	Car(String color, String gearType, int door){
		this.color = color;       // 객체 자신을 가리키는 this
		this.gearType = gearType;
		this.door = door; 
	}

}
