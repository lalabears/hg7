package j0627;
import java.util.*;
public class C0627_09 {
	public static void main(String[] args) {
		List<Cafe> m1 = new ArrayList<>();
		m1.add(new Americano());		m1.add(new Americano());
		List<Cafe> m2 = new ArrayList<>();
		m2.add(new Americano());		m2.add(new Latte());
		Map<String,List<Cafe>> map1 = new HashMap<>();
		map1.put("강백호", m1);
		map1.put("홍길동", m2);
		map1.put("강백호", m2);  
		// map은 키가 중복될경우 나중에 입력된 값으로 덮어씀 	
		for(Cafe c: map1.get("강백호")) {
			System.out.println(c.getName()+c.getPrice());
		}
		Member kang = new Member("강백호",0); 
		Member seo = new Member("서태웅",0); 
		Member kang1 = new Member("강백호",0); 
		Map<Member,List<Cafe>> map2 = new HashMap<>();
		map2.put(kang, m1);
		map2.put(seo, m2);
		map2.put(kang1, m2);
		
		for(Member m : map2.keySet()) {
			int total = 0; 
			//System.out.println(m.name + " : " + map2.get(m));
			System.out.println(m.name);
			for(Cafe c : map2.get(m)) {
				System.out.print(c.getName()+" ");
				total += c.getPrice();
			}
			System.out.println();
			// 가격의 총합을 출력해보세요 
			System.out.println(total);
		}
		List<Food> list = new ArrayList<Food>(); 
		list.add(new Drink());
		list.add(new Snack());
		list.add(new Drink("콜라", 2500));
		list.add(new Snack("하리보", 2500, true));
		List<Food> list2 = new ArrayList<Food>(); 
		list2.add(new Drink("콜라", 3000) );
		list2.add(new Drink("맥주", 4000, true));
		list2.add(new Snack("새우깡",2500,false));
		List<Food> list3 = new ArrayList<Food>();
		list3.add(new Drink("사이다",2500));
		list3.add(new Snack("스윙칩",2500,false));
		// Member 3명의 리스트를 담은 map을 만들어서
		// 강백호: 00 원 구매 
		// 서태웅 : 00 원구매
		// 강백호 : 00원 구메
		Map<Member, List<Food>> map3 = new HashMap<Member, List<Food>>();
		map3.put(kang1, list2);	map3.put(kang, list);	map3.put(seo, list3);
		
		for(Member m : map3.keySet()) {
			// key의 이름
			System.out.println(m.name);
			// key의 value는 list : map3.get(m)
			//System.out.println(map3.get(m));
			int sum = 0 ;
			for(Food f : map3.get(m)) {
				// System.out.println(f.getName());
				// System.out.println(f.getPrice());
				sum += f.getPrice();
			}
			System.out.println(sum);
			
		}
		
		
		
		
		
	}
}
