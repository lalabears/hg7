package j0619;
// Meat  - 메뉴를 상속받음
public class Meat extends Menu {
// 자손이기때문에 sell(int n) 메서드 구현해야지 객체를 생성 시킬 수있다.  
	
	private int perGram;
	//new Meat("냉삼", 12000, 160);
	Meat(){}
	Meat(String name, int price, int perGram ){
		super(name,price );//조상생성자 호출 
		this.perGram = perGram ; // 객체변수초기화 
	}
	// interface를 구현함. < public 
	public void sell(int n) {
		String str = "고기 :  "+super.getName()+" , 1인분 무게(g) :  "+perGram
				+", 주문 량 : "+n+" , 주문 가격 : "+(super.getPrice()*n);
		System.out.println(str);
		
	}
/*sell()호출시 출력 : sysout
고기 :  00 , 1인분 무게(g) :  00, 주문 량 : 00 , 주문 가격 : 00*/
}
