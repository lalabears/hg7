package j0618;
import java.util.Scanner;
public class C0618_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0; 
		System.out.println("홍길동님이 로그인하셨습니다");
		Buyer hong = new Buyer("홍길동",50000, 0);
		loop: while(true) {
			System.out.println("[삼성플라자]");
			System.out.println("인기상품 세일");
			System.out.println("1. 75인치 smartTV"); // 얘만 완료
			System.out.println("2. 비스포크 냉장고");   // 얘랑 Ref 150 15
			System.out.println("3. 그랑데 세탁기");    // 얘랑 Wash 90 9
			System.out.println("4. 무풍 에어컨");      // 얘  Cond 120 12
			System.out.println("5. 보너스포인트전환");
			System.out.println("6. 금액충전");
			System.out.println("7. 구매상품리스트");
			System.out.println("8. 현재 보유금액 및 보너스포인트 조회");
			System.out.println("0. 종료");
			System.out.println("-------------------------------");
			System.out.println("원하는 번호를 선택하세요");
			choice = scan.nextInt();
			switch(choice) {
			case 1: 
				hong.buy(new TV()); // tv1대 구매 
				System.out.println("75인치 smartTV 구매완료");
				break; 
			case 2: 
				hong.buy(new Ref()); // 냉장고
				System.out.println("비스포크 냉장고 구매완료");
				break; 
			case 3: 
				hong.buy(new Wash()); // 세탁기
				System.out.println("그랑데 세탁기 구매완료");
				break; 
			case 4: 
				hong.buy(new Cond()); // 에어컨 
				System.out.println("무풍 에어컨구매완료");
				break; 
			case 5:
				System.out.println("현재 포인트 : "+ hong.bonusPoint);
				System.out.println("전환할 포인트를 입력해주세요 ");
				choice = scan.nextInt();
				if(hong.bonusPoint < choice) {
					System.out.println("입력하신값이 더 큽니다 다시 확인해주세요");
					break;
				}
				hong.bonusPoint -= choice; 
				hong.money += choice; 
				System.out.println("전환이완료되었습니다. ");
				break;
			case 6:
				System.out.println("충전하실 금액을 입력해주세요 ");
				choice = scan.nextInt();
				hong.money += choice; 
				System.out.println("충전금액 : " + choice);
				System.out.println("현재 보유 금액: "+ hong.money);
				break;
			case 7:
				System.out.println("구매상품리스트");
				hong.checkCart();
				break;
			case 8: // 현재 보유금액 및 보너스포인트 조회
				System.out.println("보유금액 : "+ hong.money);
				System.out.println("보유 포인트 : "+ hong.bonusPoint);
				break;
			case 0:
				System.out.println("프로그램 종료");
				break loop;
			}
		}

	}

}
