package j0614;

public class Coffee {
	// 멤버변수 중 iv
	int price; 
	boolean hot = true;
	// 생성자 
	Coffee(){}
	public Coffee(int price) {
		this.price = price; 
	}
	
	// 메서드 
	public void printInfo() {
		System.out.println("커피가격: "+ price);
	}
	public void setIce() {
		hot = false;
		System.out.println("아이스커피");
	}
	public void setHot() {
		hot = true;
		System.out.println("뜨거운커피");
	}

}
