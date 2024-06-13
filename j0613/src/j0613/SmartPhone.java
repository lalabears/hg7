package j0613;
// 상속 
//     class  자식클래스   extends 부모클래스 
public class SmartPhone extends CellPhone {
	int capacity; // 폰용량 
	//생성자 
	SmartPhone(){super();}  // super(), this() 는 맨 윗줄에 사용해야함
	// this, super 자기자신을 의미. super> 조상이 있을 때 조상을의미함 
	SmartPhone(String model, String color, int capacity){
		//this.model = model; this.color = color; 
		// super.model = model; super.color = color;
		super(model,color); // 조상의 생성자
		this.capacity= capacity;
	}
	// 메서드 오버라이딩 
	// 부모클래스와 같은 선언부를 가지고 있음.
	// 선언부는 부모랑같고 구현부는 자식의 특성에 맞게 고쳐서 사용할 수 있음. 
	void printAttr() {
		System.out.println("폰 모델: "+model+", 색: "+color +", 용량 :"+capacity );
	}
	
	void downloadApp(int appcapacity) {
		System.out.println(appcapacity+"GB 어플을 다운받습니다..");
		this.capacity -= appcapacity;
		System.out.println("현재 폰 잔여 용량은 : "+ this.capacity);
	}
	void deleteApp(int appcapacity) {
		System.out.println("어플을 삭제합니다..");
		this.capacity += appcapacity;
		System.out.println("현재 폰 잔여 용량은 : "+ this.capacity);
	}
	
	
}
