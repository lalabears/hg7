package j0627;
import java.util.*;
public class C0627_06 {
	public static void main(String[] args) {
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
		Map<String, List<Food>> map = new HashMap<String, List<Food>>();
		map.put("강백호", list);
		map.put("서태웅", list2);
		map.put("채수연", list3);	
		// 1. key > 이름 출력하기  
		for(String key: map.keySet()) {
			System.out.println(key);
		}
		// 2. key : value 출력하기 
		for(String key: map.keySet()) {
			System.out.println(key +" : " + map.get(key));
			//                 key            list<food>
			//                 String       food, food, food.. 
		}
		//강백호 : [이름: 물, 가격 : 1000, 술? false, 이름: 초코파이, 가격 : 500, 단거? true, 이름: 콜라, 가격 : 2500, 술? false, 이름: 하리보, 가격 : 2500, 단거? true]
		// 3. 강백호 구매목록 이름만 출력하기
		List<Food> listKang = map.get("강백호"); 
		for(int i = 0; i < listKang.size(); i++) {
			System.out.println(listKang.get(i).getName());
		}
		for(Food f :  map.get("강백호") ) {
			System.out.println(f.getName());
		}
		// 4. 전체 사람의 구매목록 이름만 출력하기 
		for(String key: map.keySet()) {
			// key : 사람이름, value :  리스트 map.get(key)
			System.out.print(key+ " : ");
			for(Food f : map.get(key)) {
				System.out.print(f.getName()+ " ");
			}
			System.out.println();
		}
		// 강백호 : 물 초코파이 콜라 하리보 
		// 서태웅 : 콜라 맥주 새우깡 
		// 채수연 : 사이다 스윙칩 

		
		
		
	}

}
