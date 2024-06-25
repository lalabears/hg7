package j0625;

import java.util.ArrayList;
import java.util.List;

public class C0625_01 {
	public static void main(String[] args) {
		Tank t = new Tank(); // 탱크1 객체 생성 
		// tank객체를 생성하면 150 hp 초기화
		System.out.println("탱크1 폭탄 맞음");
		t.hitPoint -= 10; 
		// 참조변수명.변수명 
		System.out.println("탱크1 폭탄 맞음");
		t.hitPoint -= 10; 
		System.out.println("탱크1 총알 맞음");
		t.hitPoint -= 2; 
		System.out.println("탱크1 체력: "+ t.hitPoint);
		
		// 객체hp를 변경할 수 있는 메서드를 가진객체  
		Scv s = new Scv();  
		Marine m = new Marine();
		// tank는 repariable를 구현함. 
		s.repair(t); // 탱크를 수리 
		System.out.println("탱크1 체력: "+ t.hitPoint);
		// s.repair(m); > marine은 repariable를 구현하지 않음
		
		// AirUnit의 자손 
		DropShip ds = new DropShip();
		System.out.println("드롭쉽1 총알 맞음");
		ds.hitPoint -= 20;
		System.out.println("드롭쉽1 체력: "+ ds.hitPoint);
		// 드롭쉽1 체력: 100
		s.repair(ds);
		System.out.println("드롭쉽1 체력: "+ ds.hitPoint);
		// 드롭쉽1 체력: 120

		// 인터페이스는 전혀 관련이 없는 탱크, 드랍쉽을 묶어서 
		// scv로 수리가 가능하게 만들어 주었다. 
		
		// unit: 할아버지
		// groundunit, airunit : 부모
		// marine, tank, dropship, scv : 자손 
		Unit[] group = new Unit[5];// 부모클래스 객체선언 
		// 다형성 
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new DropShip();
		group[3] = new Tank();
		group[4] = new Marine();
		
		for (int i = 0 ; i < group.length; i++) {
			group[i].move(100, 200);
		}
		
		List<Unit> u = new ArrayList<Unit>();
		u.add( new Marine() );
		u.add( new Tank() );
		u.add( new DropShip() );
		u.add( new Scv() );
		
		for (int i = 0 ; i < u.size() ; i++) {
			u.get(i).move(100, 200);
		}
		
		
		
		

	}

}
