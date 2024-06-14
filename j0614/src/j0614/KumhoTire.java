package j0614;
public class KumhoTire extends Tire{
	// 부모(Tire)부터 상속받음. 부모의 모든멤버를 가지고 있음 
	KumhoTire(String location, int maxRotation){
		super(location, maxRotation); // 부모의 생성자를 호출함
	}
	// 메서드의 오버라이딩  
	public boolean roll() {
		++accumulatedRotation; 
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "금호 타이어 수명 : " +
						(maxRotation - accumulatedRotation )+"회");
			return true;
		}else {
			System.out.println(location + "금호 타이어 펑크");
			return false;
		}
	}
	
}
