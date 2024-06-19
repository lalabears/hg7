package j0619;
// Desktop - 자손클래스
public class Desktop extends Electronic {
	private String graphic; // 그래픽 제조사
	Desktop(){}
	Desktop(String brand, String name, int price, String graphic){
		super(brand,name,price);
		this.graphic = graphic;
	}
	public String toString() {
		return super.toString()+ ", graphic=" + graphic;
	}
	
}
