package j0624;

public class Audio extends Product{
	private String speakerPower;
	private boolean power;  // iv - default값이 있음 bool: false
	Audio(){
		this("브릿지오디오",300000,3000,"30W");
	}
	Audio(String name, int price, int point, String speakerPower){
		super(name, price, point);
		this.speakerPower = speakerPower;
	}
	// 메서드 오버라이딩 
	public String toString() {  // String은 리턴이 string타입인메서드
		return super.toString()+ ", "+ speakerPower;
	}
	// 자식객체의 메서드 
	void powerOn() { // void는 리턴이없는 매서드 : return 생략가능
		power = true; 
	}
	void powerOff() {
		power = false;
	}

}
