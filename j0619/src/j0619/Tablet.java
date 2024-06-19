package j0619;
// Tablet - 자손클래스
//          자손클래스명 extends 부모클래스명 
public class Tablet extends Electronic {
	// 고유 속성만 선언해주면된다. 
	private boolean penFlag; // 펜 유무
	// 생성자 
	Tablet(){} // 다른생성자가 있을때는 기본생성자를 만들어주지 않으면 사용할 수 없다 
	// new Tablet("애플","프로3",2500000, true)
	Tablet(String brand, String name, int price, boolean penFlag){
		super(brand,name,price);
		this.penFlag = penFlag;
	}
	// 메서드오버라이딩 : 자손 클래스에 맞게 변경해서 사용
	public String toString() {
		
		return super.toString()+ ", penFlag=" + penFlag;
	}
	
	

}
