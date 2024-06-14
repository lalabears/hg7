package j0614;
public class Tire {
	// iv
	public int maxRotation; // 타이어수명
	public int accumulatedRotation; // 누적회전수
	public String location; // 타이어의 위치 
	// 생성자 
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation ; this.location = location;
	}
	public boolean roll() {
		++accumulatedRotation; 
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "타이어 수명 : " +
						(maxRotation - accumulatedRotation )+"회");
			return true;
		}else {
			System.out.println(location + "타이어 펑크");
			return false;
		}
	}
}
