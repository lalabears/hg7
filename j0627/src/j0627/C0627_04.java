package j0627;
import java.util.*;
public class C0627_04 {
	public static void main(String[] args) {
		Food d1 = new Drink();
		System.out.println(d1);
		Drink d2 = new Drink("콜라", 3000);
		System.out.println(d2);
		Drink d3 = new Drink("맥주", 4000, true);
		System.out.println(d3);
		Food s1 = new Snack();
		System.out.println(s1);
		Snack s2 = new Snack("새우깡",2500,false);
		Map<Integer, Food> map = new HashMap<Integer, Food>();
		map.put(1, d1);
		map.put(2, new Drink("우유", 2500));
		map.put(3, s1);
		map.put(4, s2);
		map.put(5, d3); 
		// 다음과 같이 출력해보세요 
		
		for(int i : map.keySet()) {
			System.out.println(i + " : " + map.get(i).getName());
		}
		
		// map에들어있는 제품의 총 가격을 출력해주세요 
		int sum =0 ; 
		for(int i : map.keySet()) {
			sum += map.get(i).getPrice();
		}
		System.out.println(sum); // 10500
		
		Map<String, Food> map2 = new HashMap<String, Food>();
		map2.put("A", d1);
		map2.put("B", new Drink("우유", 2500));
		map2.put("C", s1);
		map2.put("D", s2);
		map2.put("E", d3);  
		
		// A : 물  /   B : 우유 ..
		// 총합 : 10500
		for(String i : map2.keySet()) {
			System.out.println(i + " : " + map2.get(i).getName());
		}
		sum =0 ; 
		for(String i : map2.keySet()) {
			sum += map2.get(i).getPrice();
		}
		System.out.println(sum); // 10500
		
		//-------------------------------------- 
		List<Food> cart1 = new ArrayList<Food>();
		cart1.add(d1); cart1.add(s2); cart1.add(new Drink("카스제로",3000,true));
		List<Food> cart2 = new ArrayList<Food>();
		cart2.add(s1); cart2.add(d2); cart2.add(new Snack("포카칩",3500,false));
		
		System.out.println(cart1);
		System.out.println(cart2);
		
		// cart1에 들어있는 품목들의 총액을 구해보세요 
		int t1 = 0;
		System.out.println("cart1 ");
		for(int i =0 ; i < cart1.size(); i++) {
			System.out.println(cart1.get(i).getName() 
					+ cart1.get(i).getPrice() );
			t1+=cart1.get(i).getPrice();
		}
		// cart2에 있는 품목의 총액을 구하기 
		int t2 = 0;
		System.out.println("cart2 ");
		for(Food f: cart2 ) {
			System.out.println(f.getName() + f.getPrice());
			t2 += f.getPrice();
		}
		
		System.out.println("cart1: "+ t1);
		System.out.println("cart2: "+ t2);

		Map <String, List<Food>> listMap = new HashMap<String, List<Food>>();
		listMap.put("홍길동", cart1);
		listMap.put("강백호", cart2);
		
		// 홍길동씨의 장바구니속 물건들의 합은 어떻게 구할까요 .. ?  
		String keeey = "홍길동";
		List<Food> tmp = listMap.get(keeey);
		int total = 0;
		for(Food f: tmp) {
			total += f.getPrice();
		}
		// listMap안에 있는 사람들으 ㅣ장바구니의 합을 for문을 사용해서 구해보세요
		// 출력 : 홍길동 00원
		//       강백호 00원
		
		//Map <String, List<Food>> listMap  
		for(String key :  listMap.keySet() ) {
			// System.out.println( key );
			// System.out.println(listMap.get(key));
			List<Food> a = listMap.get(key);
			int t = 0;
			for(Food f: a) {
				t += f.getPrice();
			}
			System.out.println(key + " : " + t );
			//  강백호 : 7000
		    //	홍길동 : 6500
		}
		
		
		//
		Map<String, Integer> member = new HashMap<String, Integer>();
		member.put("홍길동", 22);
		member.put("강백호", 20);
		member.put("짱구", 5);
		// member의 key 출력하기 
		for(String key : member.keySet()) {
			System.out.println(key + " : " + member.get(key));
		}
		
		// 홍길동 : 22  강백호 : 20  짱구  : 5
		
		
		
		
		
		
		
		
		
	}

}
