package j0626;
import java.util.*;
public class C0626_03 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int choice ; 
		List<Cafe> list = new ArrayList<Cafe>();
		loop: while(true) {
			System.out.println("[주문하기]");
			System.out.println("1.아메리카노 주문");
			System.out.println("2.라떼 주문");
			System.out.println("3.주문 목록 보기");
			System.out.println("4.총 주문 금액 보기");
			System.out.println("0.종료");
			System.out.println("----------------");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				orderAme(list);
				break;
			case 2:
				orderLatte(list);
				break;
			case 3:
				printOrderList(list);
				break;
			case 4: 
				int price = CalPrice(list);
				System.out.println("총 주문금액은 : "+ price);
				break;
			case 0:
				System.out.println("종료합니다");
				break loop;
					
			}// switch
		}// while
	}// main
	static void orderAme(List<Cafe> c) {
	//	1. 주문만 받는다. > 정말주문하겟습니까? 예 아니오 옵션줘서 추가하거나말거나
	//  2. 샷을 추가할껀지 묻고 거기에 대응 
		System.out.println("아메리카노를 주문하시겠습니까 ? (y:yes n:no) ");
		String str = scan.next();
		if(str.equalsIgnoreCase("y")) {  // 주문을 한다면 
			System.out.println("기본 2샷입니다 추가하시겠습니까? (y, n)");
			str = scan.next();
			Americano a1 = new Americano();
			if(str.equalsIgnoreCase("y")) {  // 샷을 추가한다면 
				System.out.println("추가할 샷의 수를 입력해 주세요 ");
				int n = scan.nextInt();
				a1.addShot(n);
			}
			// c.add( new Americano() ); > 기본아메리카노를 추가  
			c.add(a1);  // 기본아메리카노를 리스트에 추가하기 
			System.out.println("아메리카노 주문이 완료되었습니다. ");
		}
		else {
			System.out.println("주문이 취소되었습니다. ");
		}
	}
	static void orderLatte(List<Cafe> c) {
    // 1. 주문만 받는다. > 정말주문하겟습니까? 예 아니오 옵션줘서 추가하거나말거나
	// 2. 우유변경할건지 묻고 대응
		System.out.println("라떼를 주문하시겠습니까 ? (y:yes n:no) ");
		String str = scan.next();
		if(str.equalsIgnoreCase("y")) {
			System.out.println("기본은 우유입니다, 우유를 변경하시겠습니까? (y,n)");
			str = scan.next();
			Latte l1 = new Latte();
			if(str.equalsIgnoreCase("y")) {  // 우유를 변경한다면 
				System.out.println("변경할 우유를 입력해주세요  ");
				str  = scan.next();
				l1.changeMilk(str);
			}
			c.add(l1);
			System.out.println("라떼 주문이 완료되었습니다. ");
		}
		else {
			System.out.println("주문이 취소되었습니다. ");
		}
	}
	static void printOrderList(List<Cafe> order) {
		System.out.println("주문하신 품목은 : ");
		for(int i = 0 ; i < order.size() ; i++) {
			System.out.println(order.get(i));
		}
	}
	static int CalPrice(List<Cafe> c) {
		int sum=0;
		for( int i = 0 ; i < c.size(); i++) {
			sum = sum + c.get(i).getPrice();
		}
		return sum;
	}
	

}
