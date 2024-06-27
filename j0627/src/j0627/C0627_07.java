package j0627;
import java.util.*;
public class C0627_07 {
	public static void main(String[] args) {
		// 1. Americano, Latte 객체를 하나씩 생성해보세요 
		Americano a = new Americano();
		Latte l = new Latte(); 
		
		// 2. Map 을 한개 만들어서 강백호는 아메리카노 서태웅은 라떼를 담아보세요 
		Map<String, Cafe> map = new HashMap<String, Cafe>();
		map.put("강백호",	a);
		map.put("서태웅", l);
		
		// 3. map 출력으로 강백호 : 아메리카노  /  서태웅 : 라떼 
		for(String key : map.keySet()) {
			System.out.println(key +" : " + map.get(key).getName());
		}// for=key	
		// 강백호 : 아메리카노 서태웅 : 카페라떼
		// list : index가 있고, 순서가 있다. 
		List<Cafe> m1 = new ArrayList<Cafe>();
		List<Cafe> m2 = new ArrayList<Cafe>();
		// m1, m2 3-4개씩 메뉴를 담아보세요
		m1.add(new Americano());		m1.add(new Americano());
		m1.add(new Americano());		m1.add(new Latte());
		m2.add(new Latte()); m2.add(new Latte()); m2.add(new Americano());
		// 리스트 메뉴 출력하기 
		System.out.println(m1);
		for(Cafe c : m1 ) {
			System.out.print(c.getName()+ " ");
		}System.out.println();
		for(Cafe c : m2 ) {
			System.out.print(c.getName()+ " ");
		}System.out.println();
		// 리스트에 들은 커피가격의 합계구하기 
		int sum1 = 0; 
		for(Cafe c : m1 ) {
			sum1 += c.getPrice();
		}
		int sum2 = 0; 
		for(Cafe c : m2 ) {
			sum2 += c.getPrice();
		}
		Map<String, List<Cafe>> guest = new HashMap<String, List<Cafe>>();
		// 강백호> m1, 서태웅은 m2 
		guest.put("강백호", m1); 	guest.put("서태웅", m2);
		// key 즉, 이름 출력하기 
		for(String s : guest.keySet()) {
			System.out.println(s);
		}
		// key : value 출력하기 (전체)
		for(String s : guest.keySet()) {
			System.out.println(s + " : " + guest.get(s));
		}
		// 강백호가 내야하는 총금액, 서태웅이 내야하는 총 금액 출력해보기 
		
		for(String s : guest.keySet()) {
			// s: 이름 
			// guest.get(s) : 리스트 
			System.out.print(s +" : " );
			int sum = 0;
			for(Cafe c : guest.get(s)) {
				sum += c.getPrice();
			}
			System.out.println(sum);
		}
	//	강백호 : 11000
	//	서태웅 : 9500

		
		
		

		
	}

}
