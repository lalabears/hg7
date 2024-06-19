package j0619;
// Drink  - 메뉴를 상속받음
public class Drink extends Menu{
	public int size;
	Drink(){}
	Drink(String name, int price, int size ){
		super(name, price );//조상생성자 호출 
		this.size = size ; // 객체변수초기화 
	}
	// 메서드 구현. 오버라이딩. 
	public void sell(int n) {
		String str = "마실 것  :  "+super.getName()+" , 사이즈(ml) :  "+size
				+", 주문 량 : "+n+" , 주문 가격 : "+(super.getPrice()*n);
		System.out.println(str);
		
	}
/*sell()호출시 출력 : sysout
마실 것 :  00 , 사이즈(ml) :  00, 주문 개수 : 00 , 주문 가격 : 00*/
}
