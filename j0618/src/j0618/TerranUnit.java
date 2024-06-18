package j0618;
// 유닛
public class TerranUnit {
	int hitPoint;
	final int MAX_HP; 
	TerranUnit(int hp){
		// 상수는 생성자에서 초기화 시킬 수 있습니다. 
		MAX_HP = hp;
	}
}
// 지상유닛      : 테란유닛으로 상속받은 클래스 
class GroundUnit extends TerranUnit{
	// 생성자 
	public GroundUnit(int hp) {
		super(hp); // 테란유닛생성자 호출 
	}
}
// 공중유닛     : 테란유닛으로 상속받은 클래스 
class AirUnit extends TerranUnit{
	public AirUnit(int hp) {   // 생성자 
		super(hp); // 테란유닛생성자 호출 
	}
}
// 탱크: 지상유닛으로부터 상속받음. 
class Tank extends GroundUnit implements Repairable{
	public Tank() { // 기본생성자 
		super(150);   // GroundUnit의 생성자 호출 
		hitPoint = MAX_HP; // GroundUnit의 조상 TerranUnit의 멤버
	}
	public String toString() { // object method 오버라이딩
		return "Tank";
	}
}
// 드랍쉽 : 공중유닛 소속 
class DropShip extends AirUnit implements Repairable{
	public DropShip() {
		super(125);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "DropShip";
	}
}
// 마린 : 지상유닛 상속 
class Marine extends GroundUnit{
	public Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}
// SCV : 지상유닛 상속 - 수리하는 애 
class SCV extends GroundUnit implements Repairable{
	public SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	// 수리매서드 : 매개변수로 Repairable을 구현
	void repair(Repairable repairable) {
		// Repairable에 정의된것은 아무것도 없다. 
		if ( repairable instanceof TerranUnit ) {
			// hitPoint, MAX_HP사용을 위해서는 형변환이 필요함 
			TerranUnit unit = (TerranUnit) repairable; 
			// 현재체력이 최대체력과 같아질때까지 체력을 증가시켜야함. 
			while(unit.hitPoint != unit.MAX_HP) {
				unit.hitPoint++;
			}
			System.out.println(unit + "수리가 완료되었습니다. ");
		//	System.out.println(unit.toString() + "수리가 완료되었습니다. ");
		}
	}
}

