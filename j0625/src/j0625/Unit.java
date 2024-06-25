package j0625;
//     추상클래스 
public abstract class Unit {
	int x, y; 
	String name;
	int hitPoint; // 체력
	final int MAX_HP; // 최대체력
	Unit(int hp){ 
		MAX_HP = hp;      // 상수는 초기화해서 사용해야하는데
		                  // 생성자에서 초기화할 수 있다. 
	}
	// 추상메서드
	abstract void move(int x, int y);
	void stop() {
		System.out.println("정지함");
	}
}
// 추상클래스                상속    추상클래스
abstract class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
	// 추상메드스 move를 구현하지 않아서 추상클래스로 선언함 
}
// GroundUnit을 상속을 받고, Repariable 구현한 클래스 
class Tank extends GroundUnit implements Repariable{
	Tank(){
		super(150); // 객체선언시 체력을 150으로 만들어줌 
		hitPoint = MAX_HP;		name = "tank" ;
	}
	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",
				name,x,y);
	}
}
//GroundUnit을 상속받은 클래스 
class Marine extends GroundUnit{ 
	Marine(){
		super(60); hitPoint = MAX_HP;	name = "marine" ;
	}
	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",
				name,x,y);
	}
}
class Scv extends GroundUnit implements Repariable{
	Scv(){
		super(40); hitPoint = MAX_HP;	name = "scv" ;
	}
	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",
				name,x,y);
	}
	void repair(Repariable g) {
		if(g instanceof Unit) {
			Unit u = (Unit)g;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
		}
	}
}
class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",
				name,x,y);		
	}
}
class DropShip extends AirUnit implements Repariable{
	DropShip() {
		super(120); hitPoint = MAX_HP;	name = "dropship" ;
	}
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",
				name,x,y);		
	}
}









