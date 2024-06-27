package j0627;
import java.util.*;
public class C0627_08 {
	// cv
	static Scanner scan = new Scanner(System.in);
	// method - main
	public static void main(String[] args) {
		Map<String, List<Food>> map = new HashMap<String, List<Food>>();
		loop: while(true) {
			System.out.println("이름을 알려주세요 : ");
			String name= scan.next(); 
			if( ! map.containsKey(name) ) {
				System.out.println("신규손님이시군요. 가입하시겠습니까? (y/n)");
				String ans = scan.next();
				if(ans.equalsIgnoreCase("y")) {
					List<Food> list = new ArrayList<Food>();
					map.put(name, list);
				}else {
					System.out.println("방문해주셔서 감사합니다");
					break loop;
				}
			} // if 이름이 맴에 없다면 
			loop2 : while(true) {
				System.out.println(" 1. 구매 ");
				System.out.println(" 2. 카트보기 ");
				System.out.println(" 3. 총액 계산하기  ");
				System.out.println(" 0. 종료 ");
				System.out.println("선택해주세요");
				int choice = scan.nextInt();
				switch(choice) {
				case 1:		
					buyFood(map, name);		
					break;
				case 2:     
					printCart(map, name);   
					break;
				case 3:
					int sum = calPrice(map, name); 
					System.out.println("총 금액은 : " + sum);
					break;
				case 0:
					System.out.println("이용해주셔서 감사합니다");
					break loop2;
					
				}
			}
			
		}// while - loop

	}// main
	static void buyFood(Map<String, List<Food>> map, String name) {
		List<Food> cart = map.get(name);
		while(true) {
			System.out.println("1. 과자구매 ");
			System.out.println("2. 음료구매 ");
			System.out.println("0. 종료 ");
			int ch = scan.nextInt();
			switch(ch) {
			case 1: 
				cart.add(new Snack());
//				System.out.println("과자이름, 가격 순으로 입력해주세요");
//				String str = scan.nextLine();
//				String[] strArr = str.split(" "); 
//				cart.add(new Snack(strArr[0], Integer.parseInt(strArr[1].trim()), false));
				break;
			case 2: 
				System.out.println("알콜 : 1 , 논알콜 : 2 ");
				int ans = scan.nextInt();
				switch(ans) {
				case 1: 
					cart.add(new Drink("맥주", 5000, true));
					break;
				case 2:
					cart.add(new Drink("우유",1500));
					break;
				}
				break;
			case 0: 
				System.out.println("장바구니에 담기 끝 ");
				return;
			}
		}
	}
	static void printCart(Map<String, List<Food>> map, String name) {
		// map .. key : name  > list : 	map.get(name) 
		for(Food f : map.get(name)) {
			System.out.println(f);
		}
//		for(int i =0; i < map.get(name).size() ; i++) {
//			System.out.println(map.get(name).get(i));
//		}
	}
	static int calPrice(Map<String, List<Food>> map, String name) {
		int sum = 0; 
		for(Food f : map.get(name)) {
			sum+= f.getPrice();
		}
		return sum;
	}
	
	

}// class

//static void buyFood(Map<String, List<Food>> map, String name) {
////		List<Food> a = new ArrayList<Food>();
////		List<Food> b = new ArrayList<Food>();
////		map.put(name, a); 
////		map.put(name, b); 
//	
////		List<Food> a = map.get(name);
//	map.get(name).add(new Drink());
//	map.get(name).add(new Drink("콜라", 3000));
//	map.get(name).add(new Snack());
//	map.get(name).add(new Snack("새우깡",2500,false));
//	System.out.println("장바구니에 담기 끝 ");
//}