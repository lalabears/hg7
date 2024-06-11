package j0611;
public class Car {
	static int carNo; // 자동적으로 0으로 기본값
	int cNo; 
	String color; 
	String gearType; 
	int door; 
	{  // 초기화블럭 
		carNo++; 
	}
	// 생성자 
	Car(){  // 기본생성자 
		cNo = carNo; 
	}
	Car(String color, String gearType, int door){
		cNo = carNo; 
		this.color = color; this.gearType = gearType; this.door = door;
	}
	Car(Car c){ // this()는 첫줄에 사용해야함
		this(c.color, c.gearType, c.door); // this()는 생성자를 말함. 
		cNo = carNo;
	}

}
