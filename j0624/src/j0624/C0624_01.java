package j0624;
import java.util.*;
public class C0624_01 {
	// main -> 클래스 메서드 이기때문에 클래스 변수만 사용할 수 있음.
	static Scanner scan = new Scanner(System.in);
//	static int count; // 산 물건 개수를 저장하는 변수 
	public static void main(String[] args) {
	/* 객체지향 - 프로그래밍에서 필요한 데이터를 추상화시켜 
	            상태와 행위를 가진 객체를 만들고 
	            그 객체간 상호작용을 통해 로직을 구성하는 프로그래밍방법
	   객체 - 값을 저장할 수 있는 변수와 작업을 수행 할 메소드들을 묶어만든것
	   추상화, 캡슐화, 상속, 다형성의 특징을 가짐 */
		System.out.println("[온라인 전자 쇼핑몰]");
		String id = "aaa"; 
		String name = "홍길동"; 
		String pw = "1111";
		// buyer 객체 생성 
		Buyer hong = new Buyer(id,name); 
		int choice = 0 ; 
		loop: while(true) {
			System.out.println("[온라인 전자 쇼핑몰]");
			System.out.println("1. TV");
			System.out.println("2. 오디오");
			System.out.println("3. 세탁기");
			System.out.println("7. 현재잔액조회");
			System.out.println("8. 구매목록");
			System.out.println("9. 금액충전");
			System.out.println("0. 프로그램종료");
			System.out.println("=====================");
			System.out.println("번호선택 : ");
			choice = scan.nextInt();
			switch(choice) {
			case 1: 
				productBuy("Tv", hong);
				break;
			case 2: 
				productBuy("오디오", hong);
				break;
			case 3: 
				productBuy("세탁기", hong);
				break;
			case 7: // 잔액조회
				System.out.println("[잔액 조회]");
				System.out.printf("%s님의 잔액: %d, 포인트: %d",hong.name,hong.money, hong.point);
				System.out.println();
				break;
			case 8: // 구매목록
				System.out.println("[구매 목록]");
				for(int i = 0; i< hong.pList.size(); i++) {
					System.out.print( hong.pList.get(i).getName()+" ");
				}
//				for(int i = 0; i <count ; i ++) {
//					System.out.print(hong.cart[i].getName() +" ");
//				}
				System.out.println();
				break; 
			case 9: // 금액충전
				System.out.println("[금액 충전]");
				System.out.println("충전하실 금액을 입력해주세요 ");
				int addmoney = scan.nextInt();
//				int bmoney = hong.getMoney(); 
//				bmoney += addmoney;
//				hong.setMoney(bmoney)
				hong.money += addmoney; 
				System.out.println("-----------------------");
				System.out.printf("충전금액: %d\n",addmoney);
				System.out.printf("충전 후 잔액: %d\n",hong.money);
				
				break;
			case 0: // 프로그램 종료
				break loop;
			
			}// switch
		}// while
	} // main
	
	static void productBuy(String pName, Buyer b) {
		System.out.printf("[%s 구매] \n", pName);
		System.out.println("결재를 진행하시겠습니까?");
		System.out.println("1. 예  2. 아니오 ");
		int choice = scan.nextInt();
		if(choice == 1) { // 결재 진행
			int ck = 0;
			if(pName.equals("Tv")) {
				ck = b.buy(new Tv()); 
			}else if(pName.equals("오디오")) {
				ck = b.buy(new Audio()); 
			}else if(pName.equals("세탁기")) {
				ck = b.buy(new Washer()); 
			}
			if(ck==0) return ;  // 구매가 진행되지 않음. 메서드종료.
			System.out.printf("%s를 구매하셨습니다\n",pName);
			System.out.printf("구매후 잔액: %,d원 \n",b.money );
//			count++; //물건하나샀으니 한개 추가
		}else { // 결재를 진행하지 않음
			System.out.printf("%s 구매를 취소하셨습니다 \n", pName);
		}
	}
}
