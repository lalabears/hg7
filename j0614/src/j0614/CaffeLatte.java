package j0614;
public class CaffeLatte extends Coffee {
	// iv
	String milk; 
	// 생성자
	public CaffeLatte() {
		super(5000);
		milk = "우유";
	}
	// 메서드 오버라이딩 : 부모도 같은 메서드를 가지고있음
	public void printInfo() {
		System.out.println(milk+" 카페라떼: "+ price);
	}
	public void changeMilk(String milk) {
		this.milk = milk;
		System.out.println("우유를 "+milk+"로 변경");
	}

}
